package designPatterns.decorator;

public class ChocoChip implements IceCream{
    private IceCream iceCream;

    public ChocoChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Chocolate Chips";
    }
}
