package cn.cry.DynamicDataSource.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 *@ClassName:DynamicDataSource
 *@Description:���ڶ�̬����Դ���л�
 *@Author:gukp
 *@Since:2017��3��30������10:54:47
 *@Version:1.1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

  @Override
  protected Object determineCurrentLookupKey() {
    return DataSourceManager.getDataSource();
  }

}
