package com.houcy7.cloud2020.controller;

import com.houcy7.cloud2020.dao.PaymentDao;
import com.houcy7.cloud2020.entities.CommonResult;
import com.houcy7.cloud2020.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author hou
 * @Date 2020/6/11 10:19 上午
 * @Version 1.0
 **/
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentDao paymentDao;

    @GetMapping("hello")
    public String hello() {
        return "world";
    }

    @GetMapping("get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        return new CommonResult<Payment>(200, "查询成功", payment);
    }

    @PostMapping("setPayment")
    public CommonResult<Integer> setPayment(@RequestBody Payment payment) {
        int i = paymentDao.create(payment);
        return new CommonResult<Integer>(200, "插入成功", i);
    }
}