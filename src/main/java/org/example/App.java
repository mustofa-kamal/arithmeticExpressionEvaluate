package org.example;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        String exp = "1+2*3";

        ArithmeticExpressionUtil arithmeticExpressionUtil = new ArithmeticExpressionUtil();


        int result = arithmeticExpressionUtil.calculate(exp);

        System.out.println(result);


    }


}






