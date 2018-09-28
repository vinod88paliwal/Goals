package com.collectios.basics;

class SmartPhone implements Comparable<SmartPhone> {
    private String brand;
    private String model;
    private int price;

    public SmartPhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
  
    @Override
    public int compareTo(SmartPhone sp) {
        return this.brand.compareTo(sp.brand);
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "brand=" + brand + ", model=" + model + ", price=" + price + '}';
    }
  
}

