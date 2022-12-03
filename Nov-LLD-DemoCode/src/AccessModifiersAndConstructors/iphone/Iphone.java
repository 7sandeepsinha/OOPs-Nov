package AccessModifiersAndConstructors.iphone;

public class Iphone {
    public int series;
    public int price;
    public double screen;
    public int ram;
    public int storage;
    public int numberOfCamera;
    public int numberOfPorts;
    public int batterySize;

    public Iphone(int pSeries, int pPrice, int pScreenSize, int pRam, int pStorage, int pNumberOfCamera,
                  int pNumberOfPorts, int pBatterySize){

        series = pSeries;
        price = pPrice;
        screen = pScreenSize;
        ram = pRam;
        storage = pStorage;
        numberOfCamera = pNumberOfCamera;
        numberOfPorts = pNumberOfPorts;
        batterySize = pBatterySize;
    }

    //copy constructor -> pass the entire object as a parameter
    public Iphone(Iphone iphone){
        series = iphone.series + 1 ;
        price = iphone.price + 10000;
        screen = iphone.screen;
        ram = iphone.ram;
        storage = iphone.storage;
        numberOfCamera = iphone.numberOfCamera;
        numberOfPorts = iphone.numberOfPorts;
        batterySize = iphone.batterySize;
    }
}
// adds a default when there are absolutely no constructors in the class
// creates an object and initialises it with default in the beginning of all constructors