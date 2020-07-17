package com.company.emrys.builder.pattern;

import com.company.emrys.builder.pattern.Animal;
import com.company.emrys.builder.pattern.Type;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Animal animal = new Animal.AnimalBuilder().name("Dog").food("dog food").speed(20).type(Type.LAND).build();

        System.out.println(animal.getName());

        Animal animal1 = new Animal.AnimalBuilder().name("Dog").build();

        System.out.println(animal1.getAverageLive());


    }
}
