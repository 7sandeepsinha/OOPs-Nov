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

        Student aprBatchTemplate = studentRegistry.get("Apr-LLD");
        Student mayBatchTemplate = studentRegistry.get("May-LLD");
    }
}
