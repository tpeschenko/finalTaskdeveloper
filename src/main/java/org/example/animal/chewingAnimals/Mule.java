package org.example.animal.chewingAnimals;

import org.example.animal.ChewingAnimal;

public class Mule extends ChewingAnimal {
    @Override
    public String toString() {
        return "Mule{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", commands=" + commands +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}
