package Exercicios;

public class NumeroPrimo {
    public static void main(String[] args) {
        int numero = 17;//declara um numero
        int contador = 0;//declara outro numero

        for(int i = 1; i <= numero; i++){//loop for
            if (numero % i == 0){
                contador++;
            }
        }

        if (contador == 2){//funçao if
            System.out.println("O número é primo!");
        }else{//funçao else
            System.out.println("O número não é primo!");
        }
    }
}
