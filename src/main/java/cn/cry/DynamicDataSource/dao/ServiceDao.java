package cn.cry.DynamicDataSource.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author gukepeng
 * @since 2018/12/4
 */
public interface ServiceDao {
    String getServiceNameById(Long id);
}
