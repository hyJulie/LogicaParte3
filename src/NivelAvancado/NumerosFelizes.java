package NivelAvancado;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumerosFelizes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        if (ehNumeroFeliz(numero)){
            System.out.println(numero+" é um número feliz");
        }else {
            System.out.println(numero+" não é um número feliz");
        }

        scan.close();
    }

    public static boolean ehNumeroFeliz(int n){
        Set<Integer> numerosVistos = new HashSet<>();

        while (n != 1 && !numerosVistos.contains(n)){ //continua enquanto o número não for 1 E ainda não tiver aparecido antes
            numerosVistos.add(n);
            n = somaDosQuadrados(n);
        }

        return n == 1;
    }

    public static int somaDosQuadrados(int n){
        int soma = 0;
        while (n > 0){
            int digito = n % 10;
            soma += digito * digito;
            n /= 10;
        }

        return soma;
    }
}
/*
número feliz => Pegue os dígitos do número, eleve cada um ao quadrado, some tudo. Pegue esse resultado e repita o processo.
Se esse processo chegar no número 1, o número é feliz.
Se entrar em um ciclo que nunca chega a 1, ele é infeliz.

set serve para armazenar elementos únicos, sem repetições
Set é uma coleção que nao permite elementos duplicados
 */