package com.example.demo.services;

import com.example.demo.commands.ProductForm;
import com.example.demo.models.Product;

import java.util.List;

public interface IProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}