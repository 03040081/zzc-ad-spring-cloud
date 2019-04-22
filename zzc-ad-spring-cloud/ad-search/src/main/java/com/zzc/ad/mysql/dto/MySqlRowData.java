package com.zzc.ad.mysql.dto;

import com.zzc.ad.mysql.constant.OpType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 简化BinlogRowData
 * 用于增量数据的投递
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MySqlRowData {

    private String tableName;

    private String level;

    //将EvenType转换为OpType
    private OpType opType;

    private List<Map<String, String>> fieldValueMap = new ArrayList<>();
}
