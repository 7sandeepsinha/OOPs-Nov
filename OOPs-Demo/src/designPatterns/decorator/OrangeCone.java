package designPatterns.decorator;

//baseAddOn -> only base
public class OrangeCone implements IceCream{

    //no-args constructor as no previous object is required
    public OrangeCone() {
    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
