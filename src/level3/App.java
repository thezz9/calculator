package level3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        Filter filter = new Filter();
        ArithmeticCalculator<Number> calc = new ArithmeticCalculator<>();
        Menu menu = new Menu(calc);

        do {
            // 입력 (검증)
            Number firstNum = input.addNum("첫 번째");
            OperatorType operator = input.addOperator();
            Number secondNum = input.addNum("두 번째");
            secondNum = filter.checkedDivide(secondNum, operator);

            // 출력 (계산)
            double result = calc.calculate(firstNum, secondNum, operator);
            System.out.println("결과: " + result);

        } while (menu.display());
        sc.close();

    }

}

