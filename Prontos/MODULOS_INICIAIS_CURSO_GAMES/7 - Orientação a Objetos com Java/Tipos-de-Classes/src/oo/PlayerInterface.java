package oo;

/*
Uma interface serve para que possa fazer assinatura de métodos, ou seja
os métodos não serão feitos aqui, apenas criado os nomes, dizendo que
a classe que der implements nessa interface, terá que criar esses métodos
fazendo suas instruções. Pois uma interface não pode criar instruções em métodos.
 */
public interface PlayerInterface {

    public abstract void iniciar();
    public abstract void morrer();
    public abstract void perderVida();
}
