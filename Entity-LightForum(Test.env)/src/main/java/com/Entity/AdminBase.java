package com.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

/**
 * @author Lee
 * @date 2021/2/2
 * @name com.Entity AdminBase
 * @todo //todo:
 */
@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "adminbase")
public class AdminBase {

    /**
     * 用于注册或者登录
     * 设置为唯一外键，便于与文章数据表进行查找
     */
    @Id
    @GeneratedValue
    @Column(unique = true,nullable = false)
    @PrimaryKeyJoinColumn
    private Integer id;

    /**
     * 用户Email
     */
    @Column(nullable = false,unique = true)
    private String email;

    /**
     * 文章目录用于存储文章标题
     * 一对多:一个作者可以发表多篇文章，用list来存储
     */
    @Column
    private String article;

    /**
     * 用于注册
     */
    @Column(unique = true,nullable = false)
    private String name;

    /**
     * 用于注册或者登录
     */
    @Column(unique = false,nullable = false)
    private String password;
}
