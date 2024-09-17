public class App {
    public static void main(String[] args) throws Exception {
        for ( int carneirinhos = 1; carneirinhos <=20; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
        System.out.println("Dormiu!");
        //Array com nomes
        String nomes [] = {"Matheus", "Eliziane", "Elziene", "Carine", "Rafaely"};

        //For Tradicional para percorrer a lista
        for (int i=0; i<nomes.length; i++){
            System.out.println("O nome no indice "+ i +" é "+ nomes[i]);

        //For each para percorrer os nomes da lista
        for(String nome : nomes){
            System.out.println("O nome é "+ nome);
        }

        //While
        int x = 0;
        while (x<nomes.length) {
            System.out.println("Nome na posição "+x+" é "+nomes[x] );
            x++;
        }

        //Do While
        int vlr = 0;
        do {
            System.out.println("Acelerando! " +vlr);
            vlr++;            
        } while (vlr<=10);
        }
    }
}
