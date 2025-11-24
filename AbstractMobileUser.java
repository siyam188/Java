// File name: Main.java

public abstract class MobileUser {
    void call() {
        System.out.println("Call methods");
    }

    abstract void sendMessage();
}

class Karim extends MobileUser {
    @Override
    void sendMessage() {
        System.out.println("Hi I am Karim");
    }
}

class Rahim extends MobileUser {
    @Override
    void sendMessage() {
        System.out.println("Hi I am Rahim");
    }
}

public class Main {
    public static void main(String[] args) {
        MobileUser mu;

        mu = new Rahim();
        mu.sendMessage();  

        mu = new Karim();
        mu.sendMessage();  

        mu.call();         
    }
}
