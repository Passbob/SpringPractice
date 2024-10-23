package com.practice.springpractice.domain.product.model.service;

import com.practice.springpractice.domain.product.model.dao.ProductMapper;
import com.practice.springpractice.domain.product.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductMapper productMapper;


    public ProductService(ProductMapper productMapper){
        this.productMapper = productMapper;
    }


    public List<ProductDTO> viewAllProduct() {

        return productMapper.viewAllProduct();
    }
}
