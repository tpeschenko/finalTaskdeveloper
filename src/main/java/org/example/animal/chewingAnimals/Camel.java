package org.example.animal.chewingAnimals;

import org.example.animal.ChewingAnimal;

public class Camel extends ChewingAnimal {

    @Override
    public String toString() {
        return "Camel{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", commands=" + commands +
                ", dateBirth='" + dateBirth + '\'' +
                ", view=" + view +
                '}';
    }}
