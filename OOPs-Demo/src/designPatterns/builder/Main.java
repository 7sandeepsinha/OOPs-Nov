package designPatterns.builder;

public class Main {
    public static void main(String[] args) throws Exception {
        // Student s = Student.getStudentObj(1, 81,2,"Jajna",
        //        2018, 25);
        // Student.getStudentObj -> called Builder constructor
        // all validations happened inside Builder cons, and then we use
        // builder object to create Student obj

//        Builder b = Student.builder();
//        b.setId(1);
//        b.setPsp(81);
//        b.setName("Neha");
//        b.setYoe(4);
//        b.setGradYear(2018);
//        b.setAge(24);
//
//        Student s = b.build();
//        System.out.println(s.getName());
//        System.out.println(s.getGradYear());

         Student s = Student.builder()
                 .setId(1)
                 .setPsp(81)
                 .setName("Neha")
                 .setGradYear(2018)
                 .setYoe(4)
                 .setAge(24).build();

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

/*
     class A {
       class B
     }

     objA.new B();

     class A{
      static class B{
        }
     }

     new B();
 */