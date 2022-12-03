package AccessModifiersAndConstructors.iphone;

public class IPhoneClient {
    public static void main(String[] args) {
        Iphone iphone11 = new Iphone(11,60000,6,4, 64,2,1,4000);
        Iphone iphone12 = new Iphone(iphone11);
    }
}
// Student s2 = new Student(s1);
// Iphone iphone12 = new Iphone(iphone11);