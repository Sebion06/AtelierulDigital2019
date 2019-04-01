package lab4.Decorator;

public class Main {
    public static void main(String[] args){
        Beverage darkRoast= new DarkRoast();
        Beverage milk= new Milk("Fat milk",4, darkRoast);
        Beverage whip= new Whip("Sweet Whip", 5, milk);
        Beverage mocha= new Mocha("mocha", 6,whip);
        System.out.println("Total cost = " + mocha.getCost());
        System.out.println("Description: " + mocha.getDescprition());
    }

}
