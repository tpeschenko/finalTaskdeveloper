package org.example;


import org.example.animal.Animal;
import org.example.animal.Count;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        boolean cheaker = true;
        String choice = "Набор пользователя-> ";
        int number = 0;
        String commandAnimal;



        Animal.setNewAnimal(1);
        Animal.setNewAnimal(2);
        Animal.setNewAnimal(3);
        Animal.setNewAnimal(4);


        while (cheaker) {
            System.out.println("Меню:" +
                    "\n Завести новое животное - 1" +
                    "\n Увидеть список команд, которое выполняет животное - 2" +
                    "\n Обучить животное новым командам - 3");
            System.out.print(choice);
            try {
                Scanner scan = new Scanner(System.in);
                number = scan.nextInt();
                switch (number) {
                    case 1, 2, 3:
                        cheaker = false;
                        break;
                    default:
                        System.out.println("\nТакого пункта в меню нет, повторите попытку");
                }
            } catch (Exception e) {
                System.out.println("Неверный формат ввода");
            }
        }

        cheaker = true;
        while (cheaker){
            if(number == 1){
                System.out.println("\nВыберите животное, которое" +
                        "\nхотите завести:" +
                        "\n Кот - 1" +
                        "\n Собака - 2" +
                        "\n Хомяк - 3" +
                        "\n Верблюд - 4" +
                        "\n Лошадь - 5"+
                        "\n Мул - 6");
                System.out.print(choice);
                try {
                    Scanner scan = new Scanner(System.in);
                    number = scan.nextInt();
                    switch (number){
                        case 1, 2, 3, 4, 5, 6:
                            Animal.setNewAnimal(number);
                            cheaker = false;
                            System.out.print("Кол-во всех ваших животных: ");
                            System.out.println(Count.getCount());
                            break;
                        default:
                            System.out.println("Такого пункта в меню нет.");
                            number = 1;
                    }

                } catch (Exception e) {
                    System.out.println("Неверный формат ввода");
                }

            }else if(number == 2){
                if (Animal.allAnimals.isEmpty()){
                    System.out.println("У вас нет заведенных животных");
                    cheaker = false;
                }else {
                    System.out.println("Выберите номер животного чтобы посмотреть его команды-> ");
                    Animal.showAnimal();
                    System.out.print(choice);
                    try {
                        Scanner scan = new Scanner(System.in);
                        number = scan.nextInt();
                        if(number <= Animal.allAnimals.size() && number > 0)
                        {
                            System.out.print("Команды выбранного животного: ");
                            System.out.println(Animal.allAnimals.get(number - 1).getCommands());
                        }else{
                            System.out.println("Такого номера животного нет");
                        }

                    } catch (Exception e) {
                        System.out.println("Неверный формат ввода");
                    }
                    cheaker = false;
                }
            }else if (number == 3){
                System.out.println("Введите номер животного которого хотите обучить команде");
                Animal.showAnimal();
                System.out.print(choice);
                try {
                    Scanner scan = new Scanner(System.in);
                    number = scan.nextInt();
                    if(number <= Animal.allAnimals.size() && number > 0)
                    {
                        System.out.print("Напишите команду для животного");
                        System.out.print(choice);
                        Scanner scan1 = new Scanner(System.in);
                        commandAnimal = scan1.nextLine();
                        Animal.allAnimals.get(number - 1).addCommand(commandAnimal);
                    }else{
                        System.out.println("Такого номера животного нет");
                    }
                } catch (Exception e) {
                    System.out.println("Неверный формат ввода");
                }
                cheaker = false;
            }
        }

    }
}