package Quiz.Generics;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        GenericsErasure<Integer> integerObject= new GenericsErasure<Integer>(12);
        System.out.println(integerObject.getClass().getName());
    }

}
class GenericsErasure<T>{
    T obj;
    GenericsErasure(T obj)
    {
        this.obj=obj;
    }
}