package oo;

public class Main extends Player {

    /*
    Atributos são variáveis de classe
     */
    private String nome = "Guilherme";
    private int[] numeros;
    public static final int VIDA_MAXIMA = 100;

    /*
    Método Construtor é primeiro método que sempre será chamado quando instanciar a classe
     */
    public Main(int n1, int n2){
        /*
        o super é o método que irá chamar o método construtor da classe Pai
         */
        super(n1, n2);
        System.out.println("Classe criada");

        numeros = new int[100];
    }

    public String getNome()
    {
        return nome;
    }

    public static void main(String[] args) {
        /*
        Quando se passa parâmetros no método, é NEESSÁRIO passar parâmetros depois.
         */
        Main m = new Main(100, 200);

        System.out.println(m.getNome());
        System.out.println(m.VIDA_MAXIMA);
    }
}
