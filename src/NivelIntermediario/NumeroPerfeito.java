package NivelIntermediario;

import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Digite um número e descubra se ele é perfeito ou digite 0 para sair: ");
            int num  = scan.nextInt();

            if (num <= 0){
                System.out.println("Fechando...");
                break;
            }

            int soma = 0;
            StringBuilder divisores = new StringBuilder(" ");

            for (int i = 1; i < num; i++){
                if (num % i == 0){
                    soma += i;
                    divisores.append(i).append(" ");
                }
            }

            System.out.println("Divisores de "+num+" : "+ divisores.toString().trim());

            if (soma == num){
                System.out.println(num+" é um número perfeito");
            }else {
                System.out.println(num+" não é um número perfeito");
            }
        }

        scan.close();
    }
}
