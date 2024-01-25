package com.ton.estudo.authapi.domain.product;

public record ProductResponseDTO(int id, String name, Integer price) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getPrice());
    }
}