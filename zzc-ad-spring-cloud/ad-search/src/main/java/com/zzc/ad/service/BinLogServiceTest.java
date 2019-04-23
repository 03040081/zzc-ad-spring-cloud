package com.zzc.ad.service;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.DeleteRowsEventData;
import com.github.shyiko.mysql.binlog.event.EventData;
import com.github.shyiko.mysql.binlog.event.UpdateRowsEventData;
import com.github.shyiko.mysql.binlog.event.WriteRowsEventData;

import java.io.IOException;

/**
 * WriteRowsEventData{tableId=83, includedColumns={0, 1, 2, 3, 4, 5, 6, 7}, rows=[
 *     [12, 12, 第三个推广计划, 1,
 *     Tue Apr 23 23:32:39 CST 2019,
 *     Tue Apr 23 23:32:39 CST 2019,
 *     Tue Apr 23 23:32:39 CST 2019,
 *     Tue Apr 23 23:32:39 CST 2019]
 * ]}
 */
public class BinLogServiceTest {

    public static void main(String[] args) throws IOException {
        BinaryLogClient client = new BinaryLogClient(
                "127.0.0.1",
                3306,
                "root",
                "123456"
        );
        //client.setBinlogFilename();设置监听BinLog日志文件
        //client.setBinlogPosition();设置监听BinLog日志位置
        //最新日志位置开始监听
        client.registerEventListener(event -> {
            EventData data = event.getData();
            if (data instanceof UpdateRowsEventData) {
                System.out.println("Update----------------");
                System.out.println(data.toString());
            } else if (data instanceof WriteRowsEventData) {
                System.out.println("Write----------------");
                System.out.println(data.toString());
            } else if (data instanceof DeleteRowsEventData) {
                System.out.println("Delete----------------");
                System.out.println(data.toString());
            }
        });
        client.connect();
    }
}
