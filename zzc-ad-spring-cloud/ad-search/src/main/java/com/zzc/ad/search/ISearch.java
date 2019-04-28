package com.zzc.ad.search;

import com.zzc.ad.search.vo.SearchRequest;
import com.zzc.ad.search.vo.SearchResponse;

public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
