package NivelIniciante;

import java.util.Scanner;

public class ContadorPasso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero de inicio: ");
        int inicio = scan.nextInt();

        System.out.print("Agora digite o número do fim: ");
        int fim = scan.nextInt();

        System.out.print("Digite quantos passos você quer dar: ");
        int passos = scan.nextInt();

        if (passos <= 0) {
            System.out.println("Número de passos não pode ser igual ou menor que zero");
            scan.close();
            return;
        }

        if (inicio < fim) { //se o inicio for menor que o fim, entra no laço crescente
            for (int i = inicio; i <= fim; i += passos){
                System.out.print(i+" ");
            }
        }else { //se o inicio for maior que o fim, entra no laço decrescente
            for (int i = inicio; i >= fim; i -= passos){
                System.out.print(i+" ");
            }
        }

        scan.close();
    }
}
