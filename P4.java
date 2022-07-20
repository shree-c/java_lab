public class P4 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(10);
        A a3 = new A("hello", 20);
    }
}

class A {
    A() {
        System.out.println("called default constructor");
    }

    A(int b) {
        System.out.println("called constructor with single integer arg: " + b);
    }

    A(String s, int b) {
        System.out.println("called constructor with a string and an integer: " + s + " " + b);
    }
}
