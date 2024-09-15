public class ContaTerminal{
    public int numero;
    public String agencia;
    public String nome_cliente;
    public Double saldo;

    public ContaTerminal(int numero, String agencia, String nome_cliente, Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo;
    }

    public void getCliente(){
        System.out.println("Olá "+ nome_cliente +", Obrigado por criar uma conta em nosso banco, sua agência é "
                            + agencia +" Conta: "+ numero + " e seu saldo de "+ saldo +" já esta disponível para saque!" );
    }
}
