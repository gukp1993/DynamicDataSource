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
 *@Description:���涯̬��������Դ
 *@Author:gukp
 *@Since:2017��3��30������2:26:41
 *@Version:1.1.0
 */
@Aspect
@Component
@Order(0)
public class DataSourceAspect {

  //dao��ӿڷ���
  @Before("execution(* cn.cry..dao.*.*(..))")
  public void setDataSource(JoinPoint jp) throws NoSuchMethodException, SecurityException{
    Signature signature=jp.getSignature();
    //Ŀ�귽��
    Method targetMethod=((MethodSignature)signature).getMethod();
    
    if(targetMethod!=null&&targetMethod.isAnnotationPresent(DataSource.class)){
      //��ȡ������DataSourceע��
      DataSource dataSource=targetMethod.getAnnotation(DataSource.class);
      for(DataSourceEnum dse:DataSourceEnum.values()){
        //����ö�٣���ö��ֵ��ע��ֵ��ͬ���л�����Դ�����ֵΪ��ǰö��ֵ
        if(dse.toString().toLowerCase().equals(dataSource.value())){
          DataSourceManager.setDataSource(dse);
          return;
        }
      }
    }
    
    
  }
}
