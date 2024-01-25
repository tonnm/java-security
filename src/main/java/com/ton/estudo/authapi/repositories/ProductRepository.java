package com.ton.estudo.authapi.repositories;

import com.ton.estudo.authapi.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
