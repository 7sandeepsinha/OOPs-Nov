package designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream ic = new ChocolateScoop(
                            new VanillaScoop(
                                new ChocolateSyrup(
                                    new OrangeCone())));

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}

/*
      Choose a cone :
       1. Orange Cone, 2. Chocolate
       1 -> IceCream ic = new OrangeCone();

       Choose a topping :
       1. Chocolate Cone 2. Chocolate Syrup 3. Vanilla Scoop 4. Chocolate Scoop
       2. -> ic = new ChocolateSyrup(ic);

       Choose a topping :
       1. Chocolate Cone 2. Chocolate Syrup 3. Vanilla Scoop 4. Chocolate Scoop
       3. ic = new VanillaScoop(ic);
 */