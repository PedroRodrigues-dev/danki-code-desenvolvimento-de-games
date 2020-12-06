/*
Package aluno é o package que foi criado dentro do src, e alunos é o nome dele
se importa ele para dizer onde essa pasta está localizada, já que o projeto pode
ter várias pastas com vários códigos.
 */
package alunos;

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
        /**************************** Hello World *******************************/
        /*
        System.out.println é o método para printar frases, variaveis, etc no console
        Usado para debugar programas.
        O println pulará uma linha, já só o print só irá printar tudo na mesma linha
        Então cuidado com qual irá usar
         */
        System.out.println("Hello World");

        /**********************************************************/

        /**************************** Variáveis em Java *******************************/
        /*
        Assim se escreve uma variavel em java
        Onde primeiro será o tipo da variável, podendo ser, int, float, double, boolean, string, arrays, etc
        Depois vem o nome da variavel que no caso está como idade.
        E por ultimo vem o valor, que é atribuido através do sinal: = : que é o sinal que atribui o valor a variável.
         */
        int idade = 24;
        /*
        Abaixo está sendo concatenado uma frase com uma variável, concatenar é juntar uma variável com uma frase
        que é feito usando o operador: +
         */
        System.out.println("Minha idade é " + idade + " anos");

        /**********************************************************/

        /**************************** Tipos de Variáveis *******************************/

        // As variáveis podem ser alteradas em qualquer parte do seu código //

        // Int é um tipo que guarda só numeros inteiros, seja negativo ou positivo, e o valor tem que ir sem aspas
        int numero = 2400000;

        // String é um tipo que guarda frases, qualquer tamanho, e o valor precisa ir dentro de aspas duplas
        String frase = "Olá mundo";

        // Boolean é o tipo que pode ser true ou false, serve para condicionais, e seu valor deve ser escrito sem aspas
        boolean condicao = true;

        // Char é um tipo que guarda só um caracter, e seu valor precisa ir com aspas simples
        char caracter = 'a';

        /*
        Double é um tipo que guarda um número com ponto flutuante com bastante precisão,
        e seu valor precisa ir sem aspas e com ponto separando as casas decimais
        */
        double numeroDouble = 24.9;

        /*
        Float é um tipo que guarda um número com ponto flutuante com precisão, mas menos precisão que Double,
        e seu valor precisa ir sem aspas e com ponto separando as casas decimais e com "f" atrás para simbolizar o float
        */
        float numeroFloat = 3.9f;

        System.out.println(numero);
        System.out.println(frase);
        System.out.println(condicao);
        System.out.println(caracter);
        System.out.println(numeroDouble);
        System.out.println(numeroFloat);

        /**********************************************************/

        /**************************** Constantes *******************************/

        // Constantes se define o valor uma vez e não pode ser mais alterado em lugar algum

        /*
        Para se declarar uma constante precisa ser adicionado a palavra reservada: final
        antes do tipo da variável, assim ela não poderá ser mais mudada durante o código
         */
        final double PI = 3.1416;

        System.out.println(PI);

        /**********************************************************/

        /**************************** Arrays *******************************/

        // São estruturas de dados que armazena uma coleção de elementos, podendo ser acessados através de indices
        // Lembre-se o índice sempre inicia em zero.

        /*
        Para se declarar um array, primeiro precisa colocar o tipo da variável,
        depois um [] para que possa ser intentificado como Array, e depois o nome da
        variável, e após isso ela precisa ser instanciada ( será visto melhor esse termo no módulo posterior)
        Assim criando o array, e nessa instanciação que é o: new String[5] dentro do colchetes vai o número total
        de elementos que esse array terá, iniciando do 0, ou seja: 0 1 2 3 4.. é um array com 5 elementos.
         */
        String[] nome = new String[5];

        /*
        Aqui estamos escrevendo o nome Guilherme e adicionando no primeiro indice, acessando
        ele com o nome da variável e o primeiro indice do array que é zero.
        E depois adicionando João no inidice 1 do array.

        Ai temos um array simples
         */
        nome[0] = "Guilherme";
        nome[1] = "João";

        // Se acessa assim para imprimir o primeiro nome
        System.out.println("Meu nome é " + nome[0]);

        /* Array Multidimenciona
        Array multidimencional funciona como uma matriz
        Por exemplo uma tabela do excel, que tem colunas e linhas
        Tem a mesma função que o array simples, só que com muito mais espaço e ordenada como uma matriz
         */

        /*
        Para criar um array multidimencional se faz igual ao um array simples só que se adiciona
        String [][] pois será um array com duas dimensões, poderia ser
        String [][][] e ai seria um array com 3 dimensões
        Aqui temos um array com 5 elementos e mais 5 elementos
         */
        String[][] nome1 = new String[5][5];

        /*
        Aqui estamos acessando o primeiro índice, não esquecendo que agora é preciso
        colocar dois [][] e assim dizendo que é no índice 0
        E o outro no indice 1.
         */
        nome1[0][0] = "Guilherme";
        nome1[0][1] = "João";

        /*
        para imprimir no console se usa assim
         */
        System.out.println("Meu nome é " + nome1[0][1]);

        /**************************** Condições *******************************/

        /*
        Condicionais são utilizadas a todo tempo em programas, para definir o que o
        programa fará SE algo acontecer.
        São como rotas que serão traçadas, se algo acontecer irá para outro lado e assim
        por diante
         */

        int vida = 100;

        /*
        O if traduzindo para o português significa SE, ou seja
        SE algo acontecer irá fazer isso
        Para entrar na condicional if a expressão dentro dele precisa ser verdadeira, pois SENAO
        irá passar para o ELSE

        *Obs: o operador == é um operador de igualdade e o += está somando e atribuindo 100 a variável vida

        Aqui dirá SE vida for IGUAL a 100 irá entrar ali na condição
        e irá adicionar mais 100 na variável vida e irá imprimir no console a variável vida
         */
        if(vida == 100){
            vida += 100;

            System.out.println("Minha vida é igual a 100!");
        /*
            O else, traduzindo para o portugês significa SENAO,
            ou seja SE vida não for IGUAL a 100, irá printar no console
            a frase definida ali embaixo
        */
        }else{
            System.out.println("Minha vida não é igual a 100!");
        }

        /*
        Operadores que podem ter dentro do if para comparações de tipos de variáveis numéricas

        < Menor
        > Maior
        <= Menor ou igual á
        >= Maior ou igual á
        == Igual
        != Diferente
         */

        // Para variáveis do tipo string só pode ser usado a igualdade ou Diferente

        String novoNome = "Guilherme";

        if(novoNome == "Guilherme"){
            System.out.println("Nome igual a " + novoNome);
        /*
        O else if significa SENAO SE

        pode ter quantos else if quiser mas cuidado, pois o else if precisa ir depois do if e antes do else
        o ELSE precisa ser sempre o ultimo, ou não precisa ter ELSE
         */
        }else if(novoNome == "Felipe"){
            System.out.println("Nome igual a " + novoNome);
        }else{
            System.out.println("Nome diferente de " + novoNome);
        }

        boolean variavelBool = true;

        /*
        Quando se tem só uma instrução dentro do if, pode ser feito
        sem adicionar as chaves, para mais de uma instrução precisa da chave
         */
        if(variavelBool)
            System.out.println("A variávelBool é " + variavelBool);
        else
            System.out.println("A variávelBool é " + variavelBool);

        /**********************************************************/

        /**************************** Switch e case *******************************/

        /*
        O switch case é uma condicional para testar vários valores com mais rapidez
        e escrevendo menos código que no if
        Mais a diferença dele para o if é que dentro do switch não pode ir expressões, ele
        só testará variáveis, já o if testa expressões complexas

        Dentro do switch vai a variável a ser testada, sendo booleana, do tipo numério, ou tipo string ou char.
        E dai no case vai testar os valores
        Usa-se o break para que o programa não de erro na execução, assim quando der break
        o programa irá parar na condição que ja der correto, se não ele poderá
        testar cada condição e deixar o programa lento ou dar bug
         */

        int vida2 = 100;

        switch (vida2){
            // CASO vida2 sejá igual a 100
            case 100:
                // Fará isso daqui
                System.out.println("Variável vida2 é " + vida2);
                // Break para quebrar a execução
                break;
            case 200:
                System.out.println("Variável vida2 é " + vida2);
                break;
            case 400:
                System.out.println("Variável vida2 é " + vida2);
                break;
        }

        /**********************************************************/

        /*********** Operacoes avançadas e operações matemáticas ***********************/

        /*
        Dentro de programas podemos fazer operações matemáticas como
        Somar, dividir, multiplicar, subtrair e entre outras
        E também veremos operadores para comparações, e para fazer expressões mais complexas

        + Mais
        - Menos
        * Multiplicar
        / Dividir
        % Módulo ( Pouco usado )

        && E ( AND ) Teclas: Shift + 7 ( teclado númerico a cima das letras )
        || OU ( OR ) Teclas: shift + \ ( Barra invertida está do lado do shift esquerdo do seu teclado )
        == Igual
        != Diferente
         */

        int vida_1 = 100;
        int vida_2 = 200;
        int vida_3 = 300;

        // Aqui podemos guardar o resultado de uma operação matemática
        int vida_final = vida_1 + vida_2 + vida_3;
        /*
        Aqui o operador mais não servirá para concatenar e sim para fazer a soma
        dos valores das variáveis, pois o computador já percebe que são valores numéricos
         */

        System.out.println(vida_1 + vida_2 + vida_3);

        // Exibindo a variável vida_final contendo a soma das vidas
        System.out.println(vida_final);

        /*
        Como na matemática, dentro de um programa se queremos que algo seja
        calculado antes, nós usaremos parênteses como é mostrado abaixo
        Assim o que está em parênteses será calculado antes, e após isso será feito o que
        está fora dele
         */
        int vida_final2 = (vida_1 + vida_2) / 2;
        System.out.println(vida_final2);


        String nome_jogador = "Guilherme";
        int skill = 100;

        /*
        A condição se lê assim:
        SE (nome_jogador for IGUAL a Guilherme E skill for IGUAL a 100 ) E skill for MENOR OU IGUAL a 90
        faça a instrução abaixo
         */
        if((nome_jogador == "Guilherme" && skill == 100) && skill <= 90){
            System.out.println("Verdade");
        }else{
            System.out.println("entramos no else");
        }

        /*
        Se (nome_jogador for IGUAL a Guilherme OU nome_jogador for IGUAL João) E skill for MAIOR OU IGUAL a 100
        faça a seguinte instrução
         */
        if((nome_jogador == "Guilherme" || nome_jogador == "João") &&
                skill >= 100){
            System.out.println("Comece o jogo");
        }

        /*
        Imagem de resumo dos operadores estão colocados na tabela na imagem que tem para download
         */

        /**********************************************************/

        /**************************** Looping *******************************/

        /*
        Loopings são utilizado para gerar uma ação lógica até ou enquanto algo for de tal jeito.
        Temos os loop FOR, WHILE, DO WHILE e outros mais complexos, mas esses são os principais e mais
        usados.
        Com eles é possível percorrer um array, e fazer outras diversas ações.
         */

        /*
        Variavel que irá servidor para incrementar o WHILE
        variável muito importante, pois se não tiver ela
        o loop irá executar infinitamente, e poderá travar o seu computador ou
        computador da outra pessoa.
        Então cuidado para sempre usar uma variável para incrementar dentro do while
         */
        int contador = 0;

        /*
        O WHILE traduzindo para o portugês significa ENQUANTO
        ou seja, ENQUANTO algo for de tal jeito, ele irá executar tal coisa
        Quanto a expressão for falsa ele sairá do loop e continuará executando outras instruções.
         */
        while(contador < 10){
            /* Aqui irá exibir a Olá 9 vezes, porque quando for 10 ele já não será mais menor
            que 10 e por isso irá sair do loop.
            Para executar 10 vezes, precisa colocar:  contador <= 10
            */
            System.out.println("Olá! , agora o contador está em: " + contador);

            /*
            Variável sendo incrementada
            Quando se coloca ++ atrás de uma variável do tipo numérica,
            ela irá adicionar mais 1 na variável o mesmo acontece com o --,
            só que ai irá decrementar 1 da variável.
             */
            contador++;
        }

        /*
        O loop for é o mais usado para desenvolvimento, pois com ele não precisa
        se preocupar de não colocar a variável incrementadora para não travar,
        pois em seu corpo ele já traz ela.
        O for significa em programação: FAÇA ATÉ.

        O for é constituido de 3 fases separadas por ponto e vírgula
        A primeira: int i = 0 -> Essa fase é onde se cria a variável e atribui um valor a ela
        A segunda: i <= 10 -> É a expressão que o loop terá que fazer até ser falso e sair do loop.
        A terceira: é a variável que foi criada sendo incrementada ou se preferir, pode ser
        decrementada, assim fazendo a condição do for ser falsa, e saindo do loop
         */
        for(int i = 0; i <= 10; i++){
            System.out.println("Olá! , agora o contador está em: " + i);
        }

        /*
        O DO WHILE é um loop bem pouco usado, usado raramente, pois o while e o for
        já consegue fazer 99% das coisas, e também por ser um loop um pouco mais complexo de se entender
        e aplicar.

        O DO irá executar a instrução e só depois irá entrar na verificação que é o WHILE
        por isso ele sempre irá executar uma vez, e se não apssar na verificação ele sai do loop
        DO significa FAÇA
        e o WHILE significa ENQUANTO
         */

        int contador1 = 0;
        do{
            System.out.println(contador1);
            // Não esqueça de incrementar
            contador1++;
        }while(contador < 3);

        /**********************************************************/

    }
}
