public class App {
    public static void main(String[] args) throws Exception {
        String concatenacao = "?";

        //Retorna 21 Pois soma os valores e depois concatena com a string 1
        concatenacao = 1 + 1 + "1";
        System.out.println(concatenacao); 

        //Retorna 1111 pois na primeira adição usa uma string
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
    }   
}
