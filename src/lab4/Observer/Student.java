package lab4.Observer;

public class Student implements Observer {
    private String name;

    public Student(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name+ " learned about "+  message);
    }

    public void listenTO(ObservedSubject os) {
        os.register(this);
    }
}
