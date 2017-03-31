package cn.cry.DynamicDataSource.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *@ClassName:DataSource
 *@Description:自定义注解，标明方法要使用哪个数据源
 *@Author:gukp
 *@Since:2017年3月30日上午11:11:59
 *@Version:1.1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
  String value();
}
