package com.kou.ui;
import com.kou.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author JIAJUN KOU
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    /**
     * 获取spring的IOc核心容器，并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {

        //1.获取核心容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象  这是两种方式创建的两个对象。 是一回事
        IAccountService as=(IAccountService) ac.getBean("accountService");
//        System.out.println(as);
//
//        IAccountDao accountDao=ac.getBean("accountDao",IAccountDao.class);
//        System.out.println(accountDao);
        System.out.println(as);
        as.saveAccount();
    }
}
