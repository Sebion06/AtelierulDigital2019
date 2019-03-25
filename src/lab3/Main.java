package lab3;

public class Main {
    public static void main(String[] args){
        Animal cat= new Cat();
        Animal spider= new Spider();
        Animal fish= new Fish();
        Pet fishPet= new Fish("Fish1");
        Pet catPet= new Cat("Cat1");
        Cat catCat= new Cat();
        catPet.play();
        fishPet.play();
        catCat.play();
        fish.eat();

    }
}
