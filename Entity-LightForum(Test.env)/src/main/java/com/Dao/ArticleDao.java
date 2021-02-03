package com.Dao;

import com.Entity.AdminBase;
import com.Entity.ArticleBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Lee
 * @date 2021/2/2
 * @name com.Dao ArticleDao
 * @todo //todo:
 */

public interface ArticleDao extends JpaRepository<ArticleBase,String> {

    ArticleBase findAllByAuthor(String email);
    ArticleBase findAllByTitle(String title);
}
