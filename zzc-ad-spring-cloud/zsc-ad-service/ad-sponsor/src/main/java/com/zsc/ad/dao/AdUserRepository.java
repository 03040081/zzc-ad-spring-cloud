package com.zsc.ad.dao;

import com.zsc.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdUserRepository extends JpaRepository<AdUser,Long> {

    /**
     * <h2>根据用户名查找用户记录</h2>
     * */
    AdUser findByUsername(String username);
}
