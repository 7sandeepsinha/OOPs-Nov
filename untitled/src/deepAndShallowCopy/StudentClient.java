package deepAndShallowCopy;

public class StudentClient {

    public static void main(String[] args) {
        Student s1 = new Student("Rajiv", 25, 99);
        Student s2 = s1; //shallow copy
        Student s3 = new Student(s1); // deep copy
    }
}
