package com.lanc4r.phoenix.utils.util.String;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;

/**
 * @author Lanc4r
 * @create 2019-11-15 5:27 PM
 *
 * UUID 工具类，单例模式，保证线程安全（虽然目前貌似并不涉及多线程）
 */
public class LUUIDUtils {

    private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
            'E', 'F' };
    private static LUUIDUtils instance = new LUUIDUtils();


    private String midValue;

    private static final ThreadLocal<SecureRandom> localRandom = new ThreadLocal<SecureRandom>() {
        protected SecureRandom initialValue() {
            return new SecureRandom();
        }
    };

    private static SecureRandom current() {
        return localRandom.get();
    }

    private LUUIDUtils() {
        byte[] addr;
        try {
            addr = InetAddress.getLocalHost().getAddress();
        } catch (UnknownHostException e) {
            addr = new byte[] { 127, 0, 0, 1 };
        }
        this.midValue = toHex(toInt(addr), 8);
    }

    public static String generate(final Object obj) {
        return instance.produce(obj);
    }

    public static String generate() {
        return instance.produce(null);
    }

    private String produce(final Object obj) {
        StringBuilder uid = new StringBuilder(32);
        long currentTimeMillis = System.currentTimeMillis();
        uid.append(toHex((int) (currentTimeMillis & -1L), 8));
        uid.append(midValue);
        if (obj != null) {
            uid.append(toHex(System.identityHashCode(obj), 8));
        } else {
            uid.append(toHex(current().nextInt(), 8));
        }
        uid.append(toHex(current().nextInt(), 8));
        return uid.toString();
    }

    private static String toHex(int value, int length) {
        StringBuilder buffer = new StringBuilder(length);
        int shift = length - 1 << 2;
        for (int i = -1; ++i < length;) {
            buffer.append(HEX_DIGITS[value >> shift & 0xf]);
            value <<= 4;
        }
        return buffer.toString();
    }

    private static int toInt(byte bytes[]) {
        int value = 0;
        for (int i = -1; ++i < bytes.length;) {
            value <<= 8;
            value |= (bytes[i] & 0xff);
        }
        return value;
    }

}
