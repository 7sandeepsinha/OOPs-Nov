package designPatterns.prototype;

public interface Prototype<T>{
    T clone();
}


/**
 * public interface StudentPrototype {
        Student clone();
 * }
 *
 * public interface TeachPrototype{
 *     Teacher clone();
 * }
 *
 * public interface NotebookPrototype{
 *     Notebook clone();
 * }
 */