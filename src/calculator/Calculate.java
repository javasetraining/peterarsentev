package calculator;

/**
 * Created by marv on 5/22/2015.
 */
public class Calculate {
    private int result;
    public static final int RESULT_VALUE = 5;


    public static void main(String[] args) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int summ = first + second; //summ of
        int div = first / second; //division
        System.out.println("sum = " + summ);


        System.out.println(RESULT_VALUE);
    }

}
