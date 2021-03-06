package com.maqh.utils.str;

/**
 * 字符串工具类
 *
 * @author maqh
 * @version 1.0
 * @date 2021-07-12
 */
public class StringUtils {

    /**
     * 反转字符串
     *
     * @param str 字符串
     * @return 反转后字符串
     */
    public static String reversel(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        long l = Long.parseLong(StringUtils.reversel("410000000000"));
        System.out.println(StringUtils.reversel(l + ""));
    }
}
