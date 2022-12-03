package constructorChaining;

public class Referral extends Student{
    public Referral(String name, String email, String password) {
        super(name, email, password);
        System.out.println("Referral constructor - start");
        System.out.println("Referral constructor - end");
    }
}
// For default or no-args constructor we dont need to do anything
// super -> allows to access parent class members from child class