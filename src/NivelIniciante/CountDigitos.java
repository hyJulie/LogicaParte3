package NivelIniciante;

import java.util.Scanner;

public class CountDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        scan.nextLine();

        int numero = Math.abs(num); //evita problema com numero negativo
        int countDigitos = 0;

        do {
            num /= 10;
            countDigitos++;
        }while (num != 0);


        System.out.println("Número digitado :"+numero);
        System.out.println("Quantidade de dígitos: "+countDigitos);

        scan.close();
    }
}
