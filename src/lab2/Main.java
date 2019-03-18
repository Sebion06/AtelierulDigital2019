package lab2;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        System.out.println("lmao");
        Book book = new Book(30);
        System.out.println("price: " + book.getPrice());
        displayMethods(book);
    }

    public static void displayMethods(Book book) {
        Class c = book.getClass();
        Method[] allMethods = c.getMethods();
            for(Method m:allMethods){
                System.out.println(m);
            }

    }
}
