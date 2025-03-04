package level3;

import java.util.Scanner;

public class Filter {

    Scanner sc = new Scanner(System.in);

    /**
     * 필터링 메서드 - 입력 숫자 정수, 실수 판별 및 문자열 X
     */
    @SuppressWarnings("unchecked")
    public <T extends Number> T checkedPositiveNum() {
        while (true) {
            if (sc.hasNextInt()) {
                System.out.println("정수");
                int num = sc.nextInt();
                return (T) Integer.valueOf(num);
            } else if (sc.hasNextDouble()) {
                System.out.println("실수");
                double num = sc.nextDouble();
                return (T) Double.valueOf(num);
            } else {
                System.out.println("올바른 숫자를 입력하세요.");
                sc.next();
            }
        }
    }

    /**
     * 나눗셈 검증 메서드 - 분모에 0이나 음수 X
     */
    public <T extends Number> T checkedDivide(T secondNum, OperatorType operator) {
        while (operator == OperatorType.DIV && secondNum.doubleValue() <= 0) {
            System.out.println("나눗셈 연산에서 분모(두 번째 숫자)에 0이나 음수가 올 수 없습니다. 다시 입력하세요.");
            secondNum = checkedPositiveNum();
        }
        return secondNum;
    }

}
