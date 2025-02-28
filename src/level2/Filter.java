package level2;

import java.util.Scanner;

public class Filter {

    Scanner sc = new Scanner(System.in);

    public int checkedNum() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("숫자만 입력할 수 있습니다.");
                sc.next();
            }
        }
    }

    public int checkedPositiveNum() {
        while (true) {
            int num = checkedNum();
            if (num >= 0) {
                return num;
            }
            System.out.println("양수(0 포함)를 입력하세요.");
        }
    }
}
