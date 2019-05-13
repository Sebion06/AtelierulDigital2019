package lab9.Predicate;

import java.util.function.Predicate;

public class Predicate1 {

    public static void main(String[] args) {
        Predicate<String> p1= s ->s.isEmpty();
        System.out.println(("Result= " + p1.test("")));
        Predicate<String> p2= s ->!p1.test(s);
        System.out.println("Result= " + p2.test(""));
    }
}
