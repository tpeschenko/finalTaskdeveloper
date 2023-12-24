package org.example.animal.homeAnimals;

import org.example.animal.HomeAnimal;

public class Cat extends HomeAnimal {
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", commands=" + commands +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}
