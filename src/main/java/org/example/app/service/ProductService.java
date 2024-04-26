package org.example.app.service;

import org.example.app.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ProductService {
    private ArrayList<Product> products = new ArrayList<>();

    public Product addProduct(String name) {
        Product product = new Product(UUID.randomUUID(), name);
        products.add(product);
        return product;
    }

    public ArrayList<Product> getProductList() {
        return products;
    }

    public void deleteProduct(UUID uuid) {
        products.remove(getProductById(uuid));
    }

    public Product getProductById(UUID uuid) {
        return products.stream().filter(product -> product.getUUID().equals(uuid)).findFirst().get();
    }

    public void markProduct(UUID uuid) {
        getProductById(uuid).setMarked();
    }
}
