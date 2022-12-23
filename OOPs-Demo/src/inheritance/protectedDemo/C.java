package inheritance.protectedDemo;

public class C extends A{

    public void printValues(){
        A a = new A();
        System.out.println(a.pubValue); // possible as it is a public value
        System.out.println(a.defValue); // possible as it is default and accessible inside the package
        System.out.println(a.proValue); // possible as it is protected and accessible inside the same package
        a.proMethod();
        System.out.println(a.x);
    }
}
