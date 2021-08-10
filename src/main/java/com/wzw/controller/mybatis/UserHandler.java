package com.wzw.controller.mybatis;

import com.wzw.entity.User;
import com.wzw.mybatis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wei
 * @Date 2021/8/9
 */
@RestController("mybatisUserHandler")
@RequestMapping("/mybatisuser")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public int save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/update")
    public int update(@RequestBody User user) {
        return userRepository.update(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") Integer id) {
        return userRepository.deleteById(id);
    }
}
