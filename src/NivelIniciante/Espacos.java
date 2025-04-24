package NivelIniciante;

import java.util.Scanner;

public class Espacos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        int countLetras = 0;
        int countEspacos = 0;

        for (int i = 0; i< frase.length();i++){
            char letra = frase.charAt(i);

            if (letra == ' '){
                countEspacos++;
            } else if(Character.isLetter(letra)){
                countLetras++;
            }
        }

        System.out.println("Quantidade de espaços: "+countEspacos);
        System.out.println("Quantidade de letras: "+countLetras);

        scan.close();
    }
}
