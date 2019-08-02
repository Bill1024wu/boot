package com.example.boot.dao.impl;

import com.example.boot.dao.IUserDao;
import com.example.boot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public int add(User user) {
        String sql = "insert into user(id,name,age) values(:id,:name,:age)";
        Map<String, Object> param = new HashMap<>();
        param.put("id",user.getId());
        param.put("name",user.getName());
        param.put("age",user.getAge());
        return namedParameterJdbcTemplate.update(sql, param);
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(User user) {
        return 0;
    }

    @Override
    public User findUser(Long id) {

        return null;
    }

    @Override
    public List<User> findUserList() {
        List<User> list = jdbcTemplate.query("select * from user", new Object[]{}, new BeanPropertyRowMapper(User.class));
        return list;
    }
}
