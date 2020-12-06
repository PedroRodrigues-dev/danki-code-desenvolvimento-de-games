/*
Package oo é o package que foi criado dentro do src, e alunos é o nome dele
se importa ele para dizer onde essa pasta está localizada, já que o projeto pode
ter várias pastas com vários códigos.
 */
package oo;

/*
Player é o nome da classe ( nome do arquivo criado ), ele não pode ser main com letra minuscula
porque irá dar conflito com o método main, sempre iniciar nome de classe com letra maiúsucla

O extends é usado para chamar outra classe, abstrata ou uma classe normal, assim pegando todos os seus
atributos e métodos

O implements é usado para chamar uma interface
 */
public class Main extends TesteAbstract implements PlayerInterface {
    /*
    Método main, o método que inicia todo o programa a ser executado
    Ele nunca mudará de nome, pois o main não é o nome da sua classe, e sim o nome do método
     */
    public static void main(String[] args) {

        /*
        Player é o nome do objeto criado
        player é o nome da variável de tipo PLAYER
        new é a palavra reservado para INSTANCIAR um novo objeto, ou seja
        irá criar o objeto agora, e ele será do tipo PLAYER, pois estamos dizendo
        new Player();
         */
        Player player = new Player();
        Player player2 = new Player();
        /*
        Se quiser usar só uma vez pode ser feito a instanciação dessa forma
        e já chamando o método na mesma linha
         */
        new Player().iniciarJogador();

        Inimigo inimigo = new Inimigo();

        /*
        Aqui estamos usando a variável do tipo Player para
        chamar o método que criamos la dentro da classe Player,
        para isso usamos um ponto e escrevemos o nome do método.
         */
        player.iniciarJogador();
        player2.iniciarJogador();
        inimigo.iniciarInimigo();

        /*
        Instanciando um novo objeto do tipo Main e chamando o método instanceMain2()
         */
        new Main().instanceMain2();
        /*
        Instanciando um novo objeto do tipo Main e chamando o método chamarMetodoBastract()
         */
       //new Main().chamarMetodoAbstract();

        /*
        Isso daqui só irá funcionar se tirar o abstract da classe TesteAbstract
         */
        // new TesteAbstract();

        new Main().iniciar();
    }

    /*
    Quando se cria um método que já foi criado na classe abstrata, isso se
    chama reescrever o método, sobrecarregar método
     */
    @Override
    public void iniciarJogo() {

    }

    /*
     Método criado para chamar método da classe Abstrata
   */
    public void chamarMetodoAbstract(){
        /*
        O this referencia atributos e métodos que tem na própria classe
         */
       this.chamarMetodoAbstract();
    }

    /*
    Criando um método para que possa chamar a nova classe criada
     */
    public void instanceMain2()
    {
        new Main2().print1();
    }

    /*
    Método implementado da interface criada, e agora pode criar as instruções para ela
     */
    @Override
    public void iniciar() {
        System.out.println("Método da Interface");
    }

    @Override
    public void morrer() {

    }

    @Override
    public void perderVida() {

    }
    /*************************************************************************************/
    /*
    Fazer uma classe dentro da outra se chama Inner Class
     */
    private class Main2{
        public void print1()
        {
            System.out.println("Chamando meu método na classe Main2");
        }
    }

}