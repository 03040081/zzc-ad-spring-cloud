package com.zsc.ad.service;

import com.zsc.ad.vo.CreativeRequest;
import com.zsc.ad.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
