package lab4.Observer;

import com.sun.xml.internal.ws.assembler.jaxws.MustUnderstandTubeFactory;

public class Main {
    public static void main(String[] args) {
        Teacher teacher= new Teacher();
        Student s1= new Student("Popescu");
        Student s2= new Student("Ionescu");
        Student s3= new Student("Dragomirescu");
        s1.listenTO(teacher);
        s2.listenTO(teacher);
        s3.listenTO(teacher);
        teacher.notifyObserver("OOP");
        teacher.unregister(s1);
        teacher.notifyObserver("Design patters");
    }
}
