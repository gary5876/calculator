package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

//console calculator
public class Calculator {
    private List<Integer> history = new ArrayList<>();

    public void calculate(int first, int second, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result  = first + second;
                System.out.println(result);
                break;
            case '-':
                result = first - second;
                System.out.println(result);
                break;
            case '*':
                result = first * second;
                System.out.println(result);
                break;
            case '/':
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
    public List<Integer> getHistory() {
        return history;
    }

    public void setHistory(List<Integer> history) {
        this.history = history;
    }

    public void removeHistory(){
        history.clear();
    }
}
