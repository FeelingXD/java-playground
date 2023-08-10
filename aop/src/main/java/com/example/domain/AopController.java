package com.example.domain;

import com.example.global.config.aop.encrypt.Encrypt;
import com.example.global.config.aop.encrypt.EncryptType;
import com.example.global.config.aop.logger.CustomLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("aop")
public class AopController {

  private final AopService aopService;
  @GetMapping
  @CustomLogger
  public ResponseEntity<?> testAop(){
    return ResponseEntity.ok("ok test");
  }
  @GetMapping("/encrypt")
  public ResponseEntity<?>testEncrypt(@RequestParam String id){
    String result=aopService.encryptAop(id);
    return ResponseEntity.ok(result);
  }
  @GetMapping("/decrypt")
  public ResponseEntity<?>testDecrypt(@RequestParam String id){
    String result=aopService.decryptAop(id);
    return ResponseEntity.ok(result);
  }


}
