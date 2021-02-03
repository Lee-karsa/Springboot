package com.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Lee
 * @date 2021/2/2
 * @name com.Entity ArticleBase
 * @todo //todo:
 */
@Repository
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "articlebase")
public class ArticleBase {

    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 作者
     * 多对一：一个文章只能有一个作者
     */
    @Column
    private String author;

    /**
     * 文章标题
     */
    @Column(unique = true,nullable = false)
    private String title;

    /**
     * 文章内容
     */
    @Column(unique = true,nullable = false)
    private String article;

    /**
     * 创作日期
     */
    @Column
    private Date date;
}
