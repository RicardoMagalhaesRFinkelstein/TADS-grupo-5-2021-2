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
				"Escolha uma das opções abaixo:\n\n" 
						+ "1) Instruções\n"
						+ "2) Jogar\n" 
						+ "3) Créditos\n" 
						+ "4) Sair");

		do {

			numeroMenu = sc.nextInt();

			switch (numeroMenu) {

			case 1:
				 texto = ("Aguardando instruções...");
				 delay(texto);
				System.out.println(" - Utilize os numeros identificados ao lado de cada sentença " 
								+ "para definir sua escolha.\n"
								+ " - Atenção, a história é importante para a conclusão do jogo.\n"
								+ " - Suas escolhas possuem importância.");
				break;

			case 2:
				texto = ("Aguardando o jogo iniciar...");
				delay(texto);
				jogar = false;
				break;

			case 3:
				texto = ("Aguardando créditos...");
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
				System.out.println("Valor inválido.");
				break;
			}

		} while (sair && jogar);
		
		
		if (sair == false) {
			System.out.println();
			System.out.println("Obrigado, até a proxima.");
		}
		else {
		
		
		//INICIO DO DESAFIO 4 
		 texto = "DESAFIO 04\n";
		delay(texto);
		
		 texto = " O agente chega à embaixada após salvar os reféns sob ordens do seu superior\n"
				+ "quando é abordado por um homem aparentemente um dos diplomatas do local,ele explica ao agente\n"
				+ "sobre a situação da embaixada. Ela está cheia de dignitários de vários países\n"
				+ "que estão buscando obter a documentação para sair do país.\n";
		delay(texto);
		
		 texto = " Então o agente pergunta:\n";
		delay(texto);
		
		 texto = "  Agente A: O senhor notou algum movimento estranho por aqui ?\n";
		delay(texto);
		
		 texto = "  O Diplomata: Tirando o fato de todos estarem e pânico para fugir dessa guerra iminente?\n"
				+ "    notei a falta de alguns embaixadores nesta manhã na reunião, mas ha pouco quando perguntei\n"
				+ "    por eles no prédio, e me foi informado que eles não deixaram as intalações.\n ";
		delay(texto);
		
		 texto = " O agente então segue olhando cada comodo da embaixada,\n"
				+ "até que ele nota um homem com a uma aparência diferente dos demais,\n"
				+ "acompanhado de um dos embaixadores, que aparentava estar assustado.\n";
		delay(texto);
		
		 texto = " Ao tentar se aproximar do homem, ele puxa uma arma e começa a atirar,\n"
				+ "O agente se assusta, e encontra uma cobertura atrás de uma parede\n"
				+ "o homem então corre para o saguão principal aonde da acesso a uma escadaria\n"
				+ "e entra em uma porta que lá estava, com uma fechadura eletronica.";
		delay(texto);
		
		 texto = "O agente chega na porta e nota um simbolo da ISIS-K desenhado em sangue em seu adorno.\n"
				+ "Tambem percebe-se uma fechadura eletrônica que pede uma senha de 6 digitos para o acesso.";
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
