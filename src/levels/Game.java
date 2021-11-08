package levels;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroMenu;
		boolean sair = true;
		boolean jogar = true;
		String texto;

		System.out.println(
				"Escolha uma das op��es abaixo:\n\n" 
						+ "1) Instru��es\n"
						+ "2) Jogar\n" 
						+ "3) Cr�ditos\n" 
						+ "4) Sair");

		do {

			numeroMenu = sc.nextInt();

			switch (numeroMenu) {

			case 1:
				 texto = ("Aguardando instru��es...");
				 delay(texto);
				System.out.println(" - Utilize os numeros identificados ao lado de cada senten�a " 
								+ "para definir sua escolha.\n"
								+ " - Aten��o, a hist�ria � importante para a conclus�o do jogo.\n"
								+ " - Suas escolhas possuem import�ncia.");
				break;

			case 2:
				texto = ("Aguardando o jogo iniciar...");
				delay(texto);
				jogar = false;
				break;

			case 3:
				texto = ("Aguardando cr�ditos...");
				delay(texto);
				System.out.println("Equipe de Desenvolvimento:\n" 
						+ " - Victor Henrique Moreira\n"
						+ " - Viviane Cipollari\n"
						+ " - Ricardo Finkelstein\n" 
						+ " - Matheus\n");
				break;

			case 4:
				texto = ("Encerrando o menu...");
				delay(texto);
				sair = false;
				break;

			default:
				System.out.println("Valor inv�lido.");
				break;
			}

		} while (sair && jogar);
		
		
		if (sair == false) {
			System.out.println();
			System.out.println("Obrigado, at� a proxima.");
		}
		else {
		
		
		//INICIO DO DESAFIO 4 
		 texto = "DESAFIO 04\n";
		delay(texto);
		
		 texto = " O agente chega � embaixada ap�s salvar os ref�ns sob ordens do seu superior\n"
				+ "quando � abordado por um homem aparentemente um dos diplomatas do local,ele explica ao agente\n"
				+ "sobre a situa��o da embaixada. Ela est� cheia de dignit�rios de v�rios pa�ses\n"
				+ "que est�o buscando obter a documenta��o para sair do pa�s.\n";
		delay(texto);
		
		 texto = " Ent�o o agente pergunta:\n";
		delay(texto);
		
		 texto = "  Agente A: O senhor notou algum movimento estranho por aqui ?\n";
		delay(texto);
		
		 texto = "  O Diplomata: Tirando o fato de todos estarem e p�nico para fugir dessa guerra iminente?\n"
				+ "    notei a falta de alguns embaixadores nesta manh� na reuni�o, mas ha pouco quando perguntei\n"
				+ "    por eles no pr�dio, e me foi informado que eles n�o deixaram as intala��es.\n ";
		delay(texto);
		
		 texto = " O agente ent�o segue olhando cada comodo da embaixada,\n"
				+ "at� que ele nota um homem com a uma apar�ncia diferente dos demais,\n"
				+ "acompanhado de um dos embaixadores, que aparentava estar assustado.\n";
		delay(texto);
		
		 texto = " Ao tentar se aproximar do homem, ele puxa uma arma e come�a a atirar,\n"
				+ "O agente se assusta, e encontra uma cobertura atr�s de uma parede\n"
				+ "o homem ent�o corre para o sagu�o principal aonde da acesso a uma escadaria\n"
				+ "e entra em uma porta que l� estava, com uma fechadura eletronica.";
		delay(texto);
		
		 texto = "O agente chega na porta e nota um simbolo da ISIS-K desenhado em sangue em seu adorno.\n"
				+ "Tambem percebe-se uma fechadura eletr�nica que pede uma senha de 6 digitos para o acesso.";
		delay(texto);
		
		//FIM DO DESAFIO 4
}	
		sc.close();
	}

	static void delay(String TextoFuncao) {
		int tamanhoDelay = TextoFuncao.length();
		System.out.println(TextoFuncao);
		try {
			TimeUnit.SECONDS.sleep(tamanhoDelay / 15);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}
}
