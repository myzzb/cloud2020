package com.myzzb.springcloud.Service;

import com.myzzb.springcloud.entities.Payment;

/**
 * @author :zzb
 * @createDate :2020/9/10 11:22
 * @desc :
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
