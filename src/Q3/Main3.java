package Q3;

public class Main3 {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
