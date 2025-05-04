package com.example.calculator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int first = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int second = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char sign = sc.next().charAt(0);
            calculator.calculate(first, second, sign);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            sc.nextLine();
            String close = sc.nextLine();
            if (close.equals("exit")) {
                System.out.println("종료");
                break;
            }
        }
        System.out.println("기록");
        for(int numbers: calculator.getHistory()){
            System.out.print(numbers + " ");//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        }

        System.out.println("기록을 제거하시겠습니까? Y/N");
        String answer = sc.nextLine();
        if (answer.equals("Y")) {
            calculator.removeHistory();
            System.out.println("제거완료");
        }else {
            System.out.println("기록을 유지합니다.");
        }

        // to see how IntelliJ IDEA suggests fixing it.
    }
}