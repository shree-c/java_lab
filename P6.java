import java.util.Vector;

public class P6 {
    public static void main(String[] args) {
        System.out.println("creating vector of type Integer: ");
        Vector<Integer> vec = new Vector<Integer>();
        System.out.println("vec.add(10)");
        vec.add(10);
        System.out.println(vec.toString());
        System.out.println("vec.add(20)");
        vec.add(20);
        System.out.println(vec.toString());
        System.out.println("vec.setElementAt(100, 0)");
        vec.setElementAt(40, 0);
        System.out.println(vec.toString());
        System.out.println("vec.get(1)");
        System.out.println(vec.get(1));
        System.out.println("vec.get(5)");
        vec.setSize(5);
        System.out.println(vec.toString());
        System.out.println("vec.clear()");
        vec.clear();
        System.out.println(vec.toString());
    }
}
