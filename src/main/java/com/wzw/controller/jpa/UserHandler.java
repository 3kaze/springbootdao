package com.wzw.controller.jpa;

import com.wzw.jpa.entity.User;
import com.wzw.jpa.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wei
 * @Date 2021/8/9
 */
@RestController("jpaUserHandler")
@RequestMapping("/jpauser")
public class UserHandler {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userJpaRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userJpaRepository.findById(id).get();
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userJpaRepository.save(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user) {
        userJpaRepository.save(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        userJpaRepository.deleteById(id);
    }

    @GetMapping("/findByUserName/{name}")
    public User findByUserName(@PathVariable("name") String name) {
        return userJpaRepository.findByName(name);
    }

}
