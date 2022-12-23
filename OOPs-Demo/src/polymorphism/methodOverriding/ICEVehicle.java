package polymorphism.methodOverriding;

public class ICEVehicle extends Vehicle{

    @Override
    public void startEngine(){ ///startEngine() -> overriding
        super.startEngine();
        System.out.println("Start ignition and combustion");
        System.out.println("ICE engine started");
    }

    public void blowHorn(){
        System.out.println("Blowing horn in ICEVehicle");
    }

    @Override
    public int speed(int speed){
        System.out.println("Runs with 60kmhr");
        return 60;
    }

}

