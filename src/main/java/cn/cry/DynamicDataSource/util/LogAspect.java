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
    //目标方法方法签名
    Signature signature=pjp.getSignature();
    //类名
    String className=signature.getDeclaringTypeName();
    //目标方法名
    String methodName=signature.getName();
    //参数值
    Object[] args=pjp.getArgs();
    
    /*
    //目标方法
    Method targetMethod=((MethodSignature)signature).getMethod();
    
    LocalVariableTableParameterNameDiscoverer d=new LocalVariableTableParameterNameDiscoverer();
    //只能获取非接口类的方法参数名
    String[] parameterNames=d.getParameterNames(m);
    */
    
    Logger logger=loggerFactory.getLogger(className);
    logger.info("{} begin",methodName);
    logger.info("参数：{}",JSON.toJSON(args));
    Object retVal=pjp.proceed();
    logger.info("{} 结果集：{}",methodName,retVal);
    logger.info("{} end",methodName);
    return retVal;
  }
}
