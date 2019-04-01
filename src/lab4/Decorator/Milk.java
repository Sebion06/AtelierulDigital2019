package lab4.Decorator;

public class Milk extends CondimentDecorator {

    public Milk(String descprition, float cost, Beverage beverage) {
        super(descprition, cost, beverage);
    }
}
