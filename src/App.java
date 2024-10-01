import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        try{
            System.out.println("Insira o primeiro parametro: ");
            int parametro1 = scanner.nextInt();

            System.out.println("Insira o segundo parametro: ");
            int parametro2 = scanner.nextInt();

            scanner.close();

            Contador meuContador = new Contador(parametro1, parametro2);
            meuContador.contagem();
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
