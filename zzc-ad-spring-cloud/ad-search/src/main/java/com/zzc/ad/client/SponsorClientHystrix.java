package com.zzc.ad.client;

import com.zzc.ad.vo.CommonResponse;
import com.zzc.ad.client.vo.AdPlan;
import com.zzc.ad.client.vo.AdPlanGetRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {
        return new CommonResponse<>(-1,
                "eureka-client-ad-sponsor error");
    }
}
