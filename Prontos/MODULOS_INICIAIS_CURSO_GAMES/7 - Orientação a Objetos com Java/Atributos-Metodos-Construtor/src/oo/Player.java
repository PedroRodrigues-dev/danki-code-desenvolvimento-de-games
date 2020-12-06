package oo;

public class Player {

    public int vidaInicial, tempo;

    public Player(int vidaInicial, int tempo){
        /*
        Fazendo isso, o parâmetro vidaInicial do método será colocado no vidaInicial da classe, utilizando o this.
         */
        this.vidaInicial = vidaInicial;
       System.out.println(this.vidaInicial);
    }

}
