public class Contador {
    public int parametro1;
    public int parametro2;

    public Contador(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro2 < parametro1) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro.");
        }
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
    }

    public void contagem() {
            for (int i = parametro1; i <= parametro2; i++) {
                System.out.println(i);
        }
    }
}
