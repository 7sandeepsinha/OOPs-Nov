package designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map;

    public StudentRegistry() {
        this.map = new HashMap<>();
    }

    void register(Student student){
        map.put(student.getBatchName(), student);
    }

    Student get(String batchName){
        return map.get(batchName);
    }
}
