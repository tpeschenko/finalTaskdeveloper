package org.example.animal.homeAnimals;

import org.example.animal.HomeAnimal;

public class Hamster extends HomeAnimal {
    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", commands=" + commands +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}
