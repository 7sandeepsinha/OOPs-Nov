package polymorphism.methodOverriding;

import inheritance.protectedDemo.A;

import java.util.ArrayList;
import java.util.List;

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

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(v); //vehicle -> speed -> public
        vehicles.add(ev); // ev -> speed -> private
        vehicles.add(ice);
        int sum = 0;
        for(Vehicle vehicle : vehicles){
            sum = sum + vehicle.speed(50);
        }
    }
}

// 4 object in List
// 3 obj -> Parent -> speed() -> returns an int
// 1 obj -> Child -> speed() -> returns a void or String