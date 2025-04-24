package NivelIniciante;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        int soma = 0;

        while (num > 0){
            int digito = num % 10; //vai pegar o ultimo digito do número
            soma += digito; //acumulando digitos, soma o digito com a variavel soma que vai guardar o total
            num /= 10; //vai remover o ultimo digito do numero
        }

        System.out.println("Soma dos digitos: "+soma);

        scan.close();
    }
}
