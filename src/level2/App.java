package level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        Calculator calc = new Calculator();

        int num1, num2;
        char operator;
        boolean flag = true;

        while (flag) {
            // 입력
            num1 = input.addNum1();
            operator = input.addOperator();
            num2 = input.addNum2(operator);

            // 출력
            int result = calc.calculate(num1, num2, operator);
            System.out.println("결과: " + result);
            boolean subFlag = true;
            while (subFlag) {
                // 종료
                System.out.println("1) 연산 결과 보기\n2) 첫 번째 연산 결과 지우기\n3) 계속하기\n4) 종료하기");

                switch (sc.next()) {
                    case "1":
                        System.out.println("저장된 연산 결과: " + calc.getResults());
                        continue;
                    case "2":
                        calc.removeResult();
                        System.out.println("저장된 연산 결과: " + calc.getResults());
                        continue;
                    case "3":
                        subFlag = false;
                        break;
                    case "4":
                        System.out.println("종료합니다.");
                        flag = false;
                        return;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                        continue;
                }

            }
        }
        sc.close();

    }
}

