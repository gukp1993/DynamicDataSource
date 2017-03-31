package cn.cry.DynamicDataSource.util;


/**
 *@ClassName:DataSourceManager
 *@Description:����Դ����
 *@Author:gukp
 *@Since:2017��3��30������11:12:53
 *@Version:1.1.0
 */
public class DataSourceManager {
  private final static ThreadLocal<DataSourceEnum> manager=new ThreadLocal<DataSourceEnum>(){
    @Override
    protected DataSourceEnum initialValue() {
      return DataSourceEnum.DATASOURCE1;
    }
  };

  public static DataSourceEnum getDataSource() {
    return manager.get();
  }
  
  public static void setDataSource(DataSourceEnum dataSourceEnum){
    manager.set(dataSourceEnum);
  }
}
