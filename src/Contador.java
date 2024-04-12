public class Contador {
    private int valor;

    //Construtor que inicializa o contador com zero
    public Contador() {
        this.valor = 0;
    }

    //Método para zerar o contador
    public void zerar() {
        this.valor = 0;
    }

    //Método para incrementar o contador
    public void incrementar() {
        this.valor++;
    }

    //Método para retornar o valor atualdo contador
    public int getValor() {
        return this.valor;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Contador contador = new Contador();

        System.out.println("Valor inicial do contador: " + contador.getValor());

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

        System.out.println("Valor atual do contador: " + contador.getValor());

        contador.zerar();

        System.out.println("Valor do contador após zerar: " + contador.getValor());
    }
}