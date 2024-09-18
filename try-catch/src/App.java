import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        try{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("QUal sua altura: ");
        Double altura = scanner.nextDouble();

        System.out.println("Qual sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Seja bem vindo "+nome);
        System.out.println("Você tem "+altura+" de altura");
        System.out.println("Sua idade é de "+idade+"anos!");
        scanner.close();
        } catch(InputMismatchException e) {
            System.err.println("Verifique os campos informados!");
        }
    }
}
