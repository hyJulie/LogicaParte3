package NivelAvancado;

import java.util.Scanner;

public class ConversorBinarioDecimal {
    //decimal para binario
    public static String decimalParaBinario(int numeroDecimal){
        StringBuilder binario = new StringBuilder();

        if (numeroDecimal == 0) return "0";

        while(numeroDecimal > 0){
            int resto = numeroDecimal % 2; //pega o resto da divisão por 2 (vai dar 0 ou 1)
            binario.insert(0, resto); // insere esse resto no início da string, porque estamos construindo o número binário de trás para frente
            numeroDecimal = numeroDecimal / 2; // divide o número por 2 para continuar o processo
        }

        return binario.toString(); //retorna o binário como uma String, já que o StringBuilder precisa ser convertido
    }

    //binario para decimal
    public static int binarioParaDecimal(String numeroBinario ){
        int decimal = 0;
        int tamanho = numeroBinario.length(); //serve para sabermos a posição de cada dígito do binário (que começa do fim)

        for (int i = 0; i < tamanho; i++){ //percorre cada dígito do número binário da direita para a esquerda (por isso usamos tamanho - 1 - i)
            char digito = numeroBinario.charAt(tamanho - 1 - i);
            if (digito == '1'){ //para cada dígito '1', somamos 2^i ao número decimal
                decimal += (int) Math.pow(2,i);
            }
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma conversão: ");
        System.out.println("1 - Decimal para Binário");
        System.out.println("2 - Binário para Decimal");
        int escolha = scan.nextInt();
        scan.nextLine();

        if (escolha == 1){
            System.out.print("Digite um número decimal: ");
            int decimal = scan.nextInt();
            String binario = decimalParaBinario(decimal);
            System.out.println("Número binário: "+binario);
        }else if (escolha == 2){
            System.out.println("Digite um número binário: ");
            String binario = scan.nextLine();
            int decimal = binarioParaDecimal(binario);
            System.out.println("Número decimal: "+decimal);
        }else {
            System.out.println("Opção inválida");
        }

        scan.close();
    }
}
/*
Decimal → Binário
Quando você quer converter um número decimal (base 10) para binário (base 2), a ideia é:

Dividir o número decimal por 2 repetidamente.

Guardar o resto de cada divisão (que será sempre 0 ou 1).

Continuar dividindo o resultado da divisão até chegar a zero.

Ler os restos de trás para frente (do último para o primeiro) para montar o número binário.
Exemplo simples:
Para converter o número 6:

6 ÷ 2 = 3, resto 0

3 ÷ 2 = 1, resto 1

1 ÷ 2 = 0, resto 1
Lendo de trás para frente: 110


Binário → Decimal
Agora, se você quer converter binário para decimal, a ideia é usar potências de 2:

Você olha para cada dígito binário da direita para a esquerda.

Para cada dígito, multiplica ele por 2 elevado à posição (começando do zero).

Soma todos os resultados para obter o número decimal.

🧠 Exemplo simples:
Para converter o binário 101:

(1 × 2²) + (0 × 2¹) + (1 × 2⁰) = 4 + 0 + 1 = 5



 */