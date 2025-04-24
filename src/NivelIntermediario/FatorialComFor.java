package NivelIntermediario;

import java.util.Scanner;

public class FatorialComFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        scan.nextLine();

        int fatorial = 1;

        for (int i = 1; i <= num; i++){
            fatorial *= i;
        }

        System.out.println("Fatorial de "+num+" é: "+fatorial);

        scan.close();
    }
}
