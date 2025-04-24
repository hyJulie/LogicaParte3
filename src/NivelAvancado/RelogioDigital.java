package NivelAvancado;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogioDigital {
    public static void main(String[] args) throws InterruptedException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); //formata no estilo "HH:mm:ss"

        while(true){
            for (int i = 0; i < 50; i++) { //Simula limpar o console imprimindo várias linhas em branco
                System.out.println();
            }

            LocalTime agora = LocalTime.now(); //pega a hora atual do sistema
            System.out.println("Relógio digital:");
            System.out.println("----------------");
            System.out.println(formatter.format(agora));

            Thread.sleep(1000); //espera 1 segundo
        }
    }
}
