package com.gottelicious.neverland.Services;

import com.gottelicious.neverland.Models.Product;
import com.gottelicious.neverland.Models.ProductType;

import java.util.List;

public class ProductService {
    private List<ProductType> productTypes;
    private List<Product> products;

    public List<ProductType> getProductTypes() {
        return productTypes;
    }

    public void save(ProductType productType) {
        productTypes.add(productType);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void save(Product product) {
        products.add(product);
    }
}
