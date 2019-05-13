package lab9.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda1 {
    public static void ex1() {
        List<String> list = new ArrayList<>(Arrays.asList("Ana", "Bogdan", "Ana"));
        Optional<String> a = list.stream().map(s -> "" + s.charAt(0)).
                reduce((String current, String acc) -> acc + current);
        System.out.println(a);
    }

    public static void ex2() {
        List<String> list = new ArrayList<>(Arrays.asList("A", "BB", "A"));
        list.stream().filter((String s) -> s.length() % 2 == 0).forEach(System.out::println);
        System.out.println("List = " + list);
    }

    public static void main(String[] args) {
        Lambda1.ex1();
        Lambda1.ex2();
    }
}
