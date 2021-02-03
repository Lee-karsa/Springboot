package com.Controller;
;
import com.Service.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee
 * @date 2021/2/2
 * @name com.example.demo testJPAcontroller
 * @todo //todo:
 */
@RestController
public class testJPAcontroller {

    @Autowired
    private AdminServiceImpl adminServiceimpl;

}
