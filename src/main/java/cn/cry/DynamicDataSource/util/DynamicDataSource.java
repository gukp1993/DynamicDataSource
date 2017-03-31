package cn.cry.DynamicDataSource.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 *@ClassName:DynamicDataSource
 *@Description:用于动态数据源的切换
 *@Author:gukp
 *@Since:2017年3月30日上午10:54:47
 *@Version:1.1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

  @Override
  protected Object determineCurrentLookupKey() {
    return DataSourceManager.getDataSource();
  }

}
