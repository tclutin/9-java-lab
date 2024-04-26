package org.example.app.controller;

import org.example.app.controller.Dto.CreateProductDto;
import org.example.app.model.Product;
import org.example.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/items")
    public HttpStatus createProduct(@RequestBody CreateProductDto data) {
        productService.addProduct(data.name);
        return HttpStatus.OK;
    }

    @GetMapping("/items")
    public ArrayList<Product> getItemList()
    {
        return productService.getProductList();
    }

    @DeleteMapping("/items/{id}")
    public HttpStatus deleteItem(@PathVariable UUID id) {
        productService.deleteProduct(id);
        return HttpStatus.OK;
    }

    @PutMapping("/items/{id}")
    public HttpStatus markItem(@PathVariable UUID id) {
        productService.markProduct(id);
        return HttpStatus.OK;
    }
}
