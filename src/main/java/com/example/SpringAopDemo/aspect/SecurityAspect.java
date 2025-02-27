package com.example.SpringAopDemo.aspect;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Around("execution(* com.example.aopdemo.service.UserService.getUserById(..))")
    public Object checkUserAuthentication(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        String userId = (String) args[0];

        if (!"1".equals(userId)) {
            throw new SecurityException("Access Denied: Unauthorized User!");
        }

        return joinPoint.proceed();
    }
}

