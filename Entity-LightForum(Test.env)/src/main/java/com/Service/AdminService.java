package com.Service;

import com.Entity.AdminBase;

/**
 * @author Lee
 * @date 2021/2/2
 * @name com.Service AdminService
 * @todo //todo:
 */

public interface AdminService {

    /**
     * 通过Email找到对应的数据库对象，并将它Seal为一个AdminBase对象返回
     * @param email
     * @return AdminBase object
     */
    AdminBase findByAllEmail(String email);
}
