package com.myzzb.springcloud.Service.Impl;

import com.myzzb.springcloud.Service.PaymentService;
import com.myzzb.springcloud.entities.Payment;
import com.myzzb.springcloud.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author :zzb
 * @createDate :2020/9/10 11:23
 * @desc :
 */
@Service
public class PaymentServiceImpl implements PaymentService {


    @Resource
    private PaymentMapper paymentMapper;
    @Override
    public int create(Payment payment) {
        payment.setCreateTime(LocalDateTime.now());
        payment.setSerial("zzb");
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.selectById(id);
    }
}
