package cn.cry.DynamicDataSource.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *@ClassName:DataSource
 *@Description:�Զ���ע�⣬��������Ҫʹ���ĸ�����Դ
 *@Author:gukp
 *@Since:2017��3��30������11:11:59
 *@Version:1.1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
  String value();
}
