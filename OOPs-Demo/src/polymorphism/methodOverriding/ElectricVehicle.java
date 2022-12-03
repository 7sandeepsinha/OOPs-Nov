package polymorphism.methodOverriding;

public class ElectricVehicle extends Vehicle{

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Start electric motors");
        System.out.println("Started electric vehicle");
    }

    public void blowHorn(){
        System.out.println("Blowing horn in ElectricVehicle");
    }
}
