package com.houcy7.cloud2020.dao;

import com.houcy7.cloud2020.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName PaymentDao
 * @Description TODO
 * @Author hou
 * @Date 2020/6/8 11:57 下午
 * @Version 1.0
 **/
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
