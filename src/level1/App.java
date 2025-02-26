package level1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int result = 0;
            int num1, num2;
            char operator;

            // 필터링 구간
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt();
                if (num1 >= 0) {
                    break;
                }
                System.out.println("양수(0 포함)를 입력하세요.");
            }

            while (true) {
                System.out.print("사칙연산 기호를 입력하세요: ");
                operator = sc.next().charAt(0);
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break;
                }
                System.out.println("사칙연산 기호가 아닙니다. 다시 입력해주세요.");
            }

            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextInt();
                if (num2 >= 0) {
                    break;
                }
                System.out.println("양수(0 포함)를 입력하세요.");
            }

            // 계산 구간
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                } else {
                    result = num1 / num2;
                }
            }

            System.out.println("결과: " + result);

            // 종료 구간
            System.out.println("더 계산 하시겠습니까? (exit 입력시 종료)");
            if (sc.next().equals("exit")) {
                break;
            }
        }

        sc.close();

    }
}

