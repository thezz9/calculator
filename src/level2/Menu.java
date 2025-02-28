package level2;

import java.util.Scanner;

public class Menu {

    private final Calculator calc;

    public Menu(Calculator calc) {
        this.calc = calc;
    }

    public boolean display(boolean subFlag) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;

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
                    flag = true;
                    subFlag = false;
                    break;
                case "4":
                    System.out.println("종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }

        }
        return flag;

    }
}
