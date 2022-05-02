package com.kodilla.collections.Lists.Homewrk;

import com.kodilla.collections.Interfaces.Homework.Polonez;
import com.kodilla.collections.arrays.Homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Polonez> polonezList = new ArrayList<>();
        polonezList.add(new Polonez(30,20));
        polonezList.add(new Polonez(20,10));
        polonezList.add(new Polonez(30,20));
        polonezList.add(new Polonez(40,10));
        System.out.println("Size :"+polonezList.size());
        for (Polonez polonez:polonezList) {
            CarUtils.describeCar(polonez);
        }

        polonezList.remove(1);
        Polonez polonez = new Polonez(35,25);
        polonezList.add(polonez);
        polonezList.remove(polonez);
        System.out.println("Size :"+polonezList.size());
    }
}
