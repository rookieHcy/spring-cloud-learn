package com.houcy7.cloud2020.controller;

import com.houcy7.cloud2020.entities.CommonResult;
import com.houcy7.cloud2020.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author hou
 * @Date 2020/6/10 6:47 下午
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderController {

    private final static String BASE_PAYMENT_URL = "http://localhost:8001";//不集群

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(BASE_PAYMENT_URL + "/payment/get/" + id, CommonResult.class, id);
    }

    @PostMapping("/consumer/payment/create")
    public CommonResult<Integer> setPayment(Payment payment) {
        return restTemplate.postForObject(BASE_PAYMENT_URL + "/payment/setPayment/", payment,  CommonResult.class);
    }

}