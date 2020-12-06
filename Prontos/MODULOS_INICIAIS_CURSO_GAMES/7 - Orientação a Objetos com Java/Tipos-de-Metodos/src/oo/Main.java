/*
Package oo é o package que foi criado dentro do src, e alunos é o nome dele
se importa ele para dizer onde essa pasta está localizada, já que o projeto pode
ter várias pastas com vários códigos.
 */
package oo;

/*
Player é o nome da classe ( nome do arquivo criado ), ele não pode ser main com letra minuscula
porque irá dar conflito com o método main, sempre iniciar nome de classe com letra maiúsucla

 */
public class Main{
    /*
    Método main, o método que inicia todo o programa a ser executado
    Ele nunca mudará de nome, pois o main não é o nome da sua classe, e sim o nome do método

    O static significa que o método será independente, ou seja, ele pode ser chamado
    tanto na mesma classe ( não precisando colocar o nome da classe Antes), e em outras classes , sem precisar instanciar a classe,
    só chamando pelo nome da classe e o método. Por exemplo: Player2().reviver();

    Void = é o retorno do método, que no caso void significa que não irá retornar nada, só irá executar um procedimento.
    Se disser que é int, String, char, boolean, float, double, etc a função É OBRIGADA a ter a palavra reservada RETURN

    O que está entre parênteses são os parâmetros/atributos por exemplo: public static int metodo(int n1, int n2)
     */
    public static void outroExemplo(int[] n1, String[] nome){
        /*
        Chamando o primeiri indice do array de n1
         */
        System.out.println(n1[0]);
        System.out.println(nome[0]);
    }

    public static int novoExemplo(){
        /*
        Como a função é int, então o return precisará retornar um INTEIRO
         */
        return 1;
    }

    public static String novoExemplo2(){
        return "Guilherme";
    }

    public static void exemplo(){
        System.out.println("Exemplo");
    }

    private static void OutroExemplo(){
        exemplo();
    }

    /*
    O String[] args é usado para quando for executar o programa pelo terminal,
    dai poderá ser passado parâmetros para ele.
     */
    public static void main(String[] args) {
        new Player2().nascer();
        new Player2().reviver();

        /*
        Como o método exemplo é estático, pode ser chamado sem instanciar
        e sem colocar o nome da classe antes
         */
        exemplo();

        /*
        Será printado o número que a função retornou
         */
        System.out.println(novoExemplo());

        /*
        Retornará a string que foi colocado no return
         */
        System.out.println(novoExemplo2());

        /*
        Como no método já foi implementado a função de printar, aqui pode ser passado só o método mesmo.
        Mas veja que dentro do método tem os parâmetros que foi requerido la, o primeiro era um número
        e o segundo uma string. Se não passar, dará erro.
         */
        int[] n1 = new int[10];
        n1[0] = 10;
        String[] nomes = new String[2];
        nomes[0] = "João";
        outroExemplo(n1, nomes);
    }

}