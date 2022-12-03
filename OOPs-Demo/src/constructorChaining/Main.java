package constructorChaining;

public class Main {
    public static void main(String[] args) {
        Referral rf = new Referral("Bhargava", "bhargava@email.com", "pass123");
        System.out.println("Email : " + rf.email);
        System.out.println("Name : " + rf.name);
    }
}


/// User(name, email, password) -> Student -> Referral
/// "" -> all 3 classes all attributes will be initialised with ""


/*
        Referral class object -> need to initialise the attributes
        To initialise referral class object -> we need to initialise parent of referral class ( Student )

        means, before Referral class constructor is invoked, Student class constructor is invoked

        Student class object -> need to initialise the attributes
        To initialise Student class object -> we need to initialise parent of Student class ( User )

        means, before Student class constructor is invoked, User class constructor is invoked

        main -> Referral() -> Student() -> User() { user completes execution } -> Student() -> Referral()
 */