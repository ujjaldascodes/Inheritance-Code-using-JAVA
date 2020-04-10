package com.company;

import com.company.Smartphone;

public class Main {

    public static void main(String[] args) {
        Smartphone obj1=new Smartphone(6.0,64,18000,"SD660");
        obj1.segment();
        System.out.println("Your Phone's screen size is "+obj1.getSize()+" and camera is "+obj1.getCamera()+" MP"+" Price is "+obj1.getPrice()+" and powerd by "+obj1.getProcessor());
        obj1.hello();
        obj1.camera(2);
        Smartphone.type();//no object needed class.staticmethod

        System.out.println("----------------------------------------------------------");

        Samsung obj2=new Samsung(5.6,12,9999,"exynox 9611","m31","yes");
        obj2.segment();
        obj2.uderwareentyornot();
        System.out.println("Your Phone's screen size is "+obj2.getSize()+" and camera is "+obj2.getCamera()+" MP"+" Price is "+obj2.getPrice()+" and powerd by "+obj2.getProcessor());
        obj2.hello();
        obj2.camera(4);
        Samsung.type();//Static method is inheritable

        System.out.println("---------------------------------------------------------");


        Xiaomi obj3=new Xiaomi(6.65,108,20000,"SD 730g","Mi note 10",4);
        System.out.println("Your Phone's screen size is "+obj3.getSize()+" and camera is "+obj3.getCamera()+" MP"+" Price is "+obj3.getPrice()+" and powerd by "+obj3.getProcessor());
        obj3.uderwareentyornot();
        obj3.hello();
        obj3.segment();
        obj3.camera(5);
        Xiaomi.type();

    }
}
