package cn.test;

import cn.dao.UserDao;
import cn.domain.User;
import jdk.jfr.StackTrace;
import org.junit.Test;

import java.sql.SQLOutput;

public class UserDaoTest {

    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("zhangsan");
        loginuser.setPassword("123");

        UserDao dao=new UserDao();
        User user=dao.login(loginuser);
//        System.out.println(user);
        dao.login(user);
    }

}
