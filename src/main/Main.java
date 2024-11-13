package main;

import box.BoxWeight;
import inheritanceCat.Cat;
import inheritanceCat.Lion;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion();
        lion.showInfo();
        lion.eat();
        System.out.println("******");
        Cat cat = new Cat();
        cat.showInfo();
        cat.eat();
        System.out.println("****************");
        BoxWeight boxWeight = new BoxWeight(3,5,2,4);
        boxWeight.showInfo();


    }
}

