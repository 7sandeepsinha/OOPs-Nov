package AccessModifiersAndConstructors.iphone.student;

public class Student {
    public String name;
    String address;
    public int age;
    public String email;
    String batch;
    double psp;
    String state; // course is paused, ongoing, new joiner, completed

    //default constructor
    public Student(){

    }
    //custom constructor
    public Student(String studentName, int studentAge, double studentPsp){
        //object created with default values
        name = studentName;
        age = studentAge;
        psp = studentPsp;
    }

    void solveProblem(){
        System.out.println("Student is solving problem");
        psp++;
    }

    void pauseCourse(){
        System.out.println("Student has paused course");
        state = "PAUSED";
    }

}
