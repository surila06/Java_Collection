package org.example.arrayPractice;

public class Shop {
     int Productno;
     String shopName;
     int Stock;

    public Shop(int productno, String shopName, int stock) {
        Productno = productno;
        this.shopName = shopName;
        Stock = stock;
    }

    public int getProductno() {
        return Productno;
    }

    public void setProductno(int productno) {
        Productno = productno;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}
