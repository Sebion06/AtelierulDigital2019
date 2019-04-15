package lab6.Shoes;

public class Main {
    public static void main(String[] args) {
        Running r1 = new Running("Red", 40);
        Running r2 = new Running("Red", 40);
        Pair<Running> runningPair = new Pair<>(r1, r2);
        System.out.println(runningPair);
        Heels h=new Heels("brown",37);
       // new Pair<Running>(r1,r2);
    }
}
