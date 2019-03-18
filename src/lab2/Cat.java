package lab2;

public class Cat extends Animal{
    static void classMethod(){
        System.out.println("static cat");
    }
    void instanceMethod(){
        System.out.println("instance cat");
    }
    public static void main(String [] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myAnimal.instanceMethod();
        Animal.classMethod();
    }
}
