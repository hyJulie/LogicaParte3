package NivelIntermediario;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scan.nextInt();
        boolean ehPrimo = true;

        if (n < 2){
            ehPrimo = false;
        }else {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo){
            System.out.println(n+" é primo");
        }else {
            System.out.println(n+" não é primo");
        }

        scan.close();
    }
}
