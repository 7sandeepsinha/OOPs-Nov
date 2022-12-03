package polymorphism.methodOverloading;

public class Calculator {

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, double b){
        System.out.println(a+b);
    }

    public void add(double a, int b){
        System.out.println(a+b);
    }

    public void add(double a, double b){
        System.out.println(a+b);
    }
}

// 1, 2
// 1.1, 2
// 1, 2.2
// 1.1, 2.2