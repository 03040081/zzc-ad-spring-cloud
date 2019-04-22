package com.zzc.ad.mysql.listener;

import com.zzc.ad.mysql.dto.BinlogRowData;

public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);
}
