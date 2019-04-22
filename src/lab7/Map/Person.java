package lab7.Map;

public class Person {
    private String name;
    private Integer cnp;

    public String getName() {
        return name;
    }

    public int getCnp() {
        return cnp;
    }


    public Person(String name, Integer cnp) {
        this.name = name;
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cnp=" + cnp +
                '}';
    }

}
