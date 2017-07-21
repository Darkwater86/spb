package com.example.demo.controller;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Mr.Darkwater on 2017/7/20.
 */
@Controller
@RequestMapping("/product")
public class ProductListController {
    @GetMapping("/list")
    public String getProductList(Model model){
        final ProductService productService = new ProductService();
        final List<Product> allProducts = productService.findAll();
        model.addAttribute("prods",allProducts);
        return "product/list";
    }
}
