package creational.singleton;

public class Main {
    public static void main(String[] args) {
        
        // private constructor, we can't create an object with this way.
        // singleton = new Singleton();

        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton.secret);
        System.out.println(singleton.number);
    }
}
