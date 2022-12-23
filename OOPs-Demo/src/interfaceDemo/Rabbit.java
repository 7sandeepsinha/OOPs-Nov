package interfaceDemo;

public class Rabbit implements Animal{

    @Override
    public void eat(){
        System.out.println("Rabbit is eating");
    }

    @Override
    public void walk(){
        System.out.println("Rabbit is walking");
    }

    @Override
    public void run(){
        System.out.println("Rabbit is running");
    }
}
