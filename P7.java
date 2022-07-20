
public class P7 {
    public static void main(String[] args) {
        Bunny b = new Bunny("cat");
        b.jump();
        b.run();
        b.sleep(10);
        b.eat();
    }
}

interface Animal {

    void jump();

    void run();

    void eat();

    void sleep(int a);
}

class Bunny implements Animal {
    String name = "nameless";

    Bunny(String n) {
        name = n;
    }

    public void jump() {
        System.out.println(name + " jumps");
    }

    public void sleep(int x) {
        System.out.println(name + " sleeps for " + x + " minutes");
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public void run() {
        System.out.println(name + " runs");
    }

}
