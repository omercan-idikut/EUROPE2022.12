package com.unitedcoder.jsonfile.week15;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteJsonFile {
    public static void main(String[] args) {
        ProductHW product1=new ProductHW(true,"iphone12x","apple","iphone12x",
                10.5,5,8,100,10,true);

        ProductHW product2=new ProductHW(true,"MacBook","apple","MacBook pro",
                1500,30,40,150,15,true);
        ProductHW product3=new ProductHW(true,"Ipad","apple","Ipad mini",
                400,20,30,120,12,true);
        List<ProductHW> productList=new ArrayList<>();
        productList.addAll(Arrays.asList(product1,product2,product3));
        ObjectMapper mapper=new ObjectMapper();
        Products products=new Products(productList);
        String objectValue=null;
        try {
            objectValue=mapper.writeValueAsString(products);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File("testdatafolders//multipleProducts-info.json"),objectValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

