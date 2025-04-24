package NivelAvancado;

import java.util.Scanner;

public class TrianguloPascalN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        int[][] triangulo = new int[n][n]; //guardar os valores do triângulo

        for (int i = 0; i < n; i++){

            triangulo[i][0] = 1; //começa com 1
            triangulo[i][i] = 1; //e termina com 1

            for (int j = 1; j < i;j++){
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print(triangulo[i][j]+ " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
/*
O Triângulo de Pascal é uma estrutura matemática onde cada número é a soma dos dois números diretamente acima dele.
Ele começa com o número 1 no topo, e cada linha subsequente tem um número a mais.
 */