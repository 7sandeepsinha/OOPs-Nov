package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        Student s1 = new Student("Rajiv", "r@email.com", "123");
        Student s2 = new Student("Srikanth", "s@email.com", "123");
        Mentor m1 = new Mentor("Krishnasamy", "k@email.com", "123");
        TA t1 = new TA("Abhay", "a@email.com", "123");

        users.add(s1); //users[0] = s1;
        users.add(s2); //users[1] = s2;
        users.add(m1);
        users.add(t1);

        printNames(users);
    }

    public static void printNames(List<User> users){
        for(int i=0; i<users.size(); i++){
            System.out.println(users.get(i).name);
        }
    }
}
