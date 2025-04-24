package NivelIntermediario;

import java.util.Scanner;

public class InverterFrases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase =  scan.nextLine();

        String[] palavras = frase.split(" ");

        if (palavras.length >= 2){ //se pelo menos tiver 2 palavras

            String temp = palavras[0];
            palavras[0] = palavras[palavras.length - 1];
            palavras[palavras.length - 1] = temp;
        }

        String fraseInvertida = String.join(" ", palavras);

        System.out.println("Frase invertida: "+fraseInvertida);

        scan.close();
    }
}
/*
palavras[0]: primeira palavra

palavras[palavras.length - 1]: última palavra
 */