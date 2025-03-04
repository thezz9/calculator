package level3;

import java.util.Scanner;

public class Input {

    private final Filter filter = new Filter();
    private final Scanner sc = new Scanner(System.in);

    /**
     * 숫자 입력 메서드
     */
    public <T extends Number> T addNum(String order) {
        // 필터링 구간
        System.out.print(order + " 숫자를 입력하세요: ");
        return filter.checkedPositiveNum();
    }

    /**
     * 연산자 입력 메서드
     */
    public OperatorType addOperator() {
        char operator;
        while (true) {
            System.out.print("사칙연산 기호를 입력하세요: ");
            operator = sc.next().charAt(0);
            try {
                return OperatorType.verifyOperator(operator);
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 연산자입니다. 사칙연산 기호를 다시 입력하세요.");
            }
        }

    }

}
