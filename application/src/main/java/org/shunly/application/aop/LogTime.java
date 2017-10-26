package org.shunly.application.aop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LogTime {
    public static Logger logger = LogManager.getLogger(LogTime.class);

    //定义切点，用于复用
    @Pointcut("execution(* org.shunly.application.controller..*.*(..))")
    public void pointCut() {

    }

    //环绕式增强，复用切点，必须引入参数ProceedingJoinPoint
    @Around("pointCut()")
    public Object timeController(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //记录切点前时间
        long start = System.currentTimeMillis();
        logger = LogManager.getLogger(proceedingJoinPoint.getTarget().getClass());
        //让切点动起来
        Object object = proceedingJoinPoint.proceed();
        //记录切点完成后的时间
        long end = System.currentTimeMillis();
        //把消耗的时间写入日志
        logger.info("Controller耗时 " + (end - start) + " ms");
        //返回切点对象
        return object;
    }
//
//    @Around("execution(* org.shunly.application.serviceImp..*.*(..))")
//    public Object timeDb(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        long start = System.currentTimeMillis();
//        logger = LogManager.getLogger(proceedingJoinPoint.getTarget().getClass());
//        Object object = proceedingJoinPoint.proceed();
//        long end = System.currentTimeMillis();
//        logger.info("DB耗时 " + (end - start) + " ms");
//        return object;
//    }

}