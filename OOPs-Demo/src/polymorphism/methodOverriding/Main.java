package polymorphism.methodOverriding;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        ICEVehicle ice = new ICEVehicle();
        ElectricVehicle ev = new ElectricVehicle();

        v.blowHorn();
        ice.blowHorn();
        ev.blowHorn();

        v.startEngine();
        System.out.println("-----------");
        ice.startEngine();
        System.out.println("-----------");
        ev.startEngine();
    }
}
