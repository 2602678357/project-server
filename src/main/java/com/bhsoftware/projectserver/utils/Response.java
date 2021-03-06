package com.bhsoftware.projectserver.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * 自定义数据类型返回对象
 * @param <T>
 */
@Data
public class Response<T> implements Serializable {

    private Boolean success;

    private String message;

    private T data;

    public Response(Boolean success) {
        this.success = success;
    }

    public Response(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Response(Boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
    public static <T> Response<T> yes() {
        return new Response(true, "操作成功");
    }
    public static <T> Response<T> yes(String message,T data) {
        return new Response(true, message, data);
    }
    public static <T> Response<T> yes(T data) {
        return new Response(true, "操作成功", data);
    }
    public static <T> Response<T> no() {
        return new Response(false, "操作失败");
    }
    public static <T> Response<T> no(String message) {
        return new Response(false, message);
    }
}