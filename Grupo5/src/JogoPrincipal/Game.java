package JogoPrincipal;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
	static String texto;
	static String nomeJogador;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroMenu;
		boolean sair = true;
		boolean jogar = true;
		String texto;

		System.out.println("O AGENTE A NO AFEGANIST�O");



		System.out.println(" Escolha uma das op��es abaixo:\n\n" + "1) Instru��es\n" 
		+ "2) Jogar\n" + "3) Cr�ditos\n" + "4) Sair");

		do {

			numeroMenu = sc.nextInt();

			switch (numeroMenu) {

			case 1:
				texto = ("Aguardando instru��es...");
				delay(texto);
				System.out.println(
						" - Utilize os numeros identificados ao lado de cada senten�a " + "para definir sua escolha.\n"
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
				System.out.println("Equipe de Desenvolvimento:\n" + " - Victor Henrique Moreira\n"
						+ " - Viviane Cipollari\n" + " - Ricardo Finkelstein\n" + " - Matheus\n");
				break;

			case 4:
				texto = ("Encerrando o menu...");
				delay(texto);
				sair();
				break;

			default:
				System.out.println("Valor inv�lido.");
				break;
			}

		} while (sair && jogar);

		if (sair == false) {
			System.out.println();
			System.out.println("Obrigado, at� a proxima.");
		} else {
			// INICIO DO DESAFIO 01
			texto = "CAP�TULO 1: O IN�CIO\n";
			delay(texto);
			
			System.out.println("Ol�,  seja bem-vindo ao jogo!");
			System.out.println("Seu papel � muito importante, vc ser� o nosso agente");
			System.out.println("Qual seu nome?");
			nomeJogador = sc.next();

			texto = "Ap�s desastres no Afeganist�o e o Talib� tomar o poder do pa�s,\n"
	                +"foi designado um agente da CIA para ir ao Afeganist�o";
	        delay(texto);
	        texto= "e ajudar na evacua��o dos soldados americanos no aeroporto de Cabul no Afeganist�o.\n" 
	                +"Chegando no aeroporto e ap�s conseguir realizar a evacua��o dos soldados";
	        delay(texto);       
	        texto= "O agente percebeu que estava faltando um grupo de soldados\n"
	                +"e sabendo que teria que dar uma explica��o aos EUA sobre isso\n"
	                +"ele ent�o tem que decidir se vai a procura dos soldados perdidos ou n�o...\n";
	        delay (texto);
	        System.out.println(nomeJogador+ ", escolha qual atitude o agente deve tomar: \n");
	        texto = "[1] - Procurar soldados? \n";
	        delay (texto);
	        texto = "[2] - N�o procurar soldados?\n";
	        delay (texto);

			int n1 = sc.nextInt();

			texto= "Para prosseguir voc� vai precisar de uma arma para sua seguran�a,\n"
		               +"como voc� est� em um ambiente hostil � melhor se prefinir usando uma arma de pequeno porte\n"
		               +"para assim os civis n�o perceberem a arma e voc� garantir sua seguran�a.";
		        delay (texto);
		        texto= "Com base na informa��o sobre o tipo de arma que voc� precisa responda abaixo\n"
		               +"com o nome do tipo da arma para assim passar nesta fase.\n";
		        delay(texto);
		        texto="Dica: Arma de disparo de pequeno porte.\n"
		               +"Obeserva��o: Use letras min�sculas para completar o nome da arma.\n";
		        delay(texto);
		        String palavraChave = "pistola";
		        String letrasUsadas = "";
		        @SuppressWarnings("unused")
				String palavraDescoberta ="";
		        String letraAdivinhada = "";
		        
		        outerloop:
		            for(int i=0; i < palavraChave.length(); i++){
		                palavraDescoberta += "_";
		                
		                for(int tentativas =0;tentativas<15;tentativas++){
		                    if(tentativas == 10){
		                        System.out.println(" _______ _______ _______ _______   _______ ___ ___ _______ ______ \n" +
		                                           "|     __|   _   |   |   |    ___| |       |   |   |    ___|   __ \\\n" +
		                                           "|    |  |       |       |    ___| |   -   |   |   |    ___|      <\n" +
		                                           "|_______|___|___|__|_|__|_______| |_______|\\_____/|_______|___|__|");
		                        System.exit(0);
		                    }
		                    System.out.printf("Forca rodada %d\nQual letra voc� escolhe?%n", tentativas);
		                    
		                    @SuppressWarnings("resource")
							char TentativaDeLetra = new java.util.Scanner(System.in).next().charAt(0);
		                    if(letrasUsadas.indexOf(TentativaDeLetra)>=0){ 
		                        System.out.printf("Letra j� usada '%c'.%n", TentativaDeLetra);
		                    }else{
		                        letrasUsadas += TentativaDeLetra;
		                        if(palavraChave.indexOf(TentativaDeLetra)>=0){ 
		                            letraAdivinhada = "";
		                            for(int subst= 0; subst<palavraChave.length(); subst++){ 
		                                letraAdivinhada += letrasUsadas.indexOf(palavraChave.charAt(subst))>=0 ? palavraChave.charAt(subst): "_"; 
		                            }
		                            if(letraAdivinhada.contains("_")){
		                                System.out.printf("Est� indo bem! A letra'%s' existe na palavra, mas ainda h� letras escondidas.%n", TentativaDeLetra);
		                            }else{
		                                System.out.printf("Parab�ns! A palavra adivinhada era %s", letraAdivinhada);
		                                System.out.println("\nVoc� conseguiu completar o desafio!\n");
		                                break outerloop;
		                            }
		                        }else{
		                            System.out.printf("Essa letra '%c' n�o existe na palavra.\n", TentativaDeLetra);
		                        }
		                    }
		                }
		            }
		        switch (n1){
		        case 1:
		            
		            System.out.println("O agente ent�o fica em uma intensa procura sobre os soldados restantes\n"
		                    +"at� que um grupo de mulheres que foram salvas pelo grupo de soldados\n" 
		                    +"fala que eles foram capturados pelo grupo terrorista do Talib�\n"
		                    +"e que viu eles sendo levados dentro de um carro para fora do aeroporto,\n"
		                    +"com isso em mente e sem poder deixar o local.\n"
		                    +"Ele notifica seu general e espera uma resposta atrav�s de uma liga��o\n"
		                    +"do que continuar fazendo, ficar no aeroporto e conseguir evacuar os soldados\n"
		                    +"e alguns civis ou deixar o aeroporto e ir atr�s dos soldados capturado.\n");                   
		             break;
		        case 2:
		            
		            System.out.println("Com com sua recusa em procurar os soldados perdidos, a multid�o \n"
		                    +"que est� no aeroporto percebe que sobra algumas vagas ainda no avi�o e com isso gera \n" 
		                    +"uma grande briga entre os civis para ver quem vai entrar no avi�o e acaba que os civis \n"
		                    +"tentam tomar controle do avi�o contra os soldados e isso gera uma briga intensa entre soldados e civis,\n" 
		                    +"gerando at� mesmo uma morte por conta da tentativa de tomada de avi�o, \n"
		                    +"fazendo assim com que o agente tenha que verificar se nenhum rep�rter flagrou a morte do civil \n" 
		                    +"e resolver o problema do homic�dio e com isso notifica seu general atrav�s de um liga��o\n"
		                    +"e espera a resposta para saber o que fazer...\n");
		             break;   
			}
		        texto = " - Ap�s a a��o do jogador - \n";
		        delay (texto);
		        texto = "Sendo a a��o do jogador a (sim) ou a (n�o) ele espera da mesma forma o telefone\n"
		                +"de seu general, mas n�o esperava que quem vai ligar para ele � uma pessoa misteriosa,\n"
		                +"mas que sabe muito sobre ele.\n";
		        delay (texto);
		        texto = " -     Fim do desafio 1     -\n ";
		        delay (texto);
		}
		
		// FINAL DESAFIO 01

		// INICIO DO DESAFIO 02
		System.out.println("CAP�TULO 2: CONVERSA MORTAL");
		
		texto = "O agente atende � liga��o que estava aguardando, surpreso, ele descobre que a pessoa que havia lhe ligado era\n";
		delay(texto);
		texto = " um antigo pupilo o qual ele havia treinado uma d�cada antes em seu tempo no oriente m�dio. Voltando no passado, esse rapaz chamado Hamid, \n";
		delay(texto);
		texto = "integrava uma fam�lia que desprezava os EUA, mas ele n�o via problema na presen�a dos americanos na regi�o, e,\n";
		delay (texto);
		texto =  "como o EUA oferecia alimenta��o e uma condi��o de vida melhor para quem era recrutado, ele optou por se tornar um agente.\n";
		delay(texto);
		texto = "Conforme o passar do tempo, quase ao fim de seu treinamento, Hamid presenciou uma situa��o que mudou o seu destino.";
		delay(texto);
		texto =  "Em um ataque americano contra um vilarejo,"
				+ " eles suspeitaram que um anci�o teria liga��o com o grupo terrorista local,"
				+ " a Isis-K. Por�m o jovem Hamid conhecia aquela pessoa e a considerava algu�m inocente.";
		delay(texto);
		System.out.println(" Escolha uma das alternativas: ");
		delay(texto);
		texto = "1 - Ajudar o senhor? ";
		delay(texto);
		texto = "2 - N�o ajudar o senhor? ";
		delay(texto);

		int n1 = sc.nextInt();

		switch (n1) {
		case 1:
			texto = " Hamid toma atitude vendo aquela situa��o e tenta ajudar o senhor , que estava sendo brutalmente agredido. Por�m mesmo implorando para os soldados parassem com aquilo, eles continuaram at� matar o homem.\n";
			delay(texto);
			texto = "Ap�s todo o ocorrido os soldados americanos ocultaram a morte do senhor e mesmo com a popula��o tendo presenciado o ocorrido, seus atos foram ignorados e ningu�m acabou punido.\n";
			delay(texto);
			texto =  "Ao testemunhar tudo aquilo, sua concep��o a respeito dos Estados Unidos mudou. Se antes o jovem garoto n�o via problemas na ocupa��o, isso mudou ao testemunhar um ataque t�o brutal.";
			delay(texto);
			break;
		case 2:
			texto = " Hamid permanece im�vel, quase em estado de choque testemunhando tudo aquilo sem saber o que fazer.\n";
			delay(texto);
			texto =  "Vendo toda essa situa��o, imaginando como uma pessoa seria capaz de fazer tal ato a algu�m inocente,\n";
			delay(texto);
			texto =  "o rapaz pensa a respeito das suas decis�es e passa a considerar os EUA invasores de seu pa�s assim como seus familiares.";
			delay(texto);
			break;
		}
		texto = "Voltando para o presente, o agente atende a liga��o e escuta uma voz calma e conhecida...\n";
		delay(texto); 
		texto = "HAMID (sarcasticamente) � Lembra de mim �professor�? ";
		delay(texto);
		texto = "AGENTE - Quem � voc�?";
		delay(texto);
		texto = "HAMID (sarcasticamente) � Nossa, fico desapontado que voc� n�o lembra de mim, encontrei com seus amigos americanos hoje de manh�, n�s sa�mos para dar um rolezinho por a�. ";
		delay(texto);
		texto = "AGENTE (tom preocupado) - �ONDE EST� MINHA EQUIPE ??!!�\n";
		delay(texto);
		texto = "HAMID � Tenho duas localiza��es para te passar, ainda tenho um pouco de esperan�a de que voc� seja uma pessoa boa ent�o quero ver que atitude o senhor ir� tomar professor.";
		delay(texto);
		texto =  "Tem um armaz�m localizado ao sul do aeroporto com uma fachada vermelha e branca, v� para l� se quiser encontrar os seus amigos, agora, caso voc� ainda seja a pessoa boa que eu costumava a conhecer,";
		delay(texto);
		texto =  "um grupo de professoras est�o presas em um pr�dio e chamas ao oeste de sua posi��o, apenas siga a fuma�a. Agora, elas s�o pessoas inocentes, diferente dos seus amiguinhos americanos, que assassinaram um homem a sangue frio tempos atr�s.";
		delay(texto);

		// FINAL DO DESAFIO 02

		// IN�CIO DO DESAFIO 03
                System.out.println("CAP�TULO 3: O RESGATE DOS REF�NS\n");
		System.out.println(" Parab�ns!!!! " + nomeJogador + " Voc� chegou ao  Cap�tulo3!!!!!\n");
		
		texto = "Agora " + nomeJogador + " vc precisa salvar os ref�ns.";
		delay(texto);

		System.out.println(
				"Nesta parte do jogo ter�o muitos desafios com n�meros, " + nomeJogador + ", vc est� pronto(a)????");

		int escolha;

		System.out.println("\n[1] - Sim \n[2] - N�o");
		escolha = sc.nextInt();
		if (escolha == 1) {
			System.out.println("Vamos ao desafio!!!");
		} else {
			sair();
		}

		texto = "O agente parte rapidamente para o local onde fica o armaz�m, chegando pr�ximo das redondezas \n"
				+ "se v� uma gigantesca fuma�a saindo de um lugar que possivelmente � onde as professoras se encontram\n";
		delay(texto);

		texto = "Ao entrar no pr�dio em chamas, o agente corre rapidamente subindo as escadas e perguntando se havia algu�m a\n"
				+ "ent�o as professoras come�aram a gritar:  �Socorro!! Algu�m nos ajude!!\n";
		delay(texto);

		texto = "O agente chega no fundo do armaz�m onde as professoras estavam e se depara com a seguinte \n"
				+ "situa��o.As professoras estavam amarradas e assustadas gritando socorro, mas a porta\n";
		delay(texto);

		texto = "que dava acesso a elas estava presa com um bomba e para desativ�-la Hamid \n"
				+ "deixou uma dica - 'lembra quantas vezes que quase perdi a vida no treinamento'??\n";
		delay(texto);

		System.out.println("Agora " + nomeJogador + ", para lembrar quantas vezes Hamid "
				+ "quase�perdeu a vida nos treinamentos. \n\n\n");

		texto = "Resolva a equa��o de segundo grau : 5x�-20=0 para descobrir quantas vezes Hamid quase morreu";
		delay(texto);

		System.out.println(nomeJogador + " Vc s� tem uma chance, escolha alternativa abaixo: \n"
				+ "1) 1 vez  .\n" + "2) 2 vezes.\n" // ALTERNATIVA CORRETA
				+ "3) 3 vezes.\n" + "4) 4 vezes");

		int alternativa = sc.nextInt();

		if (alternativa == 2) {
			System.out.println("\nVoc� acertou!!!!Conseguiu salvar as professoras");
		} else {
			System.out.println("Vc errou!!!! GameOver");
			fimDeJogo();
		}

		texto = "Tr�s professoras est�o amarradas em  com cordas de cores \n"
				+ "diferentes, Azul, Vermelho e Branco. Isso chama a aten��o do agente cores da bandeira americana,\n";
		delay(texto);

		texto = "mas ele continua avan�ando para desamarr�-las, ap�s libert�-las\n"
				+ "uma das professoras entrega um bilhete a mando de Hamid para o \n";
		delay(texto);

		texto = "agente. Ela diz:\"�Ele pediu para lhe entregar\n"
				+ "Ent�o as tr�s professoras correm para fora do pr�dio em chama junto com o agente";
		delay(texto);

		texto = "No bilhete entregue pelas professoras Hamid mostram a localiza��o da equipe de soldados\n"
				+ "era uma armaz�m pr�ximo do armaz�m onde estavam as professoras, mas este n�o estva em chamas";
		delay(texto);
		texto = "Ao entrar no armaz�m, o agente identifica rapidamente uma bomba embaixo da plataforma \n"
				+ "onde estava sua equipe";
		delay(texto);
		texto = "A bomba ser� acionada  pela mudan�a de peso...ou seja, para tirar um soldado a bomba explode  \n"
				+ "o time da bomba esta acionada e s� faltam 5 minutos para a bomba explodir.\n\n\n";
		delay(texto);

		System.out.println("Agora " + nomeJogador + " ajude a desarmar a bomba");

		Random gerador = new Random();
		boolean acertou = false;
		int numeroAleatorio = gerador.nextInt(10);
		int palpite = 1;
		int tentativas = 3;

		while (tentativas >= 0 && acertou == false) {
			System.out.println("Chute um numero de 1 a 10");
			palpite = sc.nextInt();

			if (numeroAleatorio == palpite) {
				System.out.println("Parab�ns!!!!!Vc salvou os soldados americanos!");
				acertou = true;
			} else if (palpite < numeroAleatorio) {
				System.out.println("Seu palpite est� baixo, ent�o chute um n�mero maior, vc tem "
						+ tentativas-- + " chances restantes");

			} else {
				System.out.println("Seu palpite est� alto, ent�o chute um n�mero menor, vc tem "
						+ tentativas-- + " chances restantes");

			}
			if (tentativas == -1) {
				System.out.println("Acabou suas chances. Game over!!!!");
			}

		}

		texto = "Ap�s salvar sua equipe, o armaz�m explode e o Agente fica assustado, pois n�o sabe do que "
				+ "Hamid � capaz";
		delay(texto);

		texto = "Um dos soldados entrega uma chave para o Agente e ele percebe que esta chave � "
				+ "de um arm�rio no aeroporto. Soldado avisa que se refere a pr�xima dica, "
				+ "onde ser� o novo atentado";
		delay(texto);

		texto = "Chegando ao Aeroporto abre o arm�rio e dentro dele estava uma caixa, mas para abr�-la "
				+ "ir� precisar de uma senha de quatro d�gitos.  \n \n ";
		delay(texto);

		texto = "Resolva a equa��o de primeiro grau : 2x- 6700 = x -4x + 4525 para encontrar a senha.";
		delay(texto);

		System.out.println(nomeJogador + " Vc s� tem uma chance, escolha uma letra para as alternativas abaixo: \n"
				+ "a) 2241.\n" + "b) 2240.\n" + "c) 2245.\n"// ALTERNATIVA CORRETA
				+ "d) 2250");

		char opcoes = sc.next().toLowerCase().charAt(0);

		if (opcoes == 'c') {
			System.out.println("\nVoc� acertou!!!!Conseguiu pegar a dica para novo atentado;");
		} else {
			System.out.println("Vc errou!!!! GameOver");
			fimDeJogo();
		}

		texto = "Com a senha o Agente abre a caixa e pega um envelope e papel timbrado da embaixada americana "
				+ "o bilhete dizia 'Me encontre no ninho de ratos do seu pa�s'";
		delay(texto);

		texto = "O agente tamb�m lembra que as cordas que amarravam as professoras tinham as cores da bandeira americana "
				+ "e corre para Embaixada. \n\n";
		delay(texto);

		// FIM DO DESAFIO 03

		// INICIO DO DESAFIO 04
		 texto = "CAPITULO 4: ATAQUE A EMBAIXADA";
		delay(texto);
		texto = " O agente chega � embaixada ap�s salvar os ref�ns quando � abordado por um homem,\n"
				+ "ele se apresenta como diplomata e explica ao agente sobre a situa��o da embaixada.\n"
				+ "Ela est� cheia de dignit�rios de outros pa�ses que comp�em a embaixada\n"
				+ "buscando obter a documenta��o para sair do pa�s.\n";
		delay(texto);

		texto = " Ent�o o agente pergunta:\n";
		delay(texto);
		System.out.println(" (a) O senhor notou algum movimento estranho por aqui?");
		System.out.println(" (b) Qual a situa��o da embaixada?");

		boolean useless1 = true;
		do {
			String useless = sc.next();
			if (useless.equalsIgnoreCase("a") || useless.equalsIgnoreCase("b")) {
				texto = "O Diplomata: Tirando o fato de todos estarem e p�nico para fugir dessa guerra iminente?\n"
						+ "notei a falta de alguns embaixadores nesta manh� na reuni�o, mas ha pouco quando perguntei\n"
						+ "por eles no pr�dio, e me foi informado que eles n�o deixaram as intala��es.\n ";
				delay(texto);
				useless1 = false;
			} else
				System.out.println("Lamento, digite um caracter v�lido");
		} while (useless1 == true);

		texto = "Sem muitas informa��es, o agente segue investigando o local.\n"
				+ "Gra�as ao caos na embaixada, h� somente 3 caminhos acess�veis.\n";
		delay(texto);
		texto = nomeJogador + ", para onde o agente deve seguir primeiro?\n";
		delay(texto);
		System.out.println(" (a) Seguir para o sagu�o principal, aonde h� a maior concentra��o de pessoas");
		System.out.println(" (b) Ir at� a sala de reuni�es, aonde h� a menor conentra��o de pessoas");
		System.out.println(" (c) Seguir pelo corredor e ir checando lentamente cada comodo do local");
		boolean htgo = true;
		do {
			String heretogo = sc.next();
			if (heretogo.equalsIgnoreCase("a")) {
				texto = "O agente segue pelo sagu�o principal mas n�o nota nenhum movimento estranho,\n"
						+ "as pessoas est�o ou em liga��es ou organizando suas papeladas para deixarem o pais,\n"
						+ "o local est� uma bagun�a mas todos parecem bem calmos.\n";
				delay(texto);
				htgo = false;
			} else if (heretogo.equalsIgnoreCase("b")) {
				texto = "O agente vai at� a sala de reuni�es e nota duas pessoas conversando,\n"
						+ "um deles era o diplomata afeg�o, ele aparentava estar triste e suplicava\n"
						+ "ao diplomata americano para n�o abandonar o pa�s, mas sem aparentes resultados.\n"
						+ "O Talib� tomaria conta do pais novamente sem o exercito americano.\n";
				delay(texto);
				System.out.println(" Escolha outra alternativa:\n");
				System.out.println(" (a) Seguir para o sagu�o principal, aonde h� a maior concentra��o de pessoas");
				System.out.println(" (c) Seguir pelo corredor e ir checando lentamente cada comodo do local");

			} else if (heretogo.equalsIgnoreCase("c")) {
				texto = "O agente segue pelo corredor olhando sala por sala do complexo,\n"
						+ "os olhares assustados das pessoas deixam o agente intrigado\n ";
				delay(texto);
				htgo = false;
			} else
				System.out.println("Lamento, digite um caracter v�lido.");
		} while (htgo == true);

		texto = " At� que ele nota um homem com aparencia suspeita,\n"
				+ "acompanhado de um dos embaixadores que aparentava estar assustado.\n";
		delay(texto);
		texto = " Ao tentar se aproximar do homem ele amea�a atirar no embaixador assustando todos no local\n"
				+ "O agente ent�o trava uma luta contra o terrorista e o desarma\n";
		delay(texto);

		texto = "!!ATEN��O, VOCE EST� PRESTES A INICIAR UM COMBATE.!!\n";
		delay(texto);
		texto = nomeJogador + ", escolha par ou impar para continuar:\n ";
		delay(texto);
		texto = " (a) Par";
		delay(texto);
		texto = " (b) �mpar\n";
		delay(texto);
		texto = " O numero aleat�rio vai ser sorteado e\n" 
				+ "caso seja par ou impar dependendo de sua decis�o\n"
				+ "voce vencer� o turno do combate.";
		delay(texto);
		int ddamage = 0;
		int tdamage = 0;
		do {
			String escolha12 = sc.next();
			texto = "Sorteando o numero...";
			delay(texto);
			int decisor = (int) (Math.random() * 10 + 1);
			texto = "O numero sorteado �: " + decisor;
			delay(texto);
			if (decisor % 2 == 0) {// PAR
				texto = "O resultado � par!\n";
				delay(texto);
				if (escolha12.equalsIgnoreCase("a")) {
					texto = "Voce ganhou o turno";
					delay(texto);
					texto = "O agente acerta um golpe no terrorista\n";
					delay(texto);
					ddamage++;
				} else if (escolha12.equalsIgnoreCase("b")) {
					texto = "voce perdeu o turno";
					delay(texto);
					texto = "O agente sofre um golpe do terrorista\n";
					delay(texto);
					tdamage++;
				}

			} else if (decisor % 2 >= 1) {// IMPAR
				texto = "O resultado � impar: ";
				delay(texto);
				if (escolha12.equalsIgnoreCase("a")) {
					texto = "Voce perdeu o turno";
					delay(texto);
					texto = "O agente sofre um golpe do terrorista\n";
					delay(texto);
					tdamage++;
				} else if (escolha12.equalsIgnoreCase("b")) {
					texto = "voce ganhou o turno";
					delay(texto);
					texto = "O agente acerta um golpe do terrorista\n";
					delay(texto);
					ddamage++;
				} else
					System.out.println("Por favor digite um caracter v�lido");
			}
			if (tdamage < 3 && ddamage < 2) {
				texto = "Escolha novamente par ou impar para continuar:\n ";
				delay(texto);
				texto = " (a) Par";
				delay(texto);
				texto = " (b) �mpar\n";
				delay(texto);
			}
		} while (tdamage < 3 && ddamage < 2);
		if (ddamage >= 2) {
			System.out.println("Voce Ganhou o combate!\n");
			texto = " Neutralizando o Alvo e salvando as pessoas do local,\n"
					+ "O agente parte para examinar o local do acontecido e nota\n"
					+ "uma porta ligeiramente aberta, ele a abre e ve uma tilha\n "
					+ "de algum fluido no ch�o indo escada a baixo da embaixada.\n";
			delay(texto);
		} else if (tdamage >= 3) {
			System.out.println("Voce perdeu o combate! ");
			fimDeJogo();
		}
		
	
		// INICIO DESAFIO 5
		
		System.out.println("CAP�TULO 5: O FINAL");
		int dialogo51 = 0;

		do {
			texto = "Inicio da conversa do Agente com o vil�o";
			delay(texto);
			texto = "Escolha a op��o de 1 a 6";
			delay(texto);
			dialogo51 = sc.nextInt();

			switch (dialogo51) {
			case 1:

				texto = "Dialogo 1";
				delay(texto);

			case 2:
				texto = "Dialogo 2";
				delay(texto);
				break;

			case 3:
				texto = "Dialogo 3";
				delay(texto);
				break;

			case 4:
				texto = "Dialogo 4";
				delay(texto);
				break;

			case 5:
				texto = "Dialogo 5";
				delay(texto);
				break;

			}

		} while (dialogo51 == 0 || dialogo51 == 1 || dialogo51 == 2 || dialogo51 == 3 || dialogo51 == 4
				|| dialogo51 == 5);

		int golpeRuim = 0;
		texto = "Briga f�sica entre o Agente e o vil�o";
		delay(texto);

		for (int i = 5; i > 0; i--) {
			texto = "Selecione o golpe:\n 1: Soco na boca do est�mago\n 2: golpe na garganta\n 3: Cruzado no queixo\n 4: Chute na canela\n 5: Empurr�o\n 6: Soco no bra�o\n ";
			delay(texto);
			int golpe = sc.nextInt();

			if (golpe == 1 || golpe == 2) {
				texto = "Dano cr�tico. ";
				delay(texto);
				i--;
			} else if (golpe == 3 || golpe == 4) {
				texto = "Golpe bem-sucedido, sem muito efeito. ";
				delay(texto);
			} else {
				texto = "Golpe defendido. ";
				delay(texto);
				golpeRuim++;
			}

			if (golpeRuim >= 2) {
				texto = "HAMID: foi bom brincar com voc�, mas como voc� n�o me impediu � tempo � hora de dizer adeus.";
				delay(texto);
				texto = "BOMBA EXPLODE ";
				delay(texto);
				fimDeJogo();
			}
		}
		texto = "Hamid finalmente desaba, e o  Agente corre para desarmar a bomba. Mas antes disso, ele procura por pistas no local";
		delay(texto);
		for (int j = 0; j < 4; j++) {
			texto = "Onde o agente olha � seguir?\n 1: \n 2: \n 3: \n 4: \n 5: \n 6: \n 7: \n";
			delay(texto);
			int escolhaAgente = sc.nextInt();

			switch (escolhaAgente) {
			case 1:
				texto = "O Agente lembra do �dio que Hamid tem pelos EUA, ent�o sabe que escolheria fios com as cores da bandeira americana.";
				delay(texto);
				break;

			case 6:
				texto = "O agente lembra que fios roxos s�o perigosos para se cortar, ent�o seria melhor deixar quieto.";
				delay(texto);
				break;

			case 4:
				texto = "O agente lembra que na maioria das bombas o rel�gio, caso seja desarmado, explodir� a bomba.";
				delay(texto);
				break;

			case 3:
				texto = "O agente olha para o forro da bomba. ";
				delay(texto);
				break;

			case 5:
				texto = "O agente lembra de uma aula que teve sobre desarmar bombas, mas infelizmente naquele dia ele estava cansado e dormiu na aula.";
				delay(texto);
				break;
			case 2:
				texto = "O Agente tenta mover a bomba, mas nota que ela � muito pesada. ";
				delay(texto);
				break;
			case 7:
				texto = "O Agente v� um quadro. O autor era cubista, logo o quadro � in�til.";
				delay(texto);
				break;

			default:
				break;
			}
		}

		texto = "AGENTE PERCEBE QUE N�O TEM MAIS TEMPO, CORRE PRA DESARMAR A BOMBA";
		delay(texto);

		texto = "O QUE O AGENTE FAR� PARA DESARMAR A BOMBA?\n 1: Cortar as linhas azul, vermelha, branca e preta \n 2: cortar as linhas preta, azul, roxa e amarela \n 3: Desconectar o timer";
		delay(texto);

		int desarmeDaBomba = sc.nextInt();
		if (desarmeDaBomba == 1) {
			texto = "PARAB�NS, BOMBA DESARMADA COM SUCESSO. BOM TRABALHO "+ nomeJogador;
			delay(texto);
		} else if (desarmeDaBomba == 2) {
			texto = "SEM EFEITO NENHUM, O AGENTE PERCEBE QUE S� TEM TEMPO PARA MAIS UMA TENTATIVA. ESCOLHA OUTRA OP��O";
			delay(texto);
			desarmeDaBomba = sc.nextInt();
			if (desarmeDaBomba == 1) {
				texto = "PARAB�NS, AGENTE DESARMOU A BOMBA COM SUCESSO, GANHANDO O JOGO";
				delay(texto);
			} else {
				texto = "AGENTE FALHOU. BOMBA EXPLODE";
				delay(texto);
				fimDeJogo();
			}
		} else {
			texto = "AGENTE FALHOU. BOMBA EXPLODE";
			delay(texto);
			fimDeJogo();
		}

	}

	static void fimDeJogo() {
		System.out.println(" _______ _______ _______ _______   _______ ___ ___ _______ ______ \r\n"
				+ "|     __|   _   |   |   |    ___| |       |   |   |    ___|   __ \\\r\n"
				+ "|    |  |       |       |    ___| |   -   |   |   |    ___|      <\r\n"
				+ "|_______|___|___|__|_|__|_______| |_______|\\_____/|_______|___|__|\r\n"
				+ "                                                                  ");
		System.out.println("CR�DITOS: \n - Victor Henrique Moreira\\n\"\r\n"
				+ "						+ \" - Viviane Cipollari\\n\" + \" - Ricardo Magalh�es\\n\" + \" - Matheus\\n");
		sair();
	}

	static void sair() {
		System.exit(0);
	}

	static void delay(String TextoFuncao) {
		int tamanhoDelay = TextoFuncao.length();
		System.out.println(TextoFuncao);
		try {
			TimeUnit.SECONDS.sleep(tamanhoDelay / 55);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}
}

