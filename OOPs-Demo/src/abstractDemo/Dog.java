package abstractDemo;

public class Dog extends Animal{

    public Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
    }

    @Override
    public void walk() {
        System.out.println("Dog is running");
    }
}
