package singleton;

public class Singleton {
    private static Singleton instance;
    private String value;

    private Singleton() {       //constructor has to be private so that we don't allow other classes to create instance of this class.
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {                //For thread safety. So that two different threads do not create two different instance of the class.
                if(instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setValue("Singleton Class value");
        System.out.println(Singleton.getInstance().getValue());
    }
}
