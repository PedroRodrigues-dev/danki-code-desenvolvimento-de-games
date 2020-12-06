package graficos;

import javafx.print.PageLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements Runnable{

    /*
    JFrame representa a janela do programa com barra de título, ícone, botões de comando, etc
     */
    public static JFrame frame;
    private Thread thread;
    /*
    BufferedImage será utilizado para renderizar uma imagem preta por baixo de tudo
    para depois conseguir renderizar mapas, sprites e tudo mais
     */
    private BufferedImage image;
    // Criando variavel para imagem do player será um array contendo as 2 imagens de animação
    private BufferedImage[] player;
    /*
    Criando uma variavel do tipo Spritesheet
     */
    private Spritesheet sheet;

    private final int WIDTH = 160;
    private final int HEIGHT = 120;
    private final int SCALE = 3;

    // Variavel criada para posição do x do player
    private int x = 0;

    // Variavel que será responsável pelo controle  dos frames
    private int frames = 0;
    // Variavel para dizer a velocidade que irá acontecer a animação
    private int maxFrames = 5;
    // Variavel será repsonsável pelos indexes do array
    private int curAnimation = 0;
    // Variavel que vê quantas animações tem
    private int maxAnimation = 4;

    private boolean isRunning = true;

    public Game(){
        // Instanciando a variavel Spritesheet
        sheet = new Spritesheet("/spritesheet.png");
        // Dizendo que o player stárá na posição 0 e 0 do arquivo spriteSheet, e que é do tamanho 16, 16
        // player = sheet.getSprite(0, 0, 16, 16);
        player = new BufferedImage[4];
        player[0] = sheet.getSprite(0, 0, 16, 16);
        player[1] = sheet.getSprite(16, 0, 16, 16);
        player[2] = sheet.getSprite(32, 0, 16, 16);
        player[3] = sheet.getSprite(48, 0, 16, 16);
        /*
        Esse método é para atribuir o tamanho da janela que irá querer, o
        new Dimension irá fazer uma nova dimensão
         */
        setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        initFrame();
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    }

    public void initFrame(){
        // Criando uma nova instancia do JFrame
        frame = new JFrame("Game #1");
        // vai adicionar o canvas ao JFrame
        frame.add(this);
        // método para redimencionar a tela, está como falsa para não deixar
        frame.setResizable(false);
        // método do frame para calcular certa as dimensões e mostrar
        frame.pack();
        // método para fazer a localização da tela, dizendo que é null, ela estará indo para o centro
        frame.setLocationRelativeTo(null);
        // método que irá dizer que se clicar no botão de fechar, ele irá fechar, e não deixar em segundo plano
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // método para deixar a janela visível
        frame.setVisible(true);
    }

    public synchronized void start(){
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    public synchronized void stop(){
        isRunning = false;
        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public void tick(){

        frames++;
        if(frames > maxFrames){
            frames = 0;
            curAnimation++;

            if(curAnimation >= maxAnimation){
                curAnimation = 0;
            }
        }
    }

    public void render(){
        /*
        Buffer Strategy é uma sequencia de buffer usadas para otimizar a renderização
        visto que buffer é uma área de armazenamento temporário de dados.
         */
        BufferStrategy bs = this.getBufferStrategy();
        /*
        Se não tiver um BufferStrategy ele irá criar e retornar ele
         */
        if(bs == null){
            /*
            Usasse-se 3 para melhor limpeza e otimização
             */
            this.createBufferStrategy(3);
            return;
        }

        //Criação de uma variável de objeto Graphics que contem métodos para renderizar na tela
        Graphics g = image.getGraphics();
        // Aqui será definido a cor
        g.setColor(new Color(0, 0, 255));
        // Aqui será definido o tamanho e posição do retângulo
        // Faz a largura e a altura
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // RENDERIZAÇÃO DO JOGO

        // Desenhando um retangulo
//        g.setColor(Color.red);
//        g.fillRect(20, 20, 80, 80);
//
//        // Desenhando uma forma Oval
//        g.setColor(Color.CYAN);
//        g.fillOval(50, 50, 60, 60);
//
//        // Desenhando string
//        g.setFont(new Font("Arial", Font.BOLD, 20));
//        g.setColor(Color.yellow);
//        g.drawString("GAME", 90, 90);

        // Variavel g2 sendo do tipo Graphics2D só para pegar métodos para renderização da animação
        Graphics2D g2 = (Graphics2D) g;
        // Método para rotacionar o sprite, o toRadians irá converter o 90 que é em graus para radianos e os outros é posição x e y
        // g2.rotate(Math.toRadians(45), 90 + 8, 90 + 8);
        // Desenhando o player
        //g2.drawImage(player, 90, 90, null);

        g2.drawImage(player[curAnimation], 90, 90, null);

        // Método para limpar dados das imagens que foram utilizado antes
        g.dispose();
        // O que foi feito antes foi desenhado na imagem, e agora será desenhado essa imagem na tela
        g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
        // Aqui será feito a exibição de tudo que foi feito no render
        bs.show();
    }

    @Override
    public void run() {
        // Essa variável irá pegar o tempo atual do nosso computador em nano segundos para precisão
        long lastTime = System.nanoTime();
        // Quantos frames por segundo irá querer;
        double amountOfTicks = 60.0;
        // Variavel que irá dividir um segundo no formato de nano segundos para o tanto de FPS que irá querer
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        // Variavel que irá ser o FPS
        int frames = 0;
        // Variavel que pegará o tempo atual só qu deu ma forma mais leve
        double timer = System.currentTimeMillis();
        while(isRunning){
            // Variavel pegará o tempo atual do nosso computador
            long now = System.nanoTime();
            /*Calculando o intervalo para executar o update(tick), pois está dividindo a variavel do temp ode agora
            pelo tempo decorido até aqui que é a variável lastTime e tudo divido pelo tanto de FPS que foi calculado a cima
             */
            delta += (now - lastTime) / ns;
            // Para atirbuir o tempo atual para a variavel lastTime, assim sempre irá atualizar o tempo em condição do agora
            lastTime = now;
            if(delta >= 1){
                tick();
                render();
                frames++;
                delta--;
            }
            /*SE System.currenteTimeMillis() - timer for maior ou igual a 1000 significa que passou um segundo
            após a ultima vez que passou a mensagem
             */
            if(System.currentTimeMillis() - timer >= 1000){
                System.out.println("FPR: " + frames);
                frames = 0;
                timer += 1000;
            }
        }
        /*
        Metodo de garantia se der algum problema no método, que as Threads parem acionando o
        public synchronized void stop()
         */
        stop();
    }
}
