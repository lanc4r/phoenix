package com.lanc4r.phoenix.utils.util.Page;

/**
 * 分页工具类
 */
public class PageUtils {

    public final static int ZERO = 0;

    public static final int PAGE_SIZE_1 = 1;

    public static final int PAGE_SIZE_2 = 2;

    public static final int PAGE_SIZE_3 = 3;

    public static final int PAGE_SIZE_4 = 4;

    public static final int PAGE_SIZE_5 = 5;

    public static final int PAGE_SIZE_6 = 6;

    public static final int PAGE_SIZE_8 = 8;

    public static final int PAGE_SIZE_9 = 9;

    public static final int PAGE_SIZE_10 = 10;

    public static final int PAGE_SIZE_12 = 12;

    public static final int PAGE_SIZE_15 = 15;

    public static final int PAGE_SIZE_16 = 16;

    public static final int PAGE_SIZE_20 = 20;

    public static final int PAGE_SIZE_30 = 30;

    public static final int PAGE_SIZE_50 = 50;

    public static final int PAGE_SIZE_100 = 100;

    public static final int PAGE_SIZE_200 = 200;

    public static final int PAGE_SIZE_500 = 500;

    public static final int PAGE_SIZE_1000 = 1000;

    public static final int PAGE_SIZE_2000 = 2000;

    public static final int PAGE_SIZE_5000 = 5000;

    public static final int PAGE_SIZE_10000 = 10000;

    /**
     * @描述：计算总页数
     */
    public static int calTotalPage(int pageSize, long totalRows) {
        int totalPage = (int) ((totalRows % pageSize == 0) ? (totalRows / pageSize) : (totalRows / pageSize + 1));
        return totalPage;
    }

    /**
     * @描述：是否还有更多数据
     */
    public static boolean moreFlag(long totalCount, int curPage, int pageSize) {
        int curCount = (curPage + 1) * pageSize;
        if (curCount < totalCount) {
            return true;
        }
        return false;
    }
}
