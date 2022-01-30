package creational.singleton;


public class Singleton {
    
    private static Singleton singleton_instance;

    // creating variables that can be changed easily.
    public String secret;
    public int number;

    private Singleton() {
        this.secret = "I am a secret!";
        this.number = 0;
    }

    public static Singleton getInstance() {
        if (singleton_instance == null) {
            singleton_instance = new Singleton();
        }
        return singleton_instance;
    }

}
