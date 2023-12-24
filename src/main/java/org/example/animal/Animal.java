package org.example.animal;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.animal.chewingAnimals.Camel;
import org.example.animal.chewingAnimals.Horse;
import org.example.animal.chewingAnimals.Mule;
import org.example.animal.homeAnimals.Cat;
import org.example.animal.homeAnimals.Dog;
import org.example.animal.homeAnimals.Hamster;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@ToString
public class Animal {
    protected String name;
    protected String color;
    protected List<String> commands;
    protected Date dateBirth;
    protected AnimalView view;
    public static List<Animal> allAnimals = new ArrayList<>();


    public Animal() {
        this.commands = new ArrayList<String>();
    }

    public static void showAnimal() {
        int count = 1;
        for (Animal i : allAnimals) {
            System.out.println(count + " - " + i);
            count += 1;
        }
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void removeCommand(String command) {

        commands.remove(command);
    }

    public static Animal addAnimalView(Animal animal, int choice) {
        switch (choice) {
            case 1:
                animal.setView(AnimalView.HOME);
                break;
            case 2:
                animal.setView(AnimalView.CHEWING);
                break;
            default:
                System.out.println("Неверный ввод");
        }
        return animal;


    }

    public static void setNewAnimal(int numberAnimal){
        switch (numberAnimal){
            case 1:
                allAnimals.add(addAnimalView(new Cat(), 1));
                System.out.println("Вы завели Кота");
                Count.add();
                break;
            case 2:
                allAnimals.add(addAnimalView(new Dog(), 1));
                System.out.println("Вы завели Собаку");
                break;
            case 3:
                allAnimals.add(addAnimalView(new Hamster(), 1));
                System.out.println("Вы завели Хомяка");
                Count.add();
                break;
            case 4:
                allAnimals.add(addAnimalView(new Camel(), 2));
                System.out.println("Вы завели Верблюда");
                Count.add();
                break;
            case 5:
                allAnimals.add(addAnimalView(new Horse(), 2));
                System.out.println("Вы завели Лошадь");
                Count.add();
                break;
            case 6:
                allAnimals.add(addAnimalView(new Mule(), 2));
                Count.add();
                break;
        }
    }
}
