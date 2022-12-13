package com.blog.common.api;

/*
 * @Author Echo
 * @Description 封装API的错误码
 * @Date 20:08 2022/12/13
 **/
public interface IErrorCode {
    long getCode();

    String getMessage();
}
