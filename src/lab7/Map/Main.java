package lab7.Map;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Andrei", 123454);
        Person p2 = new Person("Andreea", 212334);
        Person p3 = new Person("Vlad", 238591);

        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(p1.getCnp(), p1);
        map.put(p2.getCnp(), p2);
        map.put(p3.getCnp(), p3);

        System.out.println(map.get(123454));
    }

}
