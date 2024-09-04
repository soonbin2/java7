package com.ohgiraffers.Team;

public class Application3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // 각 연산 수행 및 결과 출력
        System.out.println("덧셈 " + calc.add(13.1,12.6));
        System.out.println("뺄셈 " + calc.minus(73.1,84.8));
        System.out.println("곱셈 " + calc.multi(10.8,0.9));
        System.out.println("나눗셈 " + calc.divide(16.8,2.6));
// 결과
//        덧셈 25.7
//        뺄셈 -11.700000000000003
//        곱셈 9.72
//        나눗셈 6.461538461538462
//
//        Calculator 클래스와 Main 클래스를 만들어서 다음 처럼 나오게 만드세요.
    }
}
