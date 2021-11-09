package levels;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    static String texto;


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
			//INICIO DO DESAFIO 01
			texto = " -     DESAFIO 01     - ";

			delay(texto);
			texto = "Ap�s desastres no Afeganist�o e o Talib� tomar o poder do pa�s, foi designado um agente da CIA para ir ao Afeganist�o e ajudar na evacua��o dos soldados americanos no aeroporto de Cabul no Afeganist�o.\n"
					+ "Chegando no aeroporto e ap�s conseguir realizar a evacua��o dos soldados o/a agente percebeu que estava faltando um grupo de soldados e sabendo que teria que dar uma explica��o aos EUA sobre isso \nele ent�o tem que decidir se vai a procura dos soldados perdidos ou n�o...";
			delay(texto);
			texto = " -     A��O     - ";
			delay(texto);
			texto = "1 - Procurar soldados? ";
			delay(texto);
			texto = "2 - N�o procurar soldados? ";
			delay(texto);

			int n1 = sc.nextInt();

			switch (n1) {
			case 1:
				System.out.println(
						" O/a agente fica em uma intensa procura sobre os soldados restantes at� que um grupo de mulheres que foram salvas pelo grupo de soldados\n"
								+ "fala que eles foram capturados pelo grupo terrorista do Talib� e que viu eles sendo levados dentro de um carro para fora do aeroporto, com isso em mente e sem poder deixar o local\n"
								+ "o/a agente notifica seu general e espera uma resposta atrav�s de uma liga��o do que continuar fazendo, ficar no aeroporto e conseguir evacuar os soldados e alguns civis ou deixar o aeroporto e ir atr�s dos soldados capturado");
				break;
			case 2:
				System.out.println(
						" Com a recusa do agente em procurar os soldados perdidos a multid�o que est� no aeroporto percebe que sobra algumas vagas ainda no avi�o\n"
								+ "e com isso gera uma grande briga entre os civis para ver quem vai entrar no avi�o e acaba que os civis tentam tomar controle do avi�o contra os soldados e isso gera uma briga intensa\n"
								+ "entre soldados e civis, gerando at� mesmo uma morte por conta da tentativa de tomada de avi�o, fazendo assim com que o/a agente tenha que verificar se nenhum rep�rter flagrou a morte do civil\n"
								+ "e resolver o problema do homic�dio e com isso notifica seu general atrav�s de um liga��o e espera a resposta para saber o que fazer...");
				break;
			}
			texto = " - Ap�s a a��o do jogador - ";
			delay(texto);
			texto = "Sendo a a��o do jogador a (sim) ou a (n�o) ele espera da mesma forma o telefone de seu general, mas n�o esperava que quem vai ligar para ele � uma pessoa misteriosa, mas que sabe muito sobre ele.";
			delay(texto);
			texto = " - Fim do desafio 1 - ";
			delay(texto);
		}
		// FINAL DESAFIO 01
		
		//INICIO DO DESAFIO 02
		texto = " -     DESAFIO 02     - ";

		delay(texto);
		texto = "O agente atende � liga��o que estava aguardando, surpreso, ele descobre que a pessoa que havia lhe ligado era um antigo pupilo o qual ele havia treinado uma d�cada antes em seu tempo no Afeganist�o.\n"
				+ "Voltando no passado, esse rapaz chamado Hamid, integrava uma fam�lia que desprezava os EUA, mas ele n�o via problema na presen�a dos americanos no Afeganist�o, e,\n"
				+ "como o EUA oferecia alimenta��o e uma condi��o de vida melhor para quem era recrutado, ele optou por se tornar um recruta.\n"
				+ "Conforme o passar do tempo, quase ao fim de seu treinamento, Hamid presenciou uma situa��o que mudou o seu destino.\n"
				+ "\n"
				+ "Em uma batida dos Estados Unidos em um vilarejo, eles suspeitaram que uma pessoa que tinha liga��o com o grupo terrorista local a Isis-K, por�m o rapaz conhecia aquela pessoa e a considerava algu�m inocente.";
		delay(texto);
		texto = " -     A��O     - ";
		delay(texto);
		texto = "1 - Ajudar o senhor? ";
		delay(texto);
		texto = "2 - N�o ajudar o senhor? ";
		delay(texto);

		int n1 = sc.nextInt();

		switch (n1) {
		case 1:
			System.out.println(
					" Hamid toma atitude vendo aquela situa��o e tenta ajudar o senhor a qual estava sendo agredido, por�m mesmo implorando para os soldados parassem com aquilo, eles continuaram at� matar o homem.\n"
							+ "Ap�s todo o ocorrido os soldados americanos ocultaram a morte do senhor e mesmo com a popula��o de testemunha do ocorrido, seus atos foram ignorados e ningu�m acabou punido.\n"
							+ "Ao testemunhar tudo aquilo, sua concep��o a respeito dos Estados Unidos mudou, o garoto na qual n�o via problema algum na presen�a de americanos no Afeganist�o, passou a odi�-los assim como seus familiares.");
			break;
		case 2:
			System.out.println(
					" Hamid permanece im�vel, quase em estado de choque testemunhando tudo aquilo sem saber o que fazer.\n"
							+ "Vendo toda essa situa��o, imaginando como uma pessoa seria capaz de fazer tal ato a algu�m inocente,\n"
							+ "o rapaz pensa a respeito das suas decis�es e passa a considerar os EUA invasores de seu pa�s assim como seus familiares.");
			break;
		}
		texto = " - Ap�s a a��o do jogador - ";
		delay(texto);
		texto = "Voltando para o presente, o agente atende a liga��o e escuta uma voz calma e conhecida...\n"
				+ "Hamid diz � �Lembra de mim �professor�?� sarcasticamente\n"
				+ "Ent�o o agente respondeu � �Quem � voc�?�\n"
				+ "Hamid novamente diz � �Nossa, fico desapontado que voc� n�o lembra de mim, encontrei com seus amigos americanos hoje de manh�, n�s sa�mos para dar um rolezinho por a� diz novamente em um tom sarc�stico.\n"
				+ "O agente responde preocupado - �ONDE EST� MINHA EQUIPE ??!!�\n"
				+ "Hamid revela � �Tenho duas localiza��es para te passar, ainda tenho um pouco de esperan�a de que voc� seja uma pessoa boa ent�o quero ver que atitude o senhor ir� tomar professor�\n"
				+ "�Tem um armaz�m localizado ao sul do aeroporto com uma fachada vermelha e branca, v� para l� se quiser encontrar os seus amigos, agora, caso voc� ainda seja a pessoa boa que eu costumava a conhecer,\n"
				+ "um grupo de professoras est�o presas em um pr�dio e chamas ao oeste de sua posi��o, apenas siga a fuma�a. Agora, elas s�o pessoas inocentes, diferente dos seus amiguinhos americanos, que assassinaram um homem a sangue frio tempos atr�s.�";
		delay(texto);
		texto = " - Fim do desafio 2 - ";
		delay(texto);

		// FINAL DO DESAFIO 02
                
                // IN�CIO DO DESAFIO 03
                
                texto= "Ap�s a liga��o, o agente ficou sem saber o que fazer,/n"
                        + "pensando em qual decis�o tomar";
                delay(texto);
                
                texto = "salvar um grupo de professorar ou equipe de soldados americanos";
                delay(texto);
                
                System.out.println(
				"Escolha uma das op��es abaixo:\n\n" 
						+ "1) Salvar as professoras\n"
						+ "2) Salvar equipe de soldados");
                
						
                
                
             do {

			int escolhaMenu = sc.nextInt();

			if (escolhaMenu== 1){
				 			 
				texto = " O agente parte rapidamente para o local do inc�ndio, chegando pr�ximo das redondezas \n" 
                                        +" se v� uma gigantesca fuma�a saindo de um lugar que possivelmente � onde as professoras se localizam\n" 
                                        +" Ao entrar no pr�dio em chamas, o agente corre rapidamente subindo as escadas e perguntando se havia algu�m a\n"
                                        +"ent�o as professoras come�aram a gritar:  �Socorro!! Algu�m nos ajude!!\n"
                                        +"O agente chega ao c�modo onde as professoras estavam e se depara com a seguinte situa��o.\n"
                                        +" Tr�s professoras est�o amarradas em uma sala com cordas de cores \n" 
                                        + "diferentes, Azul, Vermelho e Branco. Isso chama a aten��o do agente,\n" 
                                        +"mas ele continua avan�ando para desamarr�-las, ap�s libert�-las\n" 
                                        +"uma das professoras entrega um bilhete a mando de Hamid para o \n" 
                                        +"agente. Ela diz:\"�Ele pediu para lhe entregar\n" 
                                        +"Ent�o as tr�s professoras correm para fora do pr�dio em chama junto com o agentes";
                                delay(texto);
                        } else if(escolhaMenu==2){
			
				texto = " O agente parte rapidamente para o local informado por Hamid, chegando pr�ximo, ele avista o letreiro vermelho\n"
                                        +" e branco como havia dito"
                                        +"Ao entrar no armaz�m, o agente identifica rapidamente uma bomba amarrada a estrutura do local, e os americanos" 
                                        +"desacordados em seu interior. Ele tenta cham�-los, mas apenas um parece estar seu interior. Ele tenta cham�-los,"
                                        + "mas apenas um parece estar ligeiramente acordado. Ele ent�o, um por um, retira os americanos \n" 
                                        + "do lugar rapidamente antes do timer da bomba zerar.\n"
                                        + "O armaz�m explode e o agente fica assustado com aquela situa��o, ele liga para ajuda. Enquanto aguardava pela emerg�ncia um dos\n" 
                                        + "soldados americanos entrega para o agente um papel timbrado e diz:\n"
                                        + "�O terrorista, ele pediu para que eu entregasse a voc� caso viesse \n" 
                                        + "aqui, ele tamb�m disse pra eu te dizer que ele est� muito desapontado com a sua decis�o� \n";
                                delay(texto);
                        }else{
				System.out.println("Op��o inv�lido.");
				
			}

		} while (sair && jogar);
		   
             texto= " O agente abre o envelope que tem timbrado a bandeira dos estados unidos bem grande e em cores, ele l� a mensagem que diz: \n"
                    + " 'Me encontre no ninho de ratos do seu pa�s' e ao lado rabiscado um s�mbolo de um pr�dio grande. "
                    + "O agente ent�o imagina que o Hamid est� falando sobre a embaixada, e parte �s pressas para l�.";   

                delay(texto);
                
                
                // FIM DO DESAFIO 03
		
		
		//INICIO DO DESAFIO 04 
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
		
		//FIM DO DESAFIO 04
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
        