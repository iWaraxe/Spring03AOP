package com.coherentsolutions.aop.section05.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecureTransactionAspect {

    @Pointcut("within(com.coherentsolutions.aop.section05.demo.service.payment..*)")
    private void paymentServiceLayer() {}

    @Pointcut("@annotation(org.springframework.transaction.annotation.Transactional)")
    private void transactionalOperation() {}

    @Pointcut("paymentServiceLayer() && transactionalOperation()")
    public void secureTransaction() {}

    @Before("secureTransaction()")
    public void performSecurityCheck(JoinPoint joinPoint) {
        System.out.println("Security check passed for: " + joinPoint.getSignature().getName());
    }
}
