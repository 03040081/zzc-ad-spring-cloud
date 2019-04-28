package com.zzc.ad.service;

import com.zzc.ad.vo.CreativeRequest;
import com.zzc.ad.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
