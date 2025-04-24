package NivelAvancado;

import java.util.Scanner;

public class ArmstrongNScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 3 dígitos: ");
        int numero = scan.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println("Digite um número de exatamente 3 dígitos");
        } else {
            int centena = numero / 100;
            int dezena = (numero / 10) % 10;
            int unidade = numero % 10;

            int somaCubos = (int)Math.pow(centena, 3)+
                            (int)Math.pow(dezena, 3)+
                            (int)Math.pow(unidade, 3);


        if (somaCubos == numero){
            System.out.println(numero+" é um número de armstrong");
        }else {
            System.out.println(numero+" é um número de armstrong");
        }

        }

        scan.close();


    }
}
