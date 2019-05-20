package com.example.demo.bean.datatmp;

import com.example.demo.bean.Motor;
import com.example.demo.bean.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TransferProdcutAndDatabean implements Serializable {

    private static final long serialVersionUID = -4774049239286077731L;

    public static Product dataBeanToProduct(DataBean dataBean) {

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

        List<Motor> motors = new ArrayList<>();

        List<ElecData> elecDatas = dataBean.getElecDatas();

        for (ElecData elecData : elecDatas) {
            AxServo axServo = elecData.getAxServo();
            List<NameMinMaxAveCur> nameMinMaxAveCurs = elecData.getNameMinMaxAveCurs();

//            private String axisName;
//            private String servoId;
//            private String elecId;
//            private String servoModel;
//            private String elecModel;

//            private String elecName;
//            private Double min;
//            private Double max;
//            private Double average;
//            private Double cur;


            for (NameMinMaxAveCur nameMinMaxAveCur : nameMinMaxAveCurs) {
                Motor motor = new Motor();

                motor.setAxisName(axServo.getAxisName());
                motor.setServoId(axServo.getServoId());
                motor.setElecId(axServo.getElecId());
                motor.setServoModel(axServo.getServoModel());
                motor.setElecModel(axServo.getElecModel());

                motor.setElecName(nameMinMaxAveCur.getName());
                motor.setMin(nameMinMaxAveCur.getMin());
                motor.setMax(nameMinMaxAveCur.getMax());
                motor.setAverage(nameMinMaxAveCur.getAverage());
                motor.setCur(nameMinMaxAveCur.getCur());


                motors.add(motor);
            }

        }

        product.setMotors(motors);

        return product;
    }


    public DataBean productToDataBean(Product product) {
        DataBean dataBean = new DataBean();

        //TODO


        return dataBean;
    }



}
