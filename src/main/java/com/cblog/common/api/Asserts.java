package com.cblog.common.api;


/*
 * @Author Echo
 * @Description 断言处理类，用于抛出各种API异常
 * @Date 20:11 2022/12/13
 **/
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
