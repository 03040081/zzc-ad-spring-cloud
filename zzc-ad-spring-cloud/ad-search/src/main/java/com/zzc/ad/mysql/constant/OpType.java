package com.zzc.ad.mysql.constant;

import com.github.shyiko.mysql.binlog.event.EventType;

public enum OpType {
    ADD,
    UPDATE,
    DELETE,
    OTHER;

    /**
     * @Description:
     * 〈case参数对应MySQL8.0〉
     * @Author: zzc
     * @Param: [eventType]
     * @Return: com.zzc.ad.mysql.constant.OpType
     */
    public static OpType to(EventType eventType){
        switch (eventType){
            case EXT_WRITE_ROWS:
                return ADD;
            case EXT_UPDATE_ROWS:
                return UPDATE;
            case EXT_DELETE_ROWS:
                return DELETE;
            default:
                return OTHER;
        }
    }
}
