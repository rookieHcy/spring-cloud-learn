package com.houcy7.cloud2020.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Description TODO
 * @Author hou
 * @Date 2020/6/8 11:53 下午
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    // 主键
    private Long id;

    // 订单编号
    private String serial;
}