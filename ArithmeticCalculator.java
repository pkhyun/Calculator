package Calculator_02;

import java.util.ArrayList;

//1. 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(+,-,*,/)
// 기능을 수행한 후 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.
//    - 나눗셈에서 분모에 0이 들어오거나 연산자 기호가 잘 못 들어온 경우 적합한 Exception 클래스를 생성하여 throw 합니다. (매개변수로 해당 오류 내용을 전달합니다.)
public class ArithmeticCalculator extends Calculator {

    private AbstractOperation abstractOperation;

    public double calculate(char operator, int fistNUmber, int secondNUmber) {
        double result = 0;
        if (operator == '+') {
            AddOperation addOperation = new AddOperation();
           result = addOperation.operate(fistNUmber, secondNUmber);
        } else if (operator == '-') {
            SubstractOperation substractOperation = new SubstractOperation();
            result = substractOperation.operate(fistNUmber, secondNUmber);
        } else if (operator == '*') {
            MultiplyOperation multiplyOperation = new MultiplyOperation();
            result = multiplyOperation.operate(fistNUmber, secondNUmber);
        } else if (operator == '/') {
            DivideOperation divideOperation = new DivideOperation();
            result = divideOperation.operate(fistNUmber, secondNUmber);
        } else {
            System.out.println("올바른 연산기호를 입력해주세요");
            throw new ArithmeticException("올바른 연산기호를 입력해주세요");
        }
        return result;
//        double result = 0;
//        switch (operator) {
//            case '+':
//                AddOperation addOperation = new AddOperation();
//                int num1 = 0;
//                int num2 = 0;
//                result = addOperation.operate(num1, num2);
//                break;
//            case '-':
//                result = firstNUm - secondNUm;
//                break;
//            case '*':
//                result = firstNUm * secondNUm;
//                break;
//            case '/':
//                result = (double) firstNUm / secondNUm;
//                break;
//            default:
//                System.out.println("잘못 입력했습니다.");
//        }


//    private AbstractOperation abstractOperation;
//
//    public ArithmeticCalculator(AbstractOperation abstractOperation) {
//        this.abstractOperation = abstractOperation;
//    }
//
//    public void setOperation(AbstractOperation abstractOperation){
//        this.abstractOperation = abstractOperation;
//    }
//
//    public double calculate(int firstNumber, int secondNumber) {
//        double answer = 0;
//        answer = abstractOperation.operate(firstNumber, secondNumber);
//        return answer;
//    }
    }
}

