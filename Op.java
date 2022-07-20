package Mymath;

public class Op {
    int x, y;

    public Op(int a, int b) {
        x = a;
        y = b;
    }

    public int add() {
        return (y + x);
    }

    public int product() {
        return x * y;
    }

    public int div() {
        return x / y;
    }
}
