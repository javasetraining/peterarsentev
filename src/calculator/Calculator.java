package calculator;

/**
 * Created by marv on 5/22/2015.
 */
public class Calculator {
    private int result;
    int first;
    int second;

    public void add(Integer integer, Integer integer1) {
    }

    public int getResult() {
        return  this.result = first + second;


    }


    public void cleanResult() {
        this.result=0;

    }

    public void calculate(String ... args) throws Exception {
/*        this.args = args;
        checkArgsCount();*/
        executeOperation();
    }

    private void executeOperation() {
    }


//            1 метод получения переменных 
//            2 метод - арифметическая апперация
//            3 метод - стиреть резульа
    
    
    
}
