package oo;

/*
Para criar uma classe abstrata precisa colocar o abstract antes do public, para assim ela
ser entendida como abstrata

Classes abstratas tem uma função importante na orientação a objeto em Java.
De forma objetiva, uma classe abstrata serve apenas como modelo para uma
classe concreta (classe que comumente usamos). ...
Ou seja, uma classe abstrata pode implementar ou não um método.
 */
abstract public class TesteAbstract {

    public void iniciarJogo(){
        System.out.println("Chamando classe abstrata");
    }
}
