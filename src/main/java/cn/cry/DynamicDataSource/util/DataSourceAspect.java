package cn.cry.DynamicDataSource.util;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 *@ClassName:DataSourceAspect
 *@Description:切面动态设置数据源
 *@Author:gukp
 *@Since:2017年3月30日下午2:26:41
 *@Version:1.1.0
 */
@Aspect
@Component
@Order(0)
public class DataSourceAspect {

  //dao层接口方法
  @Before("execution(* cn.cry..dao.*.*(..))")
  public void setDataSource(JoinPoint jp) throws NoSuchMethodException, SecurityException{
    Signature signature=jp.getSignature();
    //目标方法
    Method targetMethod=((MethodSignature)signature).getMethod();
    
    if(targetMethod!=null&&targetMethod.isAnnotationPresent(DataSource.class)){
      //获取方法的DataSource注解
      DataSource dataSource=targetMethod.getAnnotation(DataSource.class);
      for(DataSourceEnum dse:DataSourceEnum.values()){
        //遍历枚举，当枚举值和注解值相同，切换数据源，其键值为当前枚举值
        if(dse.toString().toLowerCase().equals(dataSource.value())){
          DataSourceManager.setDataSource(dse);
          return;
        }
      }
    }
    
    
  }
}
