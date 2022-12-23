package interfaceDemo;

public class Dog implements Animal{

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void walk(){
        System.out.println("Dog is walking");
    }

    @Override
    public void run(){
        System.out.println("Dog is running");
    }
}

// All animals can walk, run and eat
// All animals walk, run and eat in their own way -> own implementations

