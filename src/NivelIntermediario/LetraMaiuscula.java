package NivelIntermediario;


public class LetraMaiuscula {
    public static void main(String[] args) {
        String frase = "java é divertido";
        String[] palavras = frase.split(" ");

        for (int i = 0; i < palavras.length; i++){
            String palavra = palavras[i];
            if (!palavra.isEmpty()){
                String primeiraLetra = palavra.substring(0,1).toUpperCase();
                String resto = palavra.substring(1);
                palavras[i] = primeiraLetra + resto;
            }
        }

        String letraMaiuscula = String.join(" ", palavras);

        System.out.println("Frase com letras iniciais maiúsculas: "+letraMaiuscula);
    }
}
/*
substring é um método da classe String em Java que serve para pegar uma parte de uma String, ou seja, um pedaço do texto.
exemplo de substring => String parte = texto.substring(inicio, fim);

 */