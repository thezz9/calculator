package level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        Calculator calc = new Calculator();
        Menu menu = new Menu(calc);

        int firstNum, secondNum;
        char operator;
        boolean flag = false;
        boolean subFlag = true;

        do {
            // 입력
            firstNum = input.addNum();
            operator = input.addOperator();
            secondNum = input.addNum(operator);

            // 출력 (계산)
            int result = calc.calculate(firstNum, secondNum, operator);
            System.out.println("결과: " + result);

            // 종료
            flag = menu.display(subFlag);
        } while (flag);
        sc.close();

    }
}

