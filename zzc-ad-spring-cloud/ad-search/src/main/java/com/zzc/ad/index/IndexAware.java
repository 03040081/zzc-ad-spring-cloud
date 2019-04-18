package com.zzc.ad.index;

/**
 * @Description: 〈索引的增删改查〉
 * @Author: zzc
 * @Date: 2019/4/18 19:44
 * @Param:  K
 * @Return: V
 */
public interface IndexAware<K, V> {

    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);
}
