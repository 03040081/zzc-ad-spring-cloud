package com.zzc.ad.service;

import com.zzc.ad.exception.AdException;
import com.zzc.ad.vo.CreateUserRequest;
import com.zzc.ad.vo.CreateUserResponse;

public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
