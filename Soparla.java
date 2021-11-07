package com.company;
import java.util.ArrayList;

public class Soparla extends Animal {
    ArrayList<String> properties = new ArrayList<String>();

    public Soparla(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void addprop(String prop) {
        properties.add(prop);
    }

    public void display_soparla() {
        System.out.print("Soparla: { " + name + ", " + age);
        for (int i = 0; i < properties.size(); i++ )
            System.out.print(", " + properties.get(i));

        System.out.print(" }");
    }
}
