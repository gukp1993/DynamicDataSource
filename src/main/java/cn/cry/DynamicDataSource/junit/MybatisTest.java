package cn.cry.DynamicDataSource.junit;

import cn.cry.DynamicDataSource.dao.ServiceDao;
import org.junit.Ignore;
import org.junit.Test;

import javax.annotation.Resource;

/**
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

    @Test
    public void getServiceNameBy3Params(){
        System.out.println(serviceDao.getServiceNameBy3Params("gkp",123L,"FW_GOODS-123"));
    }
}
