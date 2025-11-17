class A {
    void showA() {
        System.out.println("Inside A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Inside B");
    }
}

class C extends B {
    void showC() {
        System.out.println("Inside C");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
