package deepAndShallowCopy;


public class Student extends Object{
    public String name;
    public int age;
    public double psp;

    public Student(String name, int age, double psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
    }
}
