package com.example.day4recyclerview;

public class itemPOJO {
    int imageLink;
    String itemName;
    double itemPrice;
    int itemQuantity;

    public itemPOJO(int imageLink, String itemName, double itemPrice, int itemQuantity) {
        this.imageLink = imageLink;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
    public int getImageLink() {
        return imageLink;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setImageLink(int imageLink) {
        this.imageLink = imageLink;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
