package com.zzc.ad.sender;

import com.zzc.ad.mysql.dto.MySqlRowData;

/**
 * 投递增量数据的接口
 */
public interface ISender {

    void sender(MySqlRowData rowData);
}
