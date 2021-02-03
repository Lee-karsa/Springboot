package com.Controller;

import com.Entity.ArticleBase;
import com.Service.Impl.AdminServiceImpl;
import com.Service.Impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lee
 * @date 2021/2/3
 * @name com.Controller ArticleController
 * @todo //todo:
 */

@RestController
public class ArticleController {

    @Autowired
    private AdminServiceImpl adminService;
    @Autowired
    private ArticleServiceImpl articleService;

    @RequestMapping("/1")
    public String find1(){
        return adminService.findByAllEmail("1445935587@qq.com").getEmail();
    }

    @RequestMapping("/2")
    public ArticleBase find2(){
        List<ArticleBase> arts = ;
        return articleService.findAllByAuthor("1445935587@qq.com");
    }

}
