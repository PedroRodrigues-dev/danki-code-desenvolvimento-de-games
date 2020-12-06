/*
Package aluno é o package que foi criado dentro do src, e alunos é o nome dele
se importa ele para dizer onde essa pasta está localizada, já que o projeto pode
ter várias pastas com vários códigos.
 */
package aluno;

/*
Aqui fica os imports, que são bibliotecas que são importadas para serem
usadas funções dentro do programa
 */
import java.util.Random;
import java.util.Scanner;

/*
Main é o nome da classe ( nome do arquivo criado ), ele não pode ser main com letra minuscula
porque irá dar conflito com o método main, sempre iniciar nome de classe com letra maiúsucla
 */
public class Main {
    /*
    Método main, o método que inicia todo o programa a ser executado
    Ele nunca mudará de nome, pois o main não é o nome da sua classe, e sim o nome do método
     */
    public static void main(String[] args) {
        /*
        Aqui está o Scanner, que é uma classe que será usada
        onde contém os métodos para entrada de dados do usuário

        O Scanner é uma classe, o nome entrada é o nome da variável, importante
        não usar a variável in pois ela pode dar erro porque o System.in já é com esse nome.
        O system.in é um argumento passado para o construtor da classe
        Não se preocupe com essa nomenclatura por agora, pois será ensinada nos próximos módulos

        Para utilizar o Scanner, tu irá ter que importar ele, para fazer isso
        é só ir com o mouse em cima do Scanner ou clicar com o botão direito em cima do Scanner, e ir em
        import "Scanner.java.util"
         */
        Scanner entrada = new Scanner(System.in);

        /*
        Random é outro objeto que será usado, para gerar números
        aleatório, não se preocupem com isso por enquanto, pois no próximo
        módulo será explicado o que é um objeto e como utilizar e criar.
         */
        Random rand = new Random();

        /*
        Podemos declarar mais variáveis juntas, se forem do mesmo tipo
        só precisa ser separada por virgula
         */
        String nome;

        System.out.println("Seja bem-vindo ao jogo! Insira o seu nome: ");
        /*
         Variável do tipo String que irá pedir para o usuário
         digitar algo e irá guardar esse dado na variável nome.
         A função nextLine() é uma função que irá deixar o usuário digitar algo.

         Veja que a função nextLine() está sendo acessado pela variável entrada, que foi criada
         ali em cima.
         */
        nome = entrada.nextLine();
        System.out.println("Seja muito bem-vindoo(a) " + nome);
        System.out.println("Você deseja avançar para qual direção ? (w, s, a, d) ");
        String comando = entrada.nextLine();
        if(comando.equals("w")){
            System.out.println("Você está indo para frente!");
            System.out.println("Um inimigo surgiu, o que deseja fazer ? (a = atacar, c = correr) ");

            comando = entrada.nextLine();
            if(comando.equals("a")){

                /*
                Aqui será usado a variável rand criada a cima, usando o método nextInt que irá gerar
                um número aleatório entre 0 a 99, como é dito ali dentro, onde coloca o 100, e ai feito a expressão
                SE o rand(número randômico) for < 75 dai irá entrar no if, SENAO ele irá ir para o ELSE,
                dando assim 75% do personagem ganhar, já que é de 0 a 75.
                 */
                if(rand.nextInt(100) < 75){
                    System.out.println("Você ganhou o JOGO!");
                }else{
                    System.out.println("Você PERDEU o JOGO!");
                }
            }else{
                System.out.println("Você correu! O jogo terminou!");
            }
        }else if(comando.equals("s")){
            System.out.println("Você está entrando em outro mapa...");
            /*
            Deem continuidade
             */
        }
    }
}
