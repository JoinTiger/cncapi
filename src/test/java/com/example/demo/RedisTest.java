package com.example.demo;

import com.example.demo.redis.SequenceUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private SequenceUtils sequenceUtil;



    @Test
    public void test() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String preStr = simpleDateFormat.format(date);
        System.out.println(preStr + sequenceUtil.getAutoFlowCode());
    }

    @Test
    public void test01() {


    }

}
