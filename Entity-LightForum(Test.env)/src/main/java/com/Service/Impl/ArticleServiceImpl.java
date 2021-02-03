package com.Service.Impl;

import com.Dao.ArticleDao;
import com.Entity.AdminBase;
import com.Entity.ArticleBase;
import com.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @date 2021/2/3
 * @name com.Service.Impl ArticleServiceImpl
 * @todo //todo:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleBase articleBase;

    @Autowired
    private ArticleDao articleDao;

    @Override
    public ArticleBase findAllByAuthor(String email) {
        return articleDao.findAllByAuthor(email);
    }

    @Override
    public ArticleBase findAllByTitle(String title) {
        return articleDao.findAllByTitle(title);
    }

    public void SetArticleBase(String email,String title,String article){

        articleBase.setAuthor(email);
        articleBase.setTitle(title);
        articleBase.setArticle(article);
        articleDao.save(articleBase);
    }
}
