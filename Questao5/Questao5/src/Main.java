import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inserido, inverso = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a string a ser invertida:");
        inserido = sc.nextLine();

        for (int i = inserido.length() -1; i >= 0; i--){
            inverso = inverso.concat(String.valueOf(inserido.charAt(i)));
        }

        System.out.println(inverso);
    }
}