package cn.cry.DynamicDataSource.junit;

import java.io.FileNotFoundException;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import cn.cry.DynamicDataSource.dao.IDynamicDataSourceDao;


/**
 *@ClassName:JunitTest
 *@Description:junit测试类
 *@Author:gukp
 *@Since:2017年3月30日上午11:13:06
 *@Version:1.1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:xml/application.xml"})
public class JunitTest {
  
  static{
    try {
      Log4jConfigurer.initLogging("classpath:properties/log4j.properties");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
  
  @Resource
  private IDynamicDataSourceDao dynamicDataSourceDao;

  @Test
  public void hello(){
    System.out.println("hello world");
  }
  
  @Ignore
  @Test
  public void test1(){
    int r1=dynamicDataSourceDao.datasource1Test();
  }
  
  @Ignore
  @Test
  public void test2(){
    int r2=dynamicDataSourceDao.datasource2Test();
  }
  
  @Ignore
  @Test
  public void test3(){
    int r3=dynamicDataSourceDao.parameterTypeTest(2);
  }
}
