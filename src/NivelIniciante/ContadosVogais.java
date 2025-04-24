package NivelIniciante;

import java.util.Scanner;

public class ContadosVogais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String vogais = "aeiou";

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine().toLowerCase();

        System.out.println("A frase digitada foi: " + frase);


        int countVogais = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (vogais.contains(letra + "")){
                countVogais++;
            }
        }


        System.out.println("Quantidade de vogais da frase :"+countVogais);

        scan.close();
    }
}
