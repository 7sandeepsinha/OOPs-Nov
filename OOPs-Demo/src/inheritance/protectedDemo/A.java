package inheritance.protectedDemo;

public class A {
    static protected int proValue;
    public int pubValue;
    int defValue; //default
    private int priValue;
    protected int x;

    protected void proMethod(){
        System.out.println("Inside protected method of class A");
    }
}
