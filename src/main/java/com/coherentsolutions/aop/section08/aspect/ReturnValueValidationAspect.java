package com.coherentsolutions.aop.section08.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ReturnValueValidationAspect {

    @AfterReturning(pointcut = "execution(* com.coherentsolutions.aop.section08.service.*.*(..)) " +
            "&& @annotation(com.coherentsolutions.aop.section08.annotations.ValidateReturn)",
            returning = "result")
    public void validateReturnValue(Object result) {
        if (result instanceof Integer && (Integer) result < 0) {
            throw new IllegalArgumentException("Validation failed for return value: " + result);
        }
    }
}
