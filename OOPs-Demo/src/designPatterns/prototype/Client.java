package designPatterns.prototype;

public class Client {
    public static StudentRegistry fillUpRegister(StudentRegistry studentRegistry){
        Student aprBatch = new Student();
        aprBatch.setAvgBatchPsp(80);
        aprBatch.setBatchName("Apr-LLD");
        aprBatch.setYearOfEnrollment(2022);
        studentRegistry.register(aprBatch);

        Student mayBatch = new Student();
        mayBatch.setAvgBatchPsp(85);
        mayBatch.setBatchName("May-LLD");
        mayBatch.setYearOfEnrollment(2022);
        studentRegistry.register(mayBatch);

        Student janBatch = new Student();
        janBatch.setAvgBatchPsp(100);
        janBatch.setBatchName("Jan-LLD");
        janBatch.setYearOfEnrollment(2023);
        studentRegistry.register(janBatch);

        IntelligentStudent intelligentAprBatch = new IntelligentStudent();
        intelligentAprBatch.setAvgBatchPsp(80);
        intelligentAprBatch.setBatchName("Intelligent-Apr-LLD");
        intelligentAprBatch.setYearOfEnrollment(2022);
        intelligentAprBatch.setIq(100);
        studentRegistry.register(intelligentAprBatch);

        return studentRegistry;
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry = fillUpRegister(studentRegistry);

        Student aprBatchStudent = studentRegistry.get("Apr-LLD").clone();
        aprBatchStudent.setId(1);
        aprBatchStudent.setName("Bhanu");
        aprBatchStudent.setAge(23);
        Student mayBatchStudent = studentRegistry.get("May-LLD").clone();
    }
}
