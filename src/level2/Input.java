package level2;

import java.util.Scanner;

public class Input {

    private int num1, num2;
    private char operator;

    Scanner sc = new Scanner(System.in);

    public int addNum1() {
        // 필터링 구간
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
                if (num1 >= 0) {
                    break;
                }
                System.out.println("양수(0 포함)를 입력하세요.");
            } else {
                System.out.println("숫자만 입력할 수 있습니다.");
                sc.next();
            }
        }
        return num1;

    }

    public int addNum2(char operator) {
        while (true) {
            System.out.print("두 번째 숫자를 입력하세요: ");
            if (!sc.hasNextInt()) {
                System.out.println("숫자만 입력할 수 있습니다.");
                sc.next();
                continue;
            }

            num2 = sc.nextInt();

            if (num2 >= 0) {
                if (operator == '/' && num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                }
                break;
            }
            System.out.println("양수(0 포함)를 입력하세요.");
        }
        return num2;
    }

    public char addOperator() {
        while (true) {
            System.out.print("사칙연산 기호를 입력하세요: ");
            operator = sc.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                break;
            }
            System.out.println("사칙연산 기호가 아닙니다. 다시 입력해주세요.");
        }
        return operator;
    }

}
