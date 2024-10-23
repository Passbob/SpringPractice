package com.practice.springpractice.domain.product.controller;

import com.practice.springpractice.domain.product.model.dto.ProductDTO;
import com.practice.springpractice.domain.product.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/sale")
    public String salePage(Model model){

        System.out.println("겟!");

        List<ProductDTO> productList = productService.viewAllProduct();

        model.addAttribute("productList", productList);

        return "product/sale";
    }

}
