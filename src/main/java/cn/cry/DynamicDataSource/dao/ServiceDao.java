package cn.cry.DynamicDataSource.dao;

import cn.cry.DynamicDataSource.domain.ServiceRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gukepeng
 * @since 2018/12/4
 */
public interface ServiceDao {
    String getServiceNameById(Long id);

    String getServiceNameByFwsPinAndId(String fwsPin, Long id);

    String getServiceNameBy3Params(@Param("a") String fwsPin, @Param("b") Long id, @Param("c") String serviceCode);

    String getServiceNameByRequest(@Param("request") ServiceRequest request);

    List<String> listServiceNameByFwsPins(List<String> fwsPinList);

    List<String> listServiceNameByRequest(List<ServiceRequest> requestList);
}
