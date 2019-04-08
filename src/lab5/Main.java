package lab5;

public class Main {
    public static void main(String[] args) {
        IOOperations ioo = new IOOperations();
        String text = ioo.readFromFile("src//lab5//read.txt");
        System.out.println(text);
        ioo.writeToFile(text,"src//lab5//write.txt");
        //ioo.readFromKeyboard();
    }
}