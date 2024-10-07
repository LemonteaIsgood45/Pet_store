package com.example.project.Pet_store.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "product")
public class Product {

    @Id
    private long id;

    @NotNull
    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_manufacturer")
    private String productManufacturer;

    @Column(name = "product_unit_stock")
    private String productUnitStock;

    @Min(value = 100)
    @Column(name = "product_price")
    private double productPrice;

    @PositiveOrZero
    @Column(name = "product_in_stock")
    private int productInStock;

    public Product() {

    }

    public Product(Integer id, String productName, String productCategory, String productDescription, String productManufacturer, String productUnitStock ,double productPrice, Integer productInStock) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productManufacturer = productManufacturer;
        this.productPrice = productPrice;
        this.productUnitStock = productUnitStock;
        this.productInStock = productInStock;
    }

    @Override
    public String toString() {
        return String.format("Product[Name = %s, Category = %s, Description = %s, Manufacturer = %s, Unit = %s, Price = %f, InStock = %d]",
                productName, productCategory, productDescription, productManufacturer, productUnitStock, productPrice, productInStock);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductUnitStock() {
        return productUnitStock;
    }

    public void setProductUnitStock(String productUnitStock) {
        this.productUnitStock = productUnitStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductInStock() {
        return productInStock;
    }

    public void setProductInStock(int productInStock) {
        this.productInStock = productInStock;
    }
}
