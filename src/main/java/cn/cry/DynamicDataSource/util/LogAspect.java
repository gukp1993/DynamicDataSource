package cn.cry.DynamicDataSource.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

@Aspect
@Component
public class LogAspect {
  private final static ILoggerFactory loggerFactory=LoggerFactory.getILoggerFactory();
  
//  @Around("execution(* cn.cry..dao.*.*(..))")
  public Object log(ProceedingJoinPoint pjp) throws Throwable{
    //Ŀ�귽������ǩ��
    Signature signature=pjp.getSignature();
    //����
    String className=signature.getDeclaringTypeName();
    //Ŀ�귽����
    String methodName=signature.getName();
    //����ֵ
    Object[] args=pjp.getArgs();
    
    /*
    //Ŀ�귽��
    Method targetMethod=((MethodSignature)signature).getMethod();
    
    LocalVariableTableParameterNameDiscoverer d=new LocalVariableTableParameterNameDiscoverer();
    //ֻ�ܻ�ȡ�ǽӿ���ķ���������
    String[] parameterNames=d.getParameterNames(m);
    */
    
    Logger logger=loggerFactory.getLogger(className);
    logger.info("{} begin",methodName);
    logger.info("������{}",JSON.toJSON(args));
    Object retVal=pjp.proceed();
    logger.info("{} �������{}",methodName,retVal);
    logger.info("{} end",methodName);
    return retVal;
  }
}
