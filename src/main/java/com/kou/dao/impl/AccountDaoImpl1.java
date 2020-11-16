package com.kou.dao.impl;

import com.kou.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author JIAJUN KOU
 * 账户的持久层实现类
 */
@Repository("accountDao1")
public class AccountDaoImpl1 implements IAccountDao {


    public void saveAccount() {
        System.out.println("保存了账户111111");
    }
}
