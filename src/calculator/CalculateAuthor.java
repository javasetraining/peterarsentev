package calculator;

/**
 * Created by Dmitry on 6/4/2015.
 */
public class CalculateAuthor {
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int sum = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;


        System.out.println("The sum is >:" + sum);
        System.out.println("The subtract is >:" + sub);
        System.out.println("The multiple is >:" + mul);
        System.out.println("The divide is >:" + div);
    }
}