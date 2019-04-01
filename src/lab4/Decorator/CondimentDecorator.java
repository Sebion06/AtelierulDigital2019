package lab4.Decorator;

public class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(String description, float cost, Beverage beverage) {
        super(description, cost);
        this.beverage = beverage;
    }

    public String getDescprition() {
        return descprition + " " + beverage.getDescprition();
    }

    public float getCost() {
        return cost + beverage.getCost();
    }
}