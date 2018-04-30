/**
 * @program: order
 * @description:
 * @author: Francis
 * @create: 2018-04-13 11:16
 **/

package com.imooc.user.utils;

import java.util.Random;

public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * 自己玩的  不保证唯一
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
