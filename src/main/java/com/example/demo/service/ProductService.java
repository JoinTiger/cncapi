package com.example.demo.service;

import com.example.demo.bean.Motor;
import com.example.demo.bean.Product;
import com.example.demo.bean.Result;
import com.example.demo.bean.Standard;
import com.example.demo.redis.SequenceUtils;
import com.example.demo.repository.MotorRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.ResultRepository;
import com.example.demo.repository.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private StandardRepository standardRepository;

    @Autowired
    private ResultRepository resultRepository;

    @Autowired
    private MotorRepository motorRepository;

    @Autowired
    private SequenceUtils sequenceUtils;

    @Transactional
    public void save(Product product) {
            doSave(product);
    }

    @Transactional
    public void saveAll(List<Product> products) {

        for (Product product : products) {
            doSave(product);
        }
        
    }

    private void doSave(Product product) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String preStr = simpleDateFormat.format(date);


        String autoFlowCode = preStr + sequenceUtils.getAutoFlowCode();

        product.setTime(date);
        product.setBatchId(autoFlowCode);

        productRepository.save(product); //插入产品数据表

        Long id = product.getId();

        System.out.println("id**********************" + id.longValue());

        Standard standard = product.getStandard();
        Result result = product.getResult();
        List<Motor> motors = product.getMotors();



        standard.setId(id);
        standardRepository.save(standard);  //插入检测数据标准表



        result.setId(id);
        resultRepository.save(result);  //插入检测数据结果表


        for (Motor motor : motors) {
            motor.setId(id);
            motorRepository.save(motor);  //插入伺服电机数据表
        }
    }

}
