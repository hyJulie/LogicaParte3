package NivelAvancado;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumeroFelizPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        if (ehNumeroFeliz(numero)) {
            System.out.println(numero + " é um número feliz");
        } else {
            System.out.println(numero + " não é um número feliz");
        }

        scan.close();
    }

    public static boolean ehNumeroFeliz(int n) {
        Set<Integer> numerosVistos = new HashSet<>();

        System.out.println("Iniciando verificação do número: " + n);

        while (n != 1 && !numerosVistos.contains(n)) {
            System.out.println("Número atual: " + n);
            numerosVistos.add(n);
            n = somaDosQuadrados(n);
            System.out.println("→ Próximo número (soma dos quadrados): " + n);
        }

        if (n == 1) {
            System.out.println("Chegou em 1! 🎉 É um número feliz!");
        } else {
            System.out.println("Entrou em ciclo com o número " + n + ". 😢 Não é feliz.");
        }

        return n == 1;
    }

    public static int somaDosQuadrados(int n) {
        int soma = 0;
        while (n > 0) {
            int digito = n % 10;
            soma += digito * digito;
            n /= 10;
        }

        return soma;
    }
}

