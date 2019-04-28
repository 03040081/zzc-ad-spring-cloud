package com.zzc.ad.index.adunit;

/**
 * 流量类型
 */
public class AdUnitConstants {

    /**
     * 使用二进制形式的默认值，使用或运算 可以加快检索速度
     */
    public static class POSITION_TYPE {

        //开屏广告
        public static final int KAIPING = 1;
        //贴片广告
        public static final int TIEPIAN = 2;
        //中贴 视频中间插入广告
        public static final int TIEPIAN_MIDDLE = 4;
        //暂停时播放的广告
        public static final int TIEPIAN_PAUSE = 8;
        //视频结束后播放广告
        public static final int TIEPIAN_POST = 16;
    }
}
