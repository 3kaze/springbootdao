package com.wzw.jpa.repository;

import com.wzw.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wei
 * @Date 2021/8/9
 */
public interface UserJpaRepository extends JpaRepository<User, Integer> {
    public User findByName(String name);
}
