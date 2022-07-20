public class P2 {
    public static void main(String[] args) {
        B b = new B();
        b.bmethod();
        b.amethod();
    }
}

class A {
    A() {
        System.out.println("called class A's constructor");
    }

    void amethod() {
        System.out.println("called class A's method");
    }
}

class B extends A {
    B() {
        System.out.println("called class B's constructor");
    }

    void bmethod() {
        System.out.println("called class B's method");
    }
}