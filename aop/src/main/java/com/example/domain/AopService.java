package com.example.domain;

import com.example.global.config.aop.encrypt.Encrypt;
import com.example.global.config.aop.encrypt.EncryptType;
import org.springframework.stereotype.Service;

@Service
public class AopService {

  @Encrypt
  public String encryptAop(String value) {
    return value;
  }

  @Encrypt(encryptType = EncryptType.DECRYPT)
  public String decryptAop(String value) {
    return value;
  }
}
