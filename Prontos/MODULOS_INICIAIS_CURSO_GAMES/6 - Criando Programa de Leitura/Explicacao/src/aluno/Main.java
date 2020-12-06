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
        Podemos declarar mais variáveis juntas, se forem do mesmo tipo
        só precisa ser separada por virgula
         */
        String nome, idade, peso, cidade, estado, pais;

        System.out.println("Por favor digite o seu nome: ");

        /*
         Variável do tipo String que irá pedir para o usuário
         digitar algo e irá guardar esse dado na variável nome.
         A função nextLine() é uma função que irá deixar o usuário digitar algo.

         Veja que a função nextLine() está sendo acessado pela variável entrada, que foi criada
         ali em cima.
         */
        nome = entrada.nextLine();
        System.out.println("Por favor digite a sua idade: ");
        idade = entrada.nextLine();
        System.out.println("Por favor digite o seu peso: ");
        peso = entrada.nextLine();
        System.out.println("Por favor digite a sua cidade: ");
        cidade = entrada.nextLine();

        /*
        Condicional dizendo se ciade for IGUAL a Floripa ele fará tal coisa
        Lembre-se a palavra precisa ser digitada EXATAMENTE assim, com minúscula
        e maiuscula certa para cair dentro da condicional
         */
        if(cidade == "Floripa"){
            System.out.println("Show! Sou de Floripa");
        }
        System.out.println("Por favor digite o seu estado: ");
        estado = entrada.nextLine();
        System.out.println("Por favor digite o seu pais: ");
        pais = entrada.nextLine();

        /*
        Gerando resultados finais e imprimindo na tela
         */
        System.out.println("---------------------");
        System.out.println("Aqui está o resultado do teste: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Pais: " + pais);
    }
}
