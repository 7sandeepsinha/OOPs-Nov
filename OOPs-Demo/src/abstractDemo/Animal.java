package abstractDemo;

public abstract class Animal {
    public String name;
    public int age;
    public int numberOfLegs; //4

    // here constructor is used only for initialising the variables
    // we can't create object of an abstract class
    public Animal() {
        this.numberOfLegs = 4; //maintain number of connection ->
    }

    public void breathe(){
        System.out.println("Animal is breathing");
    }

    public abstract void walk();
}
