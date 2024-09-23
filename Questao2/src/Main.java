import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int inserido;
        //Variáveis para capturar o valor atual, o antrior e fazer o cáculo do próximo da sequência
        int fiboAtual = 1, fiboAnterior = 0, fiboProximo;
        boolean encontrado = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo a checagem de Fibonacci!\n");
        System.out.println("Insira o numero a ser checado:");

        inserido = sc.nextInt();

        if (inserido == 1 || inserido == 0){
            encontrado = true;
        }

        while(fiboAtual < inserido){
            //Calcula e realoca os valores entre as variáveis relacionadas a sequência
            fiboProximo = fiboAnterior + fiboAtual;
            fiboAnterior = fiboAtual;
            fiboAtual = fiboProximo;

            //Avalia se o numero está contido na sequência e, caso esteja, quebra o laço
            if (fiboAtual == inserido){
                encontrado = true;
                break;
            }
        }

        if (encontrado)
            System.out.println("O numero esta contido em Fibonacci");
        else
            System.out.println("O numero nao esta contido em Fibonacci");
    }
}