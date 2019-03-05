package com.stylefeng.guns.core.util;

/**
 * Created by RookieWangZhiWei on 2019/3/1.
 */
import java.util.UUID;

public class UUIDUtil {

    public static String genUuid(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
