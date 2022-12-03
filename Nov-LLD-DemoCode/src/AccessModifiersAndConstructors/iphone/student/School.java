package AccessModifiersAndConstructors.iphone.student;

public class School {
    String name;
    String address;
    int level;
    int fees;

    public School(String name, String address, int level, int fees) {
        this.name = name;
        this.address = address;
        this.level = level;
        this.fees = fees;
    }

    public School(String name, String address, int level) {
        this.name = name;
        this.address = address;
        this.level = level;
    }

    public School(String name) {
        this.name = name;
    }

    //default constructor -> number of args = 0
    // data will be initialised as default values
    // string - null, int - 0, boolean - false
//    public School() {
//    }


    //No Args constructor
    // number of args - 0
    // data will not be initialised to default values
    public School() {
        name = "ABCD School";
        level = 10;
        fees = 100;
    }
}

