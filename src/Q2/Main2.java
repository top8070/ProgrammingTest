package Q2;

public class Main2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(4).add(5).subtract(3).out();
        System.out.println(result);
    }
}
