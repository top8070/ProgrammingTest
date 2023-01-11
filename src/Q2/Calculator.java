package Q2;

public class Calculator {
    int result = 0;

    public Calculator add(int n) {
        result += n;
        return this;
    }

    public Calculator subtract(int n) {
        result -= n;
        return this;
    }

    public int out() {
        return result;
    }
}
