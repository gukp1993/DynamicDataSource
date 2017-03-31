package cn.cry.DynamicDataSource.dao;

import cn.cry.DynamicDataSource.util.DataSource;


/**
 *@ClassName:IDynamicDataSourceDao
 *@Description:���Է�����ʹ��2����ͬ������Դ
 *@Author:gukp
 *@Since:2017��3��30������11:13:17
 *@Version:1.1.0
 */
public interface IDynamicDataSourceDao {
  @DataSource("datasource1")
  int datasource1Test();
  
  @DataSource("datasource2")
  int datasource2Test();
  
  @DataSource("datasource1")
  int parameterTypeTest(int id);
}
