package com.anjuc.utils.Product;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "product_code", nullable = false, unique = true)
    private String productCode;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name ="product_description", nullable = false)
    private String productDescription;

    @Column(name = "product_category",nullable = true)
    private String productCategory;

    @Column(name = "product_image", nullable = true)
    private String productImage;

    @Column(name = "product_seller_id", nullable = false)
    private int productSellerId;

    public int getProductSellerId() {
        return productSellerId;
    }

    public void setProductSellerId(int productSellerId) {
        this.productSellerId = productSellerId;
    }

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    public Product(){

    }

    public Product(String productCode, String productName, String productDescription, String productCategory, String productImage){
        this.setProductCode(productCode);
        this.setProductName(productName);
        this.setProductDescription(productDescription);
        this.setProductCategory(productCategory);
        this.setProductImage(productImage);
    }

    public int getId() {
        return id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
