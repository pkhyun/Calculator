package Calculator_02;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
//        ArrayList<Double> data = new ArrayList<>();

        ArithmeticCalculator arithmeticCalculator1 = new ArithmeticCalculator();

        CircleCalculator circleCalculator1 = new CircleCalculator();

        System.out.println("사칙연산을 원하면 1, 원의 넓이를 원하면 2를 입력하세요");
        int Choice = sc.nextInt();
        if (Choice == 1) {
            while (true) {

                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

                System.out.print("사칙연산 기호를 입력하세요: "); // + - * /
                char operator = sc.next().charAt(0);
                System.out.println("operator = " + operator);



                arithmeticCalculator1.calculate(operator, num1, num2);


                System.out.println(arithmeticCalculator1.calculate(operator, num1, num2));
//            data.add(calculator.calculate(operator, num1, num2));
                arithmeticCalculator1.addToData(arithmeticCalculator1.calculate(operator, num1, num2));


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next();
                if (remove.equals("remove")) {
//                data.remove(0);
                    arithmeticCalculator1.removeData();
                }else {
                    System.out.println("remove를 입력하지 않아 삭제하지 않습니다.");
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();
                if (inquiry.equals("inquiry")) {
//                System.out.println(data.toString());
                    System.out.println(arithmeticCalculator1.getData());
                }else {
                    System.out.println("inquiry를 입력하지 않아 조회하지 않습니다,");
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                answer = sc.next();
                if (answer.equals("exit")) {
                    break;
                }
            }
        } else if (Choice == 2) {
            while (true) {

                System.out.println("원의 반지름을 입력하세요");
                int num1 = sc.nextInt();



                circleCalculator1.calculate(num1);

                System.out.println(circleCalculator1.calculate(num1));

                circleCalculator1.addToData(circleCalculator1.calculate(num1));


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next();
                if (remove.equals("remove")) {
//                data.remove(0);
                    circleCalculator1.removeData();
                }else {
                    System.out.println("remove를 입력하지 않아 삭제하지 않습니다.");
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();
                if (inquiry.equals("inquiry")) {
//                System.out.println(data.toString());
                    System.out.println(circleCalculator1.getData());
                }else {
                    System.out.println("inquiry를 입력하지 않아 조회하지 않습니다,");
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                answer = sc.next();
                if (answer.equals("exit")) {
                    break;
                }



            }
        }




    }
}
