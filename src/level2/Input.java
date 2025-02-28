package level2;

import java.util.Scanner;

public class Input {

    private char operator;
    Filter filter = new Filter();
    Scanner sc = new Scanner(System.in);

    public int addNum() {
        // 필터링 구간
        System.out.print("첫 번째 숫자를 입력하세요: ");
        return filter.checkedPositiveNum();
    }

    public int addNum(char operator) {
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num = filter.checkedPositiveNum();

        if (operator == '/' && num == 0) {
            System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
            return addNum(operator);
        }
        return num;
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
