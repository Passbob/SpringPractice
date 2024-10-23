package com.practice.springpractice.domain.product.model.dao;

import com.practice.springpractice.domain.product.model.dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductDTO> viewAllProduct();
}
