package calculator;

import java.util.Scanner;

/**
 класс для запуска калькулятора поттдерживающий метод ввода с клавиатуры.
 */
public class InteracRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit = "no";
                    while (!exit.equals("yes")){
                        System.out.println("enter firs argument: ");
                        String first = reader.next();
                        System.out.println("Enter second argument: ");
                        String second = reader.next();
                        calc.add( Integer.valueOf(first),Integer.valueOf(second));
                        System.out.println("Reset: "+ calc.getResult());
                        calc.cleanResult();
                        System.out.println("Exit : yes/no ");
                        exit = reader.next();
                    }
        }finally {
            reader.close();
        }
    }
}
