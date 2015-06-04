package calculator;

/**
 * Created by marv on 6/4/2015.
 */

public class ArgRunner {
    public static void main(String[] args) {
        System.out.print("Your expression: ");
        for (String arg : args) {
            System.out.print(" " + arg);
        }
        System.out.println();

        Calculator calculator = new Calculator();
        try {
            calculator.calculate(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println(calculator.getResult());
    }
}

