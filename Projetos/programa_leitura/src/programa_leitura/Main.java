package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		String nome, idade, peso,cidade,estado,pais;
		System.out.println("Por favor digite o seu nome:");
		nome = in.nextLine();
		System.out.println("Por favor digite o sua idade:");
		idade = in.nextLine();
		System.out.println("Por favor digite o seu peso:");
		peso = in.nextLine();
		System.out.println("Por favor digite o sua cidade:");
		cidade = in.nextLine();
		if(cidade.equals("Floripa")) {
			System.out.println("Show! Sou de floripa tamb�m");
		}else {
			System.out.println("Que pena voc� n�o � de Floripa :/");
		}
		System.out.println("Por favor digite o seu estado:");
		estado = in.nextLine();
		System.out.println("Por favor digite o seu pa�s:");
		pais = in.nextLine();
		//Gerar resultado final:
		System.out.println("---------");
		System.out.println("Aqui est� o resultado do teste:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
		System.out.println("Pa�s: " + pais);
		*/
		Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
		System.out.println("Seja bem-vindo ao jogo! Insira seu nome:");
		nome = in.nextLine();
		System.out.println("Seja muito bem-vindo(a) "+nome);
		System.out.println("Voc� deseja avan�ar para qual dire��o?(w,s,a,d)");
		String comando = in.nextLine();
		if(comando.equals("w")) {
			System.out.println("Voc� est� indo para frente!");
			System.out.println("Um inimigo surgiu, o que deseja fazer?(a=atacar,c=correr)");
			comando = in.nextLine();
			if(comando.equals("a")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("Voc� ganhou o jogo!");
				}else {
					System.out.println("Voc� perdeu o jogo!");
				}
			}else {
				System.out.println("Voc� correu! O jogo terminou!");
			}
		}else if(comando.equals("s")) {
			System.out.println("Voc� est� entrando em outro mapa...");
			//**/
		}
		
	}
	
}
