package com.wzw.repository.impl;

import com.wzw.entity.User;
import com.wzw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wei
 * @Date 2021/8/9
 */
@Repository
public class UserRepositortImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(
                "select * from t_user",
                new BeanPropertyRowMapper<>(User.class)
        );
    }

    @Override
    public User findById(Integer id) {
        return jdbcTemplate.queryForObject(
                "select * from t_user where id = ?",
                new Object[]{id},
                new BeanPropertyRowMapper<>(User.class)
        );
    }

    @Override
    public int save(User user) {
        return jdbcTemplate.update(
                "insert into t_user(name, password, age) values (?, ?, ?)",
                user.getName(),
                user.getPassword(),
                user.getAge()
        );
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update(
                "update t_user set name = ?, password = ?, age = ? where id = ?",
                user.getName(),
                user.getPassword(),
                user.getAge(),
                user.getId()
        );
    }

    @Override
    public int deleteById(Integer id) {
        return jdbcTemplate.update(
                "delete from t_user where id = ?",
                id
        );
    }
}
