package com.unitedcoder.jsonfile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    @JsonProperty("product-name")
    private String productName;
    @JsonProperty("product-code")
    private String productCode;
    @JsonProperty("manufacturer")
    private String productManufacturer;
    @JsonProperty("category")
    private String productCategory;

    public Product() {
    }

    public Product(String productName, String productCode, String productManufacturer, String productCategory) {
        this.productName = productName;
        this.productCode = productCode;
        this.productManufacturer = productManufacturer;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public String getProductCategory() {
        return productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productcode='" + productCode + '\'' +
                ", productManufacturer='" + productManufacturer + '\'' +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}