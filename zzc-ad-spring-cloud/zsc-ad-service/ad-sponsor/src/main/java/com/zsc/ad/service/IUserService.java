package com.zsc.ad.service;

import com.zsc.ad.exception.AdException;
import com.zsc.ad.vo.CreateUserRequest;
import com.zsc.ad.vo.CreateUserResponse;

public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
