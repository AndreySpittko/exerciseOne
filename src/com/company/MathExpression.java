package com.company;

public class MathExpression implements MathFunctional {

    /**
     *
     * @param numbA
     * @param numbB
     * @return
     * метод выводящуй на экран результат деления numbA на numbB
     */
    public int divideNumber(int numbA, int numbB) {
        int result = 0;
        if((numbA < 0 || numbB < 0) && (numbA !=0 && numbB != 0)) {
            result = Math.abs(numbA) / Math.abs(numbB);
            return result;
        } else {
            System.out.println("Please enter numbers > 0 or < 0!");
            return 0;
        }
    }

    /**
     *
     * @param numbA
     * @param numbB
     * @return
     * метод выводящуй на экран целочисленний остаток от деления numbA на numbB
     */
    public int remainderOfDivision(int numbA, int numbB) {
        int result = 0;
        if((numbA < 0 || numbB < 0) && (numbA !=0 && numbB != 0)) {
            result = Math.abs(numbA) % Math.abs(numbB);
            return result;
        } else {
            System.out.println("Please enter numbers > 0 or < 0!");
            return 0;
        }
    }

    /**
     *
     * @param a
     * @return
     * Метод виводит на екран результат добутку цифр от целочисленного
     * остатка от деления числа<p>int a<p/>
     */
    public int multiplyDivisionResult(int a) {
        int result = 1;
        for(int i = a; i != 0; i /=10) {
            result = result * (i % 10);
        }
        return result;
    }

    /**
     *
     * @param a
     * @return
     * Метод виводит на екран результат суму цифр от целочисленного
     * остатка от деления числа<p>int a<p/>
     */
    public int additionDivisionResult(int a) {
        int result = 0;
        for(int i = a; i != 0; i /= 10) {
            result = result + (i % 10);
        }
        return  result;
    }
}
