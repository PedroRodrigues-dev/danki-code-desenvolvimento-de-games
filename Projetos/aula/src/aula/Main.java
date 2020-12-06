package aula;

public class Main {
	
	public static void main(String[] args) {
		/*
		int idade = 24;
		System.out.println("Minha idade é "+idade);
		idade = 25;
		System.out.println("Minha idade é "+idade);
		idade = 26;
		System.out.println("Minha idade é "+idade);
		*/
		//Tipos de variáveis
		/*
		int numero = 24000000;
		String frase = "Olá mundo!";
		boolean var = true;
		char var2 = 'a';
		double var3 = 24.9;
		
		System.out.println(numero);
		System.out.println(frase);
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);
		*/
		//Constantes
		/*
		final int vida_maxima = 10;
		System.out.println(vida_maxima);
		*/ 
		 //Arrays
		 /*
		String[] nome = new String[5];
		nome[0] = "Guilherme";
		nome[1] = "João";
		
		String[] [] var2 = new String[5] [5];
		var2[0] [0] = "Felipe";
		System.out.println(var2[0] [0]);
		*/
		/*
		int vida = 101;

		 >
		 <
		 >=
		 <=
		 !=
		
		if(vida < 100) {
			vida+=100;
			System.out.print("Minha vida é maior a 100!");
		}else {
			System.out.println("Minha vida não é igual a 100!");
		}
		
		String nome = "Guilherme";
		if(nome == "Guilherme") {
			System.out.println("Nome igual a " + nome);
		}else if(nome == "Joao") {
			
		}else if(nome == "Felipe") {
			
		}else {
			
		}
		
		if(nome != "Joao") {
			System.out.println("O nome é diferente de joão");
		}
		
		boolean var = true;
		if(var) 
			System.out.println("Verdade");
		System.out.println("");
		*/
		
		/*
		int vida = 90;
		
		switch(vida) 
		{
			case 90:
			//Execute alguma ação aqui!
			System.out.println("Quero que meu personagem corra mais rápido!");
			break;
			case 30:
			System.out.println("Minha vida é igual a 30!");
			break;
			default:
			System.out.println("Nenhuma condição bateu! Eu tenho 100 de vida!");
			break;
		}
		*/
		/*
		int vida_1 = 100;
		int vida_2 = 100;
		int vida_3 = 200;
		int vida_final = vida_1 * vida_2 + vida_3;
		
		int vida_final2 = ((vida_1 + vida_2) / 2) * 2;
		System.out.println(vida_final2);
		*/
		/*
		String nome_jogador = "Guilherme";
		int skill = 100;
		
		if((nome_jogador == "Guilherme" && skill == 100) && skill <=90) {
			//podemos executar esse código
			System.out.println("Verdade");
		}else {
			System.out.println("entramos no else");
		}
		
		if((nome_jogador == "Guilherme" || nome_jogador =="João") && 
				skill >= 100) {
			System.out.println("Comece o jogo!");
		}
		*/
		
		
		//int contador = 1;
		/*
		while(contador <= 10) {
			System.out.println("Olá, agora o contador está em:"+contador);
			contador++;
		}
		*/
		
		/*
		for(int i = 1;i<=10;i++) {
			System.out.println("Olá, agora o contador está em:"+i);
		}
		*/
		/*
		contador = 0;
		do{
			//
			System.out.println(contador);
			contador++;
		}while(contador < 3);
		*/
		
	}
	
}
