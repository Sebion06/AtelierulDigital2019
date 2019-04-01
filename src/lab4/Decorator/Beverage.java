package lab4.Decorator;

public abstract class Beverage {
    protected String descprition;
    protected float cost;

    public Beverage(String descprition, float cost) {
        this.descprition = descprition;
        this.cost = cost;
    }

    public String getDescprition() {
        return descprition;
    }

    public float getCost() {
        return cost;
    }
}
