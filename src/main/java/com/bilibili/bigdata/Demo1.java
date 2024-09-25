package com.bilibili.bigdata;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        SimpleCalculatorParser calculatorParser = new SimpleCalculatorParser(System.in);
        double cacl = calculatorParser.calc();
        System.out.println(cacl);
    }
}
