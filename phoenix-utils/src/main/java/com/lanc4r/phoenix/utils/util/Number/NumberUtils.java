package com.lanc4r.phoenix.utils.util.Number;

import java.util.List;

/**
 * @author Lanc4r
 * @create 2019-11-15 5:21 PM
 */
public class NumberUtils {

    /**
     * Integer是否有效(非空且大于0)
     *
     * @param i
     */
    public static boolean isValid(Integer i) {
        return i != null && i > 0;
    }

    /**
     * Integer是否无效(为空或小于等于0)
     *
     * @param i
     *
     * */
    public static boolean isInvalid(Integer i) {
        return !isValid(i);
    }

    public static boolean isValid(Long i) {
        return i != null && i > 0;
    }

    /**
     * Long是否无效(为空或小于等于0)
     *
     * @param i
     *
     * */
    public static boolean isInvalid(Long i) {
        return !isValid(i);
    }

    /**
     * 验证是否错误的Integer ，如果为空或小于0则视为无效
     *
     * @param intAry
     * @return
     */
    public static boolean isInvalid(Integer... intAry) {
        if (intAry == null || intAry.length == 0) {
            return false;
        }
        for (int i = 0; i < intAry.length; i++) {
            if (intAry[i] == null || intAry[i] <= 0)
                return true;
        }
        return false;
    }

    public static boolean isInvalid(Long... longAry) {
        if (longAry == null || longAry.length == 0) {
            return false;
        }
        for (int i = 0; i < longAry.length; i++) {
            if (longAry[i] == null || longAry[i] <= 0)
                return true;
        }
        return false;
    }

}
