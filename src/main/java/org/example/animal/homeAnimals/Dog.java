package org.example.animal.homeAnimals;

import org.example.animal.HomeAnimal;

public class Dog extends HomeAnimal {


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", commands=" + commands +
                ", dateBirth='" + dateBirth + '\'' +
                ", view=" + view +
                '}';
    }
}
