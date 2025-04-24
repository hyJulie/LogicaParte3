package NivelIntermediario;

import java.util.Scanner;

public class RemoverEspacos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        frase = frase.replaceAll("\\s+"," ");

        System.out.println("Frase sem espaços: "+frase);

    }
}
/*
"\s+"," "

expressão regular \s+ que corresponde a um ou mais caracteres de espaço em branco e substitua-o por um único espaço ' '
 */