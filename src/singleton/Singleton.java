package singleton;


public class Singleton {

    // we only want one instance of it
    private Singleton(){
    }

    private static Singleton instance;

    public static Singleton getInstance(){

        if(instance == null)
            instance = new Singleton();

        return instance;
    }
}
