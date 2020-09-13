package com.myzzb.springcloud.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myzzb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :zzb
 * @createDate :2020/9/10 11:20
 * @desc :
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}
