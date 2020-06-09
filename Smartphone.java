package com.company;

public class Smartphone {
    private double size;
    private double camera;
    private double price;
    private String processor;

    public Smartphone(double size, double camera, double price, String processor) {
        this.size = size;
        this.camera = camera;
        this.price = price;
        this.processor = processor;
    }

    public void segment(){
        if (price >15000){
            System.out.println("Your phone is not a budget phone");
        }
        else
            System.out.println("Your phone is a budget phone");
    }

    public void hello(){
        System.out.println("Hello I am a SmartPhone");//It will be over ridden
    }

    public void camera(int number) {
        System.out.println("Your phone has "+number+" no of camera ");
    }

    public static void type(){//Static method
        System.out.println("I am the letest version of the mobile phone till now!!");
    }


    public double getSize() {
        return size;
    }

    public double getCamera() {
        return camera;
    }

    public double getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }
}
