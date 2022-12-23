package inheritance.demoPackage;

import inheritance.protectedDemo.A;

public class B extends A {

    public void printValues(){
        A a = new A();
        System.out.println(a.pubValue);
        //System.out.println(a.defValue); -> not possible as default wont let access outside the package
        System.out.println(A.proValue);
    }
}
