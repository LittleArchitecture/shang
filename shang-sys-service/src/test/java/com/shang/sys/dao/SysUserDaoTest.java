package com.shang.sys.dao;

import com.alibaba.fastjson.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import static org.junit.Assert.*;

/**
 * @author NICK
 * @create 2017-12-21
 **/
public class SysUserDaoTest {

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        SysUserDao sysUserDao = (SysUserDao) applicationContext.getBean("sysUserDao");
       JSONObject jsonObject  =  sysUserDao.queryForJsonObject("select * from lf_ctrl_user where usercode = ?","admin");
       System.out.println( jsonObject);

//        XmlWebApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext("classpath:applicationContext.xml");
    }

    @Test
    public void  test(){
        assertEquals("eq","0","0");
    }


    @After
    public void tearDown() throws Exception {
    }

}