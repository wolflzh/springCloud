package com.lzh.springcloud.controller;

import com.lzh.springcloud.entities.CommonResult;
import com.lzh.springcloud.entities.Payment;
import com.lzh.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create( Payment payment)
    {
        log.info(String.valueOf(payment));
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);

        if(result > 0)
        {
            return new CommonResult(200,"插入数据库成功,serverPort: ",result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }

    }

    @PostMapping(value="/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        log.info("进入Controller方法----------------------------------------"+id);
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果: "+payment);

        if (payment != null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(500,"查询失败:"+id+"无对应记录！",null);
        }
    }
}
