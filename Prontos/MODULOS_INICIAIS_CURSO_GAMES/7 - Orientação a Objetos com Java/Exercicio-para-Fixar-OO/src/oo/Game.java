package oo;

public class Game {

    private Player player;
    private Inimigo inimigo;

    public Game() {
        // player = new Player();
        if (player == null) {
            System.out.println("O player não foi inicializado");
            player = new Player();
        }

        player = new Tipo1();

        /*
        O instanceof é utilizado para ver se uma instancia é daquela classe mesmo, para poder identificar a classe
        e fazer uma ação se for ela, ou se for outra classe
         */
        if(player instanceof Tipo1){
            System.out.println("Player instanciado e é do TIPO1");
        }else if(player instanceof Player)
        {
            System.out.println("O player foi inicializado com sucesso, e faz referência a classe Player");
        }
        inimigo = new Inimigo();
    }

    public Player getPlayer(){
        return player;
    }

    public Inimigo getInimigo(){
        return inimigo;
    }

    public static void main(String[] args) {
        Game game = new Game();
        Player player = game.getPlayer();
        player.atacarInimigo(game.getInimigo());

        System.out.println(game.getInimigo().life);
    }
}
