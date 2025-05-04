package ArithmeticCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator cal = new ArithmeticCalculator();

        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            String first = sc.nextLine();
            System.out.print("두 번째 숫자를 입력하세요: ");
            String second = sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char sign = sc.next().charAt(0);
            double a = Double.parseDouble(first);
            double b = Double.parseDouble(second);
            OperatorType operator = OperatorType.fromChar(sign);

            cal.calculate(first, second, operator);
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
        for(double numbers: ArithmeticCalculator.getHistory()){
            System.out.print(numbers + " ");//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        }

        System.out.println("기록을 제거하시겠습니까? Y/N");
        String answer = sc.nextLine();
        if (answer.equals("Y")) {
            ArithmeticCalculator.removeHistory();
            System.out.println("제거완료");
        }else {
            System.out.println("기록을 유지합니다.");
        }

        // to see how IntelliJ IDEA suggests fixing it.
    }
}
