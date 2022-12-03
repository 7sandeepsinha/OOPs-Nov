package polymorphism.methodOverloading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(123);
        System.out.println(true);

        add(1,2);

        Calculator c = new Calculator();
        c.add(1,2); //add(int, int)
        c.add(1,2.2); //add(int, double)
        c.add(1.1,2.2); //add(double, double)
        c.add(1.1,2); //add(double, int)

        //method overloading -> compile time polymorphism
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }
}
