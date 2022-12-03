package polymorphism.UpDownCasting;

public class Main {
    public static void main(String[] args) {
        Animal animalDog = new Dog(); //upcasting, implicit casting
        //Dog dogAnimal = (Dog)new Animal(); //downcasting, explicit casting

        animalDog.eats();
        animalDog.breathes();

    }
}
