package com.myzzb.springcloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author :zzb
 * @createDate :2020/9/10 13:25
 * @desc :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    //@TableId(value = "id", type = IdType.AUTO)
    private Long id;

    //@TableField("serial")
    private String serial;

    //@TableField("create_time")
    private LocalDateTime createTime;
}