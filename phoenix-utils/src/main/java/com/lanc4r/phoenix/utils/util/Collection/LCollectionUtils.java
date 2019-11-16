package com.lanc4r.phoenix.utils.util.Collection;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;

/**
 * @author Lanc4r
 * @create 2019-11-15 5:04 PM
 *
 * 集合类型工具类
 *
 */
public class LCollectionUtils{

    /**
     * 将一组数据固定分组，每组n个元素
     *
     * @param source 要分组的数据源
     * @param n      每组n个元素
     * @param <T>
     * @return
     */
    public static <T> List<List<T>> divideList(List<T> source, int n) {

        if (null == source || source.size() == 0 || n <= 0)
            return Lists.newArrayList();
        List<List<T>> result = Lists.newArrayList();
        int remainder = source.size() % n;
        int size = (source.size() / n);
        for (int i = 0; i < size; i++) {
            List<T> subset = null;
            subset = source.subList(i * n, (i + 1) * n);
            result.add(subset);
        }
        if (remainder > 0) {
            List<T> subset = null;
            subset = source.subList(size * n, size * n + remainder);
            result.add(subset);
        }
        return result;
    }

}
