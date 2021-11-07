package com.company;
import java.util.ArrayList;
public class Caine extends Animal{
    ArrayList<String> properties = new ArrayList<String>();

    public Caine(String name, String age) {
        super();
        this.name = name;
        this.age = age;
    }

    Caine(String type, String name, String age, String prop) {
        super(type, name, age, prop);
    }

    public void addprop(String prop) {
        properties.add(prop);
    }

    public void display_caine() {
        System.out.print("Caine: { " + name + ", " + age);
        for (int i = 0; i < properties.size(); i++ )
            System.out.print(", " + properties.get(i));

        System.out.print(" }");
    }
}
