package com.example.demo.controller;

import com.example.demo.bean.Product;
import com.example.demo.bean.datatmp.DataBean;
import com.example.demo.bean.datatmp.TransferProdcutAndDatabean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@Controller
public class ExcelController {



    @RequestMapping("/export")
    public String exportPage(){
        return "export";
    }
    @RequestMapping("/")
    public String importPage(){
        return "import";
    }


    @PostMapping("/excel/import")
    @ResponseBody
    public String excelImport(@RequestBody String json) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        DataBean dataBean = mapper.readValue(json, new TypeReference<DataBean>(){});

        Product product = TransferProdcutAndDatabean.dataBeanToProduct(dataBean);

        return mapper.writeValueAsString(product);
    }


    @GetMapping(value = "/excel/export")
    @ResponseBody
    public String excelExport() throws JsonProcessingException {

        return "success";
    }





}