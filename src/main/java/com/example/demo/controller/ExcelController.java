package com.example.demo.controller;

import com.example.demo.bean.*;
import com.example.demo.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ExcelController {

    @Autowired
    private ProductService productService;

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
//        ObjectMapper mapper = new ObjectMapper();
//        List<ProductInfo> productInfos = mapper.readValue(json, new TypeReference<List<ProductInfo>>(){});
//
//        productInfoService.saveProductAndDevice(productInfos);

        return "success";
    }


    @GetMapping(value = "/excel/export")
    @ResponseBody
    public String excelExport() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//
//        List<ProductInfo> productInfos = productInfoService.getAllProduct();
//
//        String json = mapper.writeValueAsString(productInfos);
//
//        return json;


        return "success";
    }


    @GetMapping(value = "/getJson")
    @ResponseBody
    public String getProductInfo() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//
//        List<ProductInfo> pros = new ArrayList<>();
//        String json = mapper.writeValueAsString(pros);
//
//        return json;

        ObjectMapper objectMapper = new ObjectMapper();




        return "success";
    }


}