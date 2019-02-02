package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int q = 21;
        int w = 8;
        int a = q / w;
        int b = q % w;
        System.out.printf("%d / %d = %d and %d в остатке\n", q, w, a, b);

        Scanner scan = new Scanner(System.in);
        MathExpression mathExpression1 = new MathExpression();
        int num1 = 0;
        int num2 = -31;
        int resultDivision = mathExpression1.divideNumber(num1,num2);
        int resultRemainder = mathExpression1.remainderOfDivision(num1, num2);
        System.out.printf("%d / %d = %d and %d в остатке\n", num1, num2, resultDivision, resultRemainder);




    }
}
