package com.Service;

import com.Dao.ArticleDao;
import com.Entity.ArticleBase;

/**
 * @author Lee
 * @date 2021/2/3
 * @name com.Service ArticleService
 * @todo //todo:
 */

public interface ArticleService {

    ArticleBase findAllByAuthor(String email);
    ArticleBase findAllByTitle(String title);
}
