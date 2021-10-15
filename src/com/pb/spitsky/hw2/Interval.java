package com.pb.spitsky.hw2;
import java.util.Scanner;
class interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand;
        System.out.print("Введите, пожалуйста, число от 0 до 100:");
        operand = scan.nextInt();
        if (operand >= 0 && operand <=14) {
            System.out.print("Диапазон от 0 до 14");
        } else if (operand >= 15 && operand <= 35) {
            System.out.print("Диапазон от 15 до 35");
        } else if (operand >= 36 && operand <= 50) {
            System.out.print("Диапазон от 36 до 50");
        } else if (operand >= 51 && operand <= 100) {
            System.out.print("Диапазон от 51 до 100");
        } else {
            System.out.print("Число не попадает ни в один из имеющихся диапазонов");
        }
    }
}
