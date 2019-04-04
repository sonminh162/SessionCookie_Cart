package com.codegym.model;

public class ProductView extends Product{
    private int amount;

    public ProductView() {
    }

    public ProductView(Product product){
        this.setId(product.getId());
        this.setProductPrice(product.getProductPrice());
        this.setProductName(product.getProductName());
        this.setProductName(product.getProductName());
        this.setProductImage(product.getProductImage());
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
