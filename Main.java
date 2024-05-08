import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        FInterface myFunction = (a, b, c, d) -> {
            return Math.pow((4 * Math.cosh(Math.sqrt(Math.abs(a / b))) + 3 * Math.acos(d)), c);
        };

        double a = -3.45, b = 2.34, c = 1.45, d = 0.83;

        performCalculation(myFunction, a, b, c, d);
    }

    public static void performCalculation(FInterface function, double a, double b, double c, double d) {
        double result = function.calculate(a, b, c, d);

        System.out.println("Params: a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
        System.out.println("Result: " + result);
    }
}
