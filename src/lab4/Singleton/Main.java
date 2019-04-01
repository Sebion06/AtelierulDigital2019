package lab4.Singleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        if(s1 == s2)
            System.out.println("same object");
        else
            System.out.println("not the same object");
    }
}
