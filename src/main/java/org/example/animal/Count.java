package org.example.animal;

public class Count {
    private static int count = 0;

    public static void add(){
        count += 1;
    }

    public static int getCount() {
        return count;
    }
}
