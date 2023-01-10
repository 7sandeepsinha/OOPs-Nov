package designPatterns.decorator;

public class ChocolateSyrup implements IceCream{
    private IceCream iceCream;

    public ChocolateSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Chocolate Syrup";
    }
}
