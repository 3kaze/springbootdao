package com.wzw.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author wei
 * @Date 2021/8/9
 */
@Data
@Entity(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private Integer age;
}
