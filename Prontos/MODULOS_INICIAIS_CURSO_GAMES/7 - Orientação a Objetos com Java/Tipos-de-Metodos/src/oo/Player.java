package oo;

public class Player {

    /*
    Isso se chama método, é uma função criada, que pode ou não receber
    parâmetros, os parâmetros são colocados dentro dos parêntes.

    Public = singifica que a função será acessível para todas as outras classes quando for instanciada
    Private = significa que a função será só acessível para essa classe
    Protected = significa que as todas classes que estiverem dentro desse pacote (oo) poderá acessar os métodos, mas outras
    classes não.

     */
    public void nascer(){
        System.out.println("Nasceu...");

        /*
        Chamando o método statico que foi criado dentro da classe Main,
        pode se ver que não precisou instanciar, só chamar pelo nome da classe e o nome do método
         */
        Main.exemplo();
    }

    private void morrer(){
        System.out.println("Morreu...");
    }

    protected void reviver(){
        System.out.println("Reviveu...");
    }
}
