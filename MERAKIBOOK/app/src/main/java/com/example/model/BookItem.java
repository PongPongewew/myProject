package com.example.model;

public class BookItem {
    private int productHinh;
    private  String productName, productTacGia;

    public void setProductHinh(int productHinh) {
        this.productHinh = productHinh;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductTacGia(String productTacGia) {
        this.productTacGia = productTacGia;
    }

    public int getProductHinh() {
        return productHinh;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductTacGia() {
        return productTacGia;
    }

    public BookItem(int productHinh, String productName, String productTacGia) {
        this.productHinh = productHinh;
        this.productName = productName;
        this.productTacGia = productTacGia;

    }
}
