package com.example.project.Pet_store.repository;

import com.example.project.Pet_store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();

    Optional<Product> findById(Long id);

//    @Query(value = "SELECT t FROM Product t WHERE t.product_name = ?1", nativeQuery = true)
    List<Product> findByProductName(String productName);

    @Query(value = "SELECT t FROM Product t WHERE t.product_category = ?1", nativeQuery = true)
    List<Product> findByCategory(String productCategory);

    @Query(value = "SELECT t FROM Product t WHERE t.product_manufacturer = ?1", nativeQuery = true)
    List<Product> findByManufacturer(String productManufacturer);

//    @Query("INSERT INTO product(id, product_name, product_category, product_description, product_manufacturer, product_unit_stock, product_price, product_in_stock) " +
//            "values(?, ?, ?, ?, ? ,? ,? ,?)")
//    void add( Product product);

    void delete(Product product);

    Product save(Product product);

}
