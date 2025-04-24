package NivelAvancado;

import java.util.ArrayList;
import java.util.Scanner;

public class TrianguloDePascalArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        ArrayList<ArrayList<Integer>> triangulo = new ArrayList<>();

        for (int i = 0; i < n; i++){
            ArrayList<Integer> linha  = new ArrayList<>();

            for (int j = 0; j <= i;j++){
                if (j == 0 || j == i){
                    linha.add(1);
                }else {
                    int valor = triangulo.get(i - 1).get(j - 1) + triangulo.get(i - 1).get(j);
                    linha.add(valor);
                }
            }

            triangulo.add(linha);
        }

        for (int i = 0; i < triangulo.size(); i++){ //só para formatar
            for (int espaco = 0; espaco < n; espaco++){
                System.out.print(" ");
            }

            for (int num : triangulo.get(i)){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        scan.close();
    }
}
