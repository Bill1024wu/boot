package com.example.boot;

import com.example.boot.dao.impl.UserDao;
import com.example.boot.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BootApplication.class)
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testInsert() {
        User user = new User();
        user.setId(4L);
        user.setName("baby");
        user.setAge(27);
        userDao.add(user);
        System.out.println("插入成功！");
    }

    @Test
    public void testQueryAll() {
        List<User> list = userDao.findUserList();
        System.out.println("插入成功！" + list.toString());
    }
}
