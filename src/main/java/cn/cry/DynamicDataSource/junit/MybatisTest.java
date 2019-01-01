package cn.cry.DynamicDataSource.junit;

import cn.cry.DynamicDataSource.dao.ServiceDao;
import cn.cry.DynamicDataSource.domain.ServiceRequest;
import org.junit.Ignore;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * 参数转换 MethodSignature类的convertArgsToSqlCommandParam方法
 * 1.单个入参（非java对象）：java接口中不使用@Param注解，xml中随意命名；接口中使用@Param注解，xml中必须使用@Param注解定义的名字或者param1
 *
 * @author gukepeng
 * @since 2018/12/4
 */
public class MybatisTest extends JunitTest {

    @Resource
    private ServiceDao serviceDao;

    @Ignore
    @Test
    public void getServiceNameById() {
        System.out.println(serviceDao.getServiceNameById(123L));
    }

    @Ignore
    @Test
    public void getServiceNameByFwsPinAndId() {
        serviceDao.getServiceNameByFwsPinAndId("gkp", 123L);
    }

    @Ignore
    @Test
    public void getServiceNameBy3Params(){
        System.out.println(serviceDao.getServiceNameBy3Params("gkp",123L,"FW_GOODS-123"));
    }

    @Ignore
    @Test
    public void getServiceNameByJavaBean(){
        ServiceRequest request = new ServiceRequest();
        request.setFwsPin("gkp");
        request.setId(123L);
        request.setServiceCode("FW_GOODS-123");
        System.out.println(serviceDao.getServiceNameByRequest(request));
    }

    @Test
    public void listServiceNameByFwsPins(){
        System.out.println(serviceDao.listServiceNameByFwsPins(Arrays.asList("gkp","gkp")));
    }

    @Ignore
    @Test
    public void listServiceNameByJavaBean(){
        ServiceRequest request = new ServiceRequest();
        request.setFwsPin("gkp");
        System.out.println(serviceDao.listServiceNameByRequest(Arrays.asList(request,request)));
    }
}
