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
        int num1 = 18420;
        int num2 = -31;
        int resultDivision = mathExpression1.divideNumber(num1,num2);
        int resultRemainder = mathExpression1.remainderOfDivision(num1, num2);
        System.out.printf("%d / %d = %d and %d в остатке\n", num1, num2, resultDivision, resultRemainder);

        MathExpression mathExpression2 = new MathExpression();
        int num3 = -16785;
        int num4 = 192;

        int numRes1= mathExpression2.multiplyDivisionResult(num3);
        System.out.printf("numRes1 = %,d\n", numRes1);
        System.out.printf("numRes1 (Math.abs)= %,d\n", Math.abs(numRes1));
        int numResSum = mathExpression2.additionDivisionResult(num3);
        System.out.printf("numResSum = %,d\n", numResSum);


        scan.close();

    }
}
