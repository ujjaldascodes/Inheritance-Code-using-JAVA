package com.company;

 final public class Xiaomi extends Samsung {//this class can not be inherited further

    int units;

    public Xiaomi(double size, double camera, double price, String processor, String smartphonename, int units) {
        super(size, camera, price, processor, smartphonename, "YES");
        this.units = units;
    }

    @Override
    public void hello() {
        System.out.println("Hello I am a Xiaomi smartphone");
    }

    public void camera(int number) {
        System.out.println("Your phone has "+number+" no of camera ");
       // super.camera(2);

    }
}