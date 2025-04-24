package NivelAvancado;

import java.util.Scanner;

public class BuscaBinariaOrdenada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println("Arrays disponíveis: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.print("\nDigite qual número quer encontrar: ");
        int alvo = scan.nextInt();

        int resultado = buscaBinaria(numeros, alvo);

        if (resultado != -1){
            System.out.println("Resultado encontrado na posição: "+resultado);
        }else {
            System.out.println("Elemento não encontrado");
        }

        scan.close();

    }

    public static int buscaBinaria(int[] array, int alvo) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim){
            int meio = (inicio + fim) / 2;

            if (array[meio] == alvo){
                return meio;
            }else if (array[meio] < alvo){
                inicio = meio + 1;
            }else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}
