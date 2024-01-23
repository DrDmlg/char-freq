package com.example.charfreq.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.example.charfreq.controllers.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        log.debug("Method {} with parameters {} will execute", methodName, Arrays.asList(arguments));

        Object returnedByMethod = joinPoint.proceed();

        log.debug("Method execute and returned: {}", returnedByMethod);

        return returnedByMethod;
    }
}