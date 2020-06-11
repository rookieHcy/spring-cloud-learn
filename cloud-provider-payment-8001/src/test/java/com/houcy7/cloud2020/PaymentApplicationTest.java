package com.houcy7.cloud2020;

import com.houcy7.cloud2020.dao.PaymentDao;
import com.houcy7.cloud2020.entities.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName PaymentApplicationTest
 * @Description TODO
 * @Author hou
 * @Date 2020/6/9 12:05 上午
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PaymentMain8001.class)
public class PaymentApplicationTest {
    @Autowired
    private PaymentDao paymentDao;

    @Test
    public void test1(){
        paymentDao.create(new Payment(3L, "3"));
    }
}


