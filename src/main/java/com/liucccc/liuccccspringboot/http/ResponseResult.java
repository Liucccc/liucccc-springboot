package com.liucccc.liuccccspringboot.http;

import lombok.*;

/**
 * 返回信息标识
 *
 * @author Liucccc
 * create  2019-01-16
 **/
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
public class ResponseResult<T> {

    /**
     * 状态码
     */
    @NonNull
    private int code;

    /**
     * 提示信息
     */
    @NonNull
    private String message;

    /**
     * 返回的数据信息
     */
    private T data;


    /**
     * 成功信息
     */
    public static <T> ResponseResult<T> ok(T data) {
        ResponseResult<T> responseResult = ResponseResult.of(200, "OK");
        responseResult.setData(data);
        return responseResult;
    }

    /**
     * 返回成功信息，无返回值
     */
    public static <T> ResponseResult<T> ok() {
        return  ResponseResult.of(200, "OK");
    }


    /**
     * 错误提示信息  自定义code msg
     */
    public static <T> ResponseResult<T> prompt(int code, String msg) {
        return ResponseResult.of(code, msg);
    }

    /**
     * 错误提示信息
     */
    public static <T> ResponseResult<T> error(String msg) {
        return ResponseResult.of(500, msg);
    }
}
