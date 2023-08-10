package com.example.global.config.aop.logger;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Logger AOP
 *
 * @author : FeelingXD
 */
@Component
@Aspect
@Slf4j
public class LoggingAspect {

  @Before("@annotation(com.example.global.config.aop.logger.CustomLogger)")
  public void logBeforeExecution(JoinPoint joinPoint) {
    log.warn("start :" + System.currentTimeMillis());
  }

  @After("@annotation(com.example.global.config.aop.logger.CustomLogger)")
  public void logAfterExecution(JoinPoint joinPoint) {
    log.warn("end :" + System.currentTimeMillis());
  }

}
