public class App {
    public static void main(String[] args) throws Exception {
        int a, b;
        a = 5;
        b = 3;

        // Exemplo de IF ELSE comum
        String resultado = "";
        if(a == b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        // Exemplo de IF ELSE ternário

        String resposta = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resposta);

        switch (resultado) {
            case "Verdadeiro":{
                System.out.println("O retorno foi Verdadeiro!");
                break;
            }
            case "Falso":{
                System.out.println("O retorno foi Falso");
                break;
            }
            default:
                System.out.println("Retorno Inesperado");
                break;
        }

        System.out.println(resultado);
    }
}
