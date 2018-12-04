package cn.cry.DynamicDataSource.junit;

import cn.cry.DynamicDataSource.dao.ServiceDao;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author gukepeng
 * @since 2018/12/4
 */
public class FwJunitTest extends JunitTest{

    @Resource
    private ServiceDao serviceDao;

    @Test
    public void test1(){
        System.out.println(serviceDao.getServiceNameById(455790L));;
    }
}
