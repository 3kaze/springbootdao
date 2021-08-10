package com.wzw.mybatis.repository;

import com.wzw.entity.User;

import java.util.List;

/**
 * @author wei
 * @Date 2021/8/9
 */
public interface UserRepository {

    public List<User> findAll();
    public User findById(Integer id);
    public int save(User user);
    public int update(User user);
    public int deleteById(Integer id);

}
