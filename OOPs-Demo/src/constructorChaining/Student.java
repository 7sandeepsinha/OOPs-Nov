package constructorChaining;

public class Student extends User{
    public Student(String name, String email, String password) {
        super(name, email, password);
        System.out.println("Student constructor - start");
        System.out.println("Student constructor - end");
    }
}
