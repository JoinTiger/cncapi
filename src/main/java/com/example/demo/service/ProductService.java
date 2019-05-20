package com.example.demo.service;

import com.example.demo.bean.Motor;
import com.example.demo.bean.NcVer;
import com.example.demo.bean.Product;
import com.example.demo.bean.Servo;
import com.example.demo.redis.SequenceUtils;
import com.example.demo.repository.MotorRepository;
import com.example.demo.repository.NcVerRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.ServoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private SequenceUtils sequenceUtils;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private NcVerRepository ncVerRepository;

    @Autowired
    private ServoRepository servoRepository;

    @Autowired
    private MotorRepository motorRepository;

    @Transactional
    public void save(Product product) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String batchId = simpleDateFormat.format(date) + sequenceUtils.getAutoFlowCode();

        product.setBatchId(batchId);
        productRepository.save(product);

        Long id = product.getId();

        NcVer ncVer = product.getNcVer();
        ncVer.setProductId(id);
        ncVerRepository.save(ncVer);

        List<Servo> servos = product.getServos();
        for (Servo servo : servos) {
            servo.setProductId(id);
            servoRepository.save(servo);
        }

        List<Motor> motors = product.getMotors();
        for (Motor motor : motors) {
            motor.setProductId(id);
            motorRepository.save(motor);
        }

    }
}
