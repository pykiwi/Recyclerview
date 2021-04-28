package com.example.ongiuaky4;

import java.io.Serializable;

public class Cake implements Serializable  {
    private String cakeName;
    private int cakeImg;
    private String description;
    private double price;

    public Cake(String cakeName, int cakeImg, String description, double price) {
        this.cakeName = cakeName;
        this.cakeImg = cakeImg;
        this.description = description;
        this.price = price;
    }

    public int getCakeImg() {
        return cakeImg;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeImg(int cakeImg) {
        this.cakeImg = cakeImg;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
