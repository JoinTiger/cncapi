package com.example.demo;

import com.example.demo.bean.Motor;
import com.example.demo.bean.Product;
import com.example.demo.bean.Result;
import com.example.demo.bean.Standard;
import com.example.demo.redis.SequenceUtils;
import com.example.demo.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private SequenceUtils sequenceUtil;

    @Autowired
    private ProductService productService;

    @Test
    public void test() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String preStr = simpleDateFormat.format(date);
        System.out.println(preStr + sequenceUtil.getAutoFlowCode());
    }

    @Test
    public void test01() {
        List<Product> products = new ArrayList<>();

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.setContractNum("p1con");
        product1.setMacSn("p1macsn");

        product2.setContractNum("p2con");
        product2.setMacSn("p2macsn");

        product3.setContractNum("p3con");
        product3.setMacSn("p3macsn");


        Standard standard1 = new Standard();
        Standard standard2 = new Standard();
        Standard standard3 = new Standard();

        standard1.setApi("s1api");
        standard1.setDru("s1dru");

        standard2.setApi("s2api");
        standard2.setDru("s2dru");

        standard3.setApi("s3api");
        standard3.setDru("s3dru");

        Result result1 = new Result();
        Result result2 = new Result();
        Result result3 = new Result();


        result1.setApiResult(false);
        result1.setDruResult(true);

        result2.setApiResult(true);
        result2.setDruResult(true);

        result3.setApiResult(false);
        result3.setDruResult(false);


        Motor motor1 = new Motor();
        Motor motor2 = new Motor();
        Motor motor3 = new Motor();


        Motor motor4 = new Motor();
        Motor motor5 = new Motor();

        Motor motor6 = new Motor();


        motor1.setAverage(11.5);
        motor2.setAverage(12.5);
        motor3.setAverage(13.5);

        motor4.setAverage(14.5);
        motor5.setAverage(15.5);

        motor6.setAverage(16.5);


        product1.setStandard(standard1);
        product2.setStandard(standard2);
        product3.setStandard(standard3);

        product1.setResult(result1);
        product2.setResult(result2);
        product3.setResult(result3);

        product1.getMotors().add(motor1);
        product1.getMotors().add(motor2);
        product1.getMotors().add(motor3);

        product2.getMotors().add(motor4);
        product2.getMotors().add(motor5);

        product3.getMotors().add(motor6);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        productService.saveAll(products);
    }

}
