package Exercicios;
import java.lang.Math;
public class RaizQuadrada {
    public static void main(String[] args) {
        float numero = 45;//declara um numero
        double raiz_quadrada = Math.sqrt(numero);//declara a raiz de um numero

        System.out.printf("A raiz quadrada de %.1f é: %.2f", numero, raiz_quadrada);
    }
}
