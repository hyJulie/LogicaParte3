package NivelAvancado;


public class ArmstrongNumero {
    public static void main(String[] args) {
        int numero = 153;

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int somaCubos = (int)Math.pow(centena,3)+
                        (int)Math.pow(dezena,3)+
                        (int)Math.pow(unidade, 3);


    if (somaCubos == numero){
        System.out.println(numero+" é número de armstrong");
    }else {
        System.out.println(numero+" não é um número de armstrong");
    }

    }
}
