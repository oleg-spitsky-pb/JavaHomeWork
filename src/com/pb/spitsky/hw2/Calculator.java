package com.pb.spitsky.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        int result=0;
        char symbol;
        System.out.print("Введите целое число 1:");
        operand1 = scan.nextInt();
        System.out.print("Введите целое число 2:");
        operand2 = scan.nextInt();
        System.out.print("Введите знак арифметической операции (+, -, *, /):");
        symbol = scan.next().charAt(0);
        switch(symbol) {
            case '+': result = operand1 + operand2;
                break;
            case '-': result = operand1 - operand2;
                break;
            case '*': result = operand1 * operand2;
                break;
            case '/': if (operand2==0) {
                System.out.println("Ошибка, деление на ноль");}
                else if (operand2>0)  result = operand1 / operand2;
                break;
            default:  System.out.println("Ошибка! Выберите арифметический знак из примера(+, -, *, /):");
                return;
        }
        System.out.print("\nРезультат операции:\n");
        System.out.println(operand1 + " " + symbol + " " + operand2 + " = " + result);
    }
}
