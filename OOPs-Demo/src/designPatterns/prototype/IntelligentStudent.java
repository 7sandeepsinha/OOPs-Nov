package designPatterns.prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student); // copy all attributes present in parent[Student]
        this.iq = student.iq; // copy the attribute present in child[IntelligentStudent]
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
