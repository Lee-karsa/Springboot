package com.Service.Impl;

import com.Dao.AdminDao;
import com.Entity.AdminBase;
import com.Entity.ArticleBase;
import com.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lee
 * @date 2021/2/2
 * @name com.Service.Impl AdminServiceImpl
 * @todo //todo:
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminBase adminBase;

    @Autowired
    private AdminDao adminDao;

    @Override
    public AdminBase findByAllEmail(String email) {
        return adminDao.findAllByEmail(email);
    }

    /**
     * 注册账号用于上传数据库
     * @param email
     * @param name
     * @param password
     */
    public void SetAdminBase(String email, String name, String password, String article) {

        adminBase.setArticle(article);
        adminBase.setEmail(email);
        adminBase.setName(name);
        adminBase.setPassword(password);
        adminDao.save(adminBase);
    }
}
