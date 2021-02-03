package com.Dao;

import com.Entity.AdminBase;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lee
 * @date 2021/2/2
 * @name com.Dao AdminDao
 * @todo //todo:
 */

public interface AdminDao extends JpaRepository<AdminBase,String> {

    AdminBase findAllByEmail(String email);
}
