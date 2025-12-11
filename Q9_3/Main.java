package Q9_3;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        double sqrt2 = sqrt(2);
        System.out.println(sqrt2);

    }
    public static double sqrt(double number){
        if (number <= 0) {
            throw new IllegalArgumentException("number must be positive");
        }
        return sqrt(number, number/2);



    }
    private static double sqrt(double number, double guess) {
        double next = 0.5 * (guess + number / guess);
        assert guess > 0 : "Internal error: guess became non positive";

        if (Math.abs(next - guess) < 0.00001d) {
            return next;
        } else {
            return sqrt(number, next);
        }
    }
}
