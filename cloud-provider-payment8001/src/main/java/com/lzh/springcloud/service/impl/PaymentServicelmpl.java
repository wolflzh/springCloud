package com.lzh.springcloud.service.impl;
import com.lzh.springcloud.dao.PaymentDao;
import com.lzh.springcloud.entities.Payment;
import com.lzh.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class PaymentServicelmpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
