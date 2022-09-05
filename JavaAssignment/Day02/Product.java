package com.sonata02;

public class Product {
    int proID;
    String proName;
    double proPrice;



   public double proprice(double proPrice ) {
        double p= proPrice + (proPrice*0.18);
        return p;
                
    }



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        Product p =new Product();
        p.proID=121;
        p.proName="Phone";
        System.out.println(p.proID);
        System.out.println(p.proName);
        System.out.println("Gst \t"+p.proprice(100));
    }



}