package com.example.global.config.aop.encrypt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Encrypt {
  public String secretKey() default "secret";
  public EncryptType encryptType() default EncryptType.ENCRYPT;
}
