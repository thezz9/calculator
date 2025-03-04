package level3;

import java.util.Scanner;

public class Menu {

    private final ArithmeticCalculator<Number> calc;

    public Menu(ArithmeticCalculator<Number> calc) {
        this.calc = calc;
    }

    /**
     * 디스플레이 메서드 - 메뉴
     */
    public boolean display() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            // 종료
            System.out.println("1) 연산 결과 보기\n2) 입력 값보다 큰 결과 보기\n3) 첫 번째 연산 결과 지우기\n4) 계속하기\n5) 종료하기");

            switch (sc.next()) {
                case "1":
                    System.out.println("저장된 연산 결과: " + calc.getResults());
                    continue;
                case "2":
                    System.out.print("기준 값을 입력하세요: ");
                    double inputValue = sc.nextDouble();
                    System.out.println("저장된 연산 결과: " + calc.filteredResult(inputValue));
                    continue;
                case "3":
                    calc.removeResult();
                    System.out.println("저장된 연산 결과: " + calc.getResults());
                    continue;
                case "4":
                    System.out.println("계속합니다.");
                    return true;
                case "5":
                    System.out.println("종료합니다.");
                    return false;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }

        }

    }
}
