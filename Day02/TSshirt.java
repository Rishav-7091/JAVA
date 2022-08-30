package com.sonata02;

public class TSshirt {
    String color;
    String material;
    String design;
    TSshirt (String color, String material, String design){
        this.color=color;
        this.material=material;
        this.design=design;
    }
    public void small() {
        System.out.println("T shirt of size small "+color+"\t"+material+"\t"+design);
    }
    public void large() {
    System.out.println("Tshirt of size Large "+color+"\t"+material+"\t"+design);
    }
    public void x_large() {
        System.out.println("TShirt of size Xtra Large "+color+"\t"+material+"\t"+design);
   }
    public static void main(String[] args) {
        TSshirt Small =new TSshirt("red","Nylon","Stripes");
        TSshirt large =new TSshirt("Blue","Polythene","Checks");
        TSshirt x_large =new TSshirt("Black","Cotton","lines");
        
        Small.small();
        large.large();
        x_large.x_large();    
    }
}