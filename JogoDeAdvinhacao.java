package Pratica_projetos;


import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {
        int nAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int nDigitado = 0;
        int tentativa = 0;

        System.out.println(nAleatorio);

        while (tentativa < 5) {
            System.out.println("Informe o numero a ser advinhado, entre 0 a 100: ");
            nDigitado = leitura.nextInt();
            tentativa++;

            if (nDigitado == nAleatorio){
                System.out.println("Parabens, você acertou o numero!!!");
                break;
            } else if (nDigitado < nAleatorio) {
                System.out.println("Numero informado é menor que o numero gerado, tente novamente!!!");
            } else {
                System.out.println("Numero digitado é maior que o numero gerado, tente novamente!!!");
            }

        }

        if (tentativa == 5 && nDigitado != nAleatorio) {
            System.out.println("""
        Você alcançou o numero de tentativas = 5
        Que pena, você fracassou na localização do numero, tenha mais sorte da proxima vez
        O numero gerado foi: """ + nAleatorio);
        }
    }
}
