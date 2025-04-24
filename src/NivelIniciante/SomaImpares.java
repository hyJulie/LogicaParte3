package NivelIniciante;

import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        int a = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scan.nextInt();

        int somaImpares = 0;
        String impares = "";

        //determinar os maiores e menores
        int menor = Math.min(a, b);
        int maior = Math.max(a, b);

        //iterar entre os números
        for (int i = menor + 1; i < maior;i++){
            if (i % 2 != 0){
                somaImpares += i;
                impares += i + " ";
            }
        }


        System.out.println("Números ímpares somados: " + impares);
        System.out.println("Soma dos ímpares entre " + a + " e " + b + " = " + somaImpares);

        scan.close();
    }
}
/*
    int i = menor + 1: começa no número logo após o menor (exclui o próprio menor)

       Ler os dois números.

        Descobrir qual é o menor e o maior (para iterar corretamente).

        Percorrer os números entre eles.

        Verificar se o número é ímpar (n % 2 != 0).

        Se for ímpar, somar.


 */