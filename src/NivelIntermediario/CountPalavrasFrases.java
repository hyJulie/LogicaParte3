package NivelIntermediario;

import java.util.Scanner;

public class CountPalavrasFrases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        String[] palavras = frase.split(" ");
        int numeroPalavras = palavras.length;

        System.out.println("Número de palavras na frase: "+numeroPalavras);

        scan.close();
    }
}
