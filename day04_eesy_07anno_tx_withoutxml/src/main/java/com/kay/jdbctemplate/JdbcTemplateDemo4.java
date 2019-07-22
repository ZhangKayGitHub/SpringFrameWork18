package com.kay.jdbctemplate;

import com.kay.dao.IAccountDao;
import com.kay.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * JdbcTemplate 的最基本的用法
 */
public class JdbcTemplateDemo4 {
    public static void main(String[] args) {
     //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IAccountDao accountDao = ac.getBean("accountDao",IAccountDao.class);

        Account account = accountDao.findAccountById(2);
        System.out.println(account);
        account.setMoney(30000f);
        accountDao.updateAccount(account);
    }
}
