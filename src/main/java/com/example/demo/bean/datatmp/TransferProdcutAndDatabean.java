package com.example.demo.bean.datatmp;

import com.example.demo.bean.Product;

import java.io.Serializable;

public class TransferProdcutAndDatabean implements Serializable {

    private static final long serialVersionUID = -4774049239286077731L;

    public Product dataBeanToProduct(DataBean dataBean) {

        Product product = new Product();

        /********************1.uploadTime----loginname*************************/
        product.setUploadTime(dataBean.getUploadTime());
        product.setVersion(dataBean.getVersion());
        product.setMacAxNum(dataBean.getMacAxNum());

        product.setMacModel(dataBean.getMacModel());
        product.setMacNO(dataBean.getMacNO());
        product.setMacSN(dataBean.getMacSN());

        product.setIpcCode(dataBean.getIpcCode());
        product.setContractCode(dataBean.getContractCode());
        product.setCustomerName(dataBean.getCustomerName());
        product.setLoginName(dataBean.getLoginName());

        /********************2.ncVer************************************/
        product.setNcVer(dataBean.getNcVer());


        /********************3.servoVer*************************/
        product.setServos(dataBean.getServos());

        /********************4.elecDataList*************************/



        return product;
    }


    public DataBean productToDataBean(Product product) {
        DataBean dataBean = new DataBean();

        //TODO


        return dataBean;
    }



}
