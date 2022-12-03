package deepAndShallowCopy;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Kiran", 25, 99); //734
        Student s2 = s1; //shallow copy // 734
        Student s3 = new Student(s1); // deep copy // 737
        s1.age = 28;
        s2.age = 30;
        System.out.println(s1.age);

    }
}
