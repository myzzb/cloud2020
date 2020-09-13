package com.myzzb.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author :zzb
 * @createDate :2020/9/13 8:32 下午
 * @desc :
 */
@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){
        return "线程池"+Thread.currentThread().getName()+" paymentInfo_OK,id="+id+"\t哈哈";
    }

    public String paymentInfo_Timeout(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+" paymentInfo_OK,id="+id+"\t哈哈 耗时(s)"+timeNumber;
    }
}
