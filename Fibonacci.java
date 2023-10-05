package Exercicios;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;//declara um numero
        int num2 = 1;//declara outro numero
        int num3;//

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for (int i = 3; i <= 10; i++){//loop for
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}
