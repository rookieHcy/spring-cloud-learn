package com.houcy7.cloud2020.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Description 通用的返回结果
 * @Author hou
 * @Date 2020/6/8 11:55 下午
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}