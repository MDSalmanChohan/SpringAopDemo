package com.example.SpringAopDemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.aopdemo.service.*.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        System.out.println("Executing method: " + joinPoint.getSignature());
    }

    @After("execution(* com.example.aopdemo.service.*.*(..))")
    public void logAfterMethod(JoinPoint joinPoint) {
        System.out.println("Method executed: " + joinPoint.getSignature());
    }
}

