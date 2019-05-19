package com.anjuc.utils.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public Product findProductByProductCode(String ProductCode);
    public void deleteProductById (int id);
    public Product findProductById (int id);
}
