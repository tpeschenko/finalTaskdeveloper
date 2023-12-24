package org.example.animal.chewingAnimals;

import org.example.animal.ChewingAnimal;

public class Horse extends ChewingAnimal {

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", commands=" + commands +
                ", dateBirth='" + dateBirth + '\'' +
                ", view=" + view +
                '}';
    }
}
