package org.example.animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected String color;
    protected List<String> commands;
    protected String dateBirth;

    static int count;

    public Animal() {
        this.commands = new ArrayList<String>();
        count += 1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }


    public void addCommand(String command){
        commands.add(command);
    }
    public void removeCommand(String command) {

        commands.remove(command);
    }
}
