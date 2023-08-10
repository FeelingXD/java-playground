package com.example.global.config.aop.encrypt;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Aspect
public class EncryptAspect {

  private static String DEFAULT_SECRET = "happyprogrammer!";

  @Around("@annotation(encrypt)")
  Object proceed(ProceedingJoinPoint joinPoint, Encrypt encrypt) throws Throwable {
    String[] args = new String[joinPoint.getArgs().length];
    if (encrypt.encryptType() == EncryptType.ENCRYPT) {
      args[0] = encrypt(joinPoint, encrypt);
    } else {
      args[0] = decrypt(joinPoint, encrypt);
    }
    return joinPoint.proceed(args);
  }

  public String encrypt(ProceedingJoinPoint joinPoint, Encrypt encrypt) {
    String secret = "".equals(encrypt.secretKey()) ? DEFAULT_SECRET : encrypt.secretKey();
    return joinPoint.getArgs()[0] + secret;

  }

  public String decrypt(ProceedingJoinPoint joinPoint, Encrypt encrypt) {
    String secret = "".equals(encrypt.secretKey()) ? DEFAULT_SECRET : encrypt.secretKey();
    String tmp = (String) joinPoint.getArgs()[0];
    return tmp.replace(secret, "");
  }

}
