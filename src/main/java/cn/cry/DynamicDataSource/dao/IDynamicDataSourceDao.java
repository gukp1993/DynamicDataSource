package cn.cry.DynamicDataSource.dao;

import cn.cry.DynamicDataSource.util.DataSource;


/**
 *@ClassName:IDynamicDataSourceDao
 *@Description:测试方法，使用2个不同的数据源
 *@Author:gukp
 *@Since:2017年3月30日上午11:13:17
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
