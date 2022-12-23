package designPatterns.builder;

public class Student {
    private int id;
    private int psp;
    private int yoe;
    private String name;
    private int gradYear;
    private int age;

    // psp > 80, gradYear < 2023, age > 18
    private Student(Builder b){
        this.id = b.id;
        this.age = b.age;
        this.name = b.name;
        this.yoe = b.yoe;
        this.psp = b.psp;
        this.gradYear = b.gradYear;
    }

    //inner class / nested class
    public static Builder builder() {
        Builder b = new Builder();
        return b;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     static class Builder {
        private int id;
        private int psp;
        private int yoe;
        private String name;
        private int gradYear;
        private int age;

        private Builder() {
        }

        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public Builder setPsp(int psp){
            this.psp = psp;
            return this;
        }

        public Builder setYoe(int yoe){
            this.yoe = yoe;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setGradYear(int gradYear){
            this.gradYear = gradYear;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        /**
         *
         * @return student object after validating all required attributes
         * @throws Exception when validation fails, and stops creation of student obj
         */
        public Student build() throws Exception {
            if(gradYear >= 2023){
                throw new Exception("Grad year is not valid");
            }
            if(age < 18){
                throw new Exception("Age is not valid");
            }
            if(psp < 80){
                throw new Exception("PSP is not valid");
            }
            Student s = new Student(this);
            return s;
        }
    }
}

/**
 * Create Student obj only if all the attributes are valid
 */
