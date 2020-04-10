package com.company;

//import org.w3c.dom.ls.LSOutput;

public class Samsung extends com.company.Smartphone {
    String smartphonename;
    String wareenty;

    public Samsung(double size, double camera, double price, String processor, String smartphonename, String wareenty) {
        super(size, camera, price, processor);//we can directly delete one parameter and pass the value of that parameter directly in the super
        this.smartphonename = smartphonename;//this keyword is used in constructors and it is as like as a setter in java
        this.wareenty = wareenty;
    }

    void uderwareentyornot() {
        if (wareenty == "YES" || wareenty == "yes" || wareenty == "Yes" || wareenty == "Y" || wareenty == "y") {
            System.out.println("Your Phone is under warrenty");
        } else
            System.out.println("Your Phone is Not under warrenty");
    }

    @Override
    public void hello() {
        super.hello();//Super keyword has been used to call a method from any super class.Generally it is used in method over riding
        System.out.println("Hello I am a Samsung Smartphone");
    }

    public void camera() {//Method Overloading,her deleting the parameter of the method
        System.out.println("Your phone has " +" no of camera ");
    }
}

