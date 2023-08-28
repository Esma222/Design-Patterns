package main.java.designpattern.singleton;

public class Singleton {

    private static Singleton singleton ;
    private Singleton() {
        System.out.println("New object created.");
    }

    public static Singleton getSingleton(){

        if (singleton == null) {//DOUBLE CHECKİNG LOCKED
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        System.out.println("Attempting to create a new object.");
        return singleton;

    }

}
