package ArithmeticCalculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    public enum OperatorType {
        ADD('+'),
        SUBTRACT('-'),
        MULTIPLY('*'),
        DIVIDE('/');
        private final char symbol;

        OperatorType(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }
    }

    private List<Double> history = new ArrayList<>();

    public void calculate(double first, double second, OperatorType operator) {
        double result = 0;
        switch (operator) {
            case ADD:
                result  = first + second;
                System.out.println(result);
                break;
            case SUBTRACT:
                result = first - second;
                System.out.println(result);
                break;
            case MULTIPLY:
                result = first * second;
                System.out.println(result);
                break;
            case DIVIDE:
                if (second == 0){
                    System.out.println("0으로 나눌 수 없음");
                    break;
                }
                result = first / second;
                System.out.println(result);
                break;
            default:
                System.out.println("잘못된 연산문자");
                break;
        }
        history.add(result);
    }
    public List<Double> getHistory() {
        return history;
    }

    public void setHistory(List<Double> history) {
        this.history = history;
    }

    public void removeHistory(){
        history.clear();
    }
}
