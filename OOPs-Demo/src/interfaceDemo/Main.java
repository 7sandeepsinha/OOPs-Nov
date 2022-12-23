package interfaceDemo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Rabbit());

        for(Animal a : animals){
            a.eat();
            a.run();
            a.walk();
        }

        Stack<Integer> s = new Stack<>(); // can be implemented directly
        Queue<Integer> qLL = new LinkedList<>(); // cant be implemented directly as queue is an interface

    }

    public static void survive(Animal animal){
        animal.walk();
        animal.eat();
        animal.run();

    }

    //survive(Dog)
    //survive cat

 }

