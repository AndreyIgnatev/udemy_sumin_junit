public class Calc {

    public static void main(String[] args) {
        System.out.println(new Calc().add(6,9));
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int devision(int a, int b) {
        return a/b;
    }

}
