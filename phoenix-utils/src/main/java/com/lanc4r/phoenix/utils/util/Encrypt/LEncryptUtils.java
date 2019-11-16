package com.lanc4r.phoenix.utils.util.Encrypt;


import com.lanc4r.phoenix.utils.des.DesPlus;

/**
 * @author Lanc4r
 * @create 2019-11-15 5:14 PM
 *
 * 加解密工具，支持自定义秘钥进行加解密
 */
public class LEncryptUtils {

    private static final String desKey = "phoenix20191115";

    /**
     * 用自定义秘钥进行加密，必须使用对应的解密方法进行解密
     *
     * @return
     */
    public static String decrypt(String desString) {
        return DesPlus.getInstance().decrypt(desString, desKey);
    }

    /**
     * 仅支持解密用自定义秘钥加密的字符串
     *
     * @param desString
     * @return
     */
    public static String encrypt(String desString) {
        return DesPlus.getInstance().encrypt(desString, desKey);
    }

    public static void main(String[] args) {
        Long compRootId = 370L;
        String encryptObjectId = LEncryptUtils.encrypt(compRootId.toString());
        System.out.println("after encry:" + encryptObjectId);
        String decryptObjectId = LEncryptUtils.decrypt(encryptObjectId);
        System.out.println("after decrypt:" + decryptObjectId);
    }

}
