package level3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        ArithmeticCalculator<Number> calc = new ArithmeticCalculator<>();
        Menu menu = new Menu(calc);

        do {
            // 입력
            Number firstNum = input.addNum("첫 번째");
            OperatorType operator = input.addOperator();
            Number secondNum = input.addNum("두 번째");

            while (operator == OperatorType.DIV && secondNum.doubleValue() == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 숫자)에 0이 올 수 없습니다. 다시 입력하세요.");
                    secondNum = input.addNum("두 번째");
            }

            // 출력 (계산)
            double result = calc.calculate(firstNum, secondNum, operator);
            System.out.println("결과: " + result);

        } while (menu.display());
        sc.close();

    }
}

