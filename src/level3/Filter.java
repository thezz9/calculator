package level3;

import java.util.Scanner;

public class Filter {

    Scanner sc = new Scanner(System.in);

    @SuppressWarnings("unchecked")
    public <T extends Number> T checkedPositiveNum() {
        while (true) {

            if (sc.hasNextInt()) {
                System.out.println("정수");
                int num = sc.nextInt();
                if (num >= 0) {
                    return (T) Integer.valueOf(num);
                }
            } else if (sc.hasNextDouble()) {
                System.out.println("실수");
                double num = sc.nextDouble();
                if (num >= 0) {
                    return (T) Double.valueOf(num);
                }
            } else {
                System.out.println("올바른 숫자를 입력하세요.");
                sc.next();
            }
        }
    }
}
