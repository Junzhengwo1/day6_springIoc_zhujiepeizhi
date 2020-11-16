package com.kou.service.impl;

import com.kou.dao.IAccountDao;
import com.kou.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author JIAJUN KOU
 *
 * 账户的业务层实现类
 *1、、
 * 使用注解配置IOC
 * @Component 用于把当前类的对象存入spring容器中
 *      controller:用在表现层
 *      service：用在业务层
 *      repository：用于持久层
 *2、、
 * @Autowired 用于自动按照类型注入，只要容器中有唯一的一个bean对象类型
 * 和要注入的变量类型匹配，就可以注入成功；该注解可以出现位置可以在
 * 变量上，方法上，类上。
 * 如果ioc容器中没有任何bean的类型和要注入的的变量类型匹配，则注入失败。
 * 注意只要使用了该注解后，set方法就没必要了。
 * @Qualifier 作用是按照类中注入的基础之上再按照名称注入；它在给类成员注入时不能单独使用。但是在给方法参数注入时可以。
 *      属性：value 用于指定注入的bean的id
 * @Resource 直接按照bean的id注入，它可以独立使用
 *
 * 3、、
 * @value 用于注入基本类型和String类型的数据
 *  属性： value 用于指定数据的值。它可以时spring中SpEl(也就是spring的el表达式)
 *          ${表达式}
 * 4、、
 * @scope 用于指定bean的作用范围
 *   属性：value：指定范围的取值。常用取值：singleton prototype
 *
 */
@Service(value = "accountService")
//@Scope("singleton")
public class AccountServiceImpl implements IAccountService {

//    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name = "accountDao2")
    private IAccountDao accountDao;

    public AccountServiceImpl() {
        System.out.println("对象创建了。。。。。");
    }

    public void saveAccount() {
       accountDao.saveAccount();

    }
}
