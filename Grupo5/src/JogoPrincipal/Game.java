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

		System.out.println("O AGENTE A NO AFEGANISTÃO");



		System.out.println(" Escolha uma das opções abaixo:\n\n" + "1) Instruções\n" 
		+ "2) Jogar\n" + "3) Créditos\n" + "4) Sair");

		do {

			numeroMenu = sc.nextInt();

			switch (numeroMenu) {

			case 1:
				texto = ("Aguardando instruções...");
				delay(texto);
				System.out.println(
						" - Utilize os numeros identificados ao lado de cada sentença " + "para definir sua escolha.\n"
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
				System.out.println("Equipe de Desenvolvimento:\n" + " - Victor Henrique Moreira\n"
						+ " - Viviane Cipollari\n" + " - Ricardo Finkelstein\n" + " - Matheus\n");
				break;

			case 4:
				texto = ("Encerrando o menu...");
				delay(texto);
				sair();
				break;

			default:
				System.out.println("Valor inválido.");
				break;
			}

		} while (sair && jogar);

		if (sair == false) {
			System.out.println();
			System.out.println("Obrigado, até a proxima.");
		} else {
			// INICIO DO DESAFIO 01
			texto = "CAPÍTULO 1: O INÍCIO\n";
			delay(texto);
			
			System.out.println("Olá,  seja bem-vindo ao jogo!");
			System.out.println("Seu papel é muito importante, vc será o nosso agente");
			System.out.println("Qual seu nome?");
			nomeJogador = sc.next();

			texto = "Após desastres no Afeganistão e o Talibã tomar o poder do país,\n"
	                +"foi designado um agente da CIA para ir ao Afeganistão";
	        delay(texto);
	        texto= "e ajudar na evacuação dos soldados americanos no aeroporto de Cabul no Afeganistão.\n" 
	                +"Chegando no aeroporto e após conseguir realizar a evacuação dos soldados";
	        delay(texto);       
	        texto= "O agente percebeu que estava faltando um grupo de soldados\n"
	                +"e sabendo que teria que dar uma explicação aos EUA sobre isso\n"
	                +"ele então tem que decidir se vai a procura dos soldados perdidos ou não...\n";
	        delay (texto);
	        System.out.println(nomeJogador+ ", escolha qual atitude o agente deve tomar: \n");
	        texto = "[1] - Procurar soldados? \n";
	        delay (texto);
	        texto = "[2] - Não procurar soldados?\n";
	        delay (texto);

			int n1 = sc.nextInt();

			texto= "Para prosseguir você vai precisar de uma arma para sua segurança,\n"
		               +"como você está em um ambiente hostil é melhor se prefinir usando uma arma de pequeno porte\n"
		               +"para assim os civis não perceberem a arma e você garantir sua segurança.";
		        delay (texto);
		        texto= "Com base na informação sobre o tipo de arma que você precisa responda abaixo\n"
		               +"com o nome do tipo da arma para assim passar nesta fase.\n";
		        delay(texto);
		        texto="Dica: Arma de disparo de pequeno porte.\n"
		               +"Obeservação: Use letras minúsculas para completar o nome da arma.\n";
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
		                    System.out.printf("Forca rodada %d\nQual letra você escolhe?%n", tentativas);
		                    
		                    @SuppressWarnings("resource")
							char TentativaDeLetra = new java.util.Scanner(System.in).next().charAt(0);
		                    if(letrasUsadas.indexOf(TentativaDeLetra)>=0){ 
		                        System.out.printf("Letra já usada '%c'.%n", TentativaDeLetra);
		                    }else{
		                        letrasUsadas += TentativaDeLetra;
		                        if(palavraChave.indexOf(TentativaDeLetra)>=0){ 
		                            letraAdivinhada = "";
		                            for(int subst= 0; subst<palavraChave.length(); subst++){ 
		                                letraAdivinhada += letrasUsadas.indexOf(palavraChave.charAt(subst))>=0 ? palavraChave.charAt(subst): "_"; 
		                            }
		                            if(letraAdivinhada.contains("_")){
		                                System.out.printf("Está indo bem! A letra'%s' existe na palavra, mas ainda há letras escondidas.%n", TentativaDeLetra);
		                            }else{
		                                System.out.printf("Parabéns! A palavra adivinhada era %s", letraAdivinhada);
		                                System.out.println("\nVocê conseguiu completar o desafio!\n");
		                                break outerloop;
		                            }
		                        }else{
		                            System.out.printf("Essa letra '%c' não existe na palavra.\n", TentativaDeLetra);
		                        }
		                    }
		                }
		            }
		        switch (n1){
		        case 1:
		            
		            System.out.println("O agente então fica em uma intensa procura sobre os soldados restantes\n"
		                    +"até que um grupo de mulheres que foram salvas pelo grupo de soldados\n" 
		                    +"fala que eles foram capturados pelo grupo terrorista do Talibã\n"
		                    +"e que viu eles sendo levados dentro de um carro para fora do aeroporto,\n"
		                    +"com isso em mente e sem poder deixar o local.\n"
		                    +"Ele notifica seu general e espera uma resposta através de uma ligação\n"
		                    +"do que continuar fazendo, ficar no aeroporto e conseguir evacuar os soldados\n"
		                    +"e alguns civis ou deixar o aeroporto e ir atrás dos soldados capturado.\n");                   
		             break;
		        case 2:
		            
		            System.out.println("Com com sua recusa em procurar os soldados perdidos, a multidão \n"
		                    +"que está no aeroporto percebe que sobra algumas vagas ainda no avião e com isso gera \n" 
		                    +"uma grande briga entre os civis para ver quem vai entrar no avião e acaba que os civis \n"
		                    +"tentam tomar controle do avião contra os soldados e isso gera uma briga intensa entre soldados e civis,\n" 
		                    +"gerando até mesmo uma morte por conta da tentativa de tomada de avião, \n"
		                    +"fazendo assim com que o agente tenha que verificar se nenhum repórter flagrou a morte do civil \n" 
		                    +"e resolver o problema do homicídio e com isso notifica seu general através de um ligação\n"
		                    +"e espera a resposta para saber o que fazer...\n");
		             break;   
			}
		        texto = " - Após a ação do jogador - \n";
		        delay (texto);
		        texto = "Sendo a ação do jogador a (sim) ou a (não) ele espera da mesma forma o telefone\n"
		                +"de seu general, mas não esperava que quem vai ligar para ele é uma pessoa misteriosa,\n"
		                +"mas que sabe muito sobre ele.\n";
		        delay (texto);
		        texto = " -     Fim do desafio 1     -\n ";
		        delay (texto);
		}
		
		// FINAL DESAFIO 01

		// INICIO DO DESAFIO 02
		System.out.println("CAPÍTULO 2: CONVERSA MORTAL");
		
		texto = "O agente atende à ligação que estava aguardando, surpreso, ele descobre que a pessoa que havia lhe ligado era\n";
		delay(texto);
		texto = " um antigo pupilo o qual ele havia treinado uma década antes em seu tempo no oriente médio. Voltando no passado, esse rapaz chamado Hamid, \n";
		delay(texto);
		texto = "integrava uma família que desprezava os EUA, mas ele não via problema na presença dos americanos na região, e,\n";
		delay (texto);
		texto =  "como o EUA oferecia alimentação e uma condição de vida melhor para quem era recrutado, ele optou por se tornar um agente.\n";
		delay(texto);
		texto = "Conforme o passar do tempo, quase ao fim de seu treinamento, Hamid presenciou uma situação que mudou o seu destino.";
		delay(texto);
		texto =  "Em um ataque americano contra um vilarejo,"
				+ " eles suspeitaram que um ancião teria ligação com o grupo terrorista local,"
				+ " a Isis-K. Porém o jovem Hamid conhecia aquela pessoa e a considerava alguém inocente.";
		delay(texto);
		System.out.println(" Escolha uma das alternativas: ");
		delay(texto);
		texto = "1 - Ajudar o senhor? ";
		delay(texto);
		texto = "2 - Não ajudar o senhor? ";
		delay(texto);

		int n1 = sc.nextInt();

		switch (n1) {
		case 1:
			texto = " Hamid toma atitude vendo aquela situação e tenta ajudar o senhor , que estava sendo brutalmente agredido. Porém mesmo implorando para os soldados parassem com aquilo, eles continuaram até matar o homem.\n";
			delay(texto);
			texto = "Após todo o ocorrido os soldados americanos ocultaram a morte do senhor e mesmo com a população tendo presenciado o ocorrido, seus atos foram ignorados e ninguém acabou punido.\n";
			delay(texto);
			texto =  "Ao testemunhar tudo aquilo, sua concepção a respeito dos Estados Unidos mudou. Se antes o jovem garoto não via problemas na ocupação, isso mudou ao testemunhar um ataque tão brutal.";
			delay(texto);
			break;
		case 2:
			texto = " Hamid permanece imóvel, quase em estado de choque testemunhando tudo aquilo sem saber o que fazer.\n";
			delay(texto);
			texto =  "Vendo toda essa situação, imaginando como uma pessoa seria capaz de fazer tal ato a alguém inocente,\n";
			delay(texto);
			texto =  "o rapaz pensa a respeito das suas decisões e passa a considerar os EUA invasores de seu país assim como seus familiares.";
			delay(texto);
			break;
		}
		texto = "Voltando para o presente, o agente atende a ligação e escuta uma voz calma e conhecida...\n";
		delay(texto); 
		texto = "HAMID (sarcasticamente) – Lembra de mim “professor”? ";
		delay(texto);
		texto = "AGENTE - Quem é você?";
		delay(texto);
		texto = "HAMID (sarcasticamente) – Nossa, fico desapontado que você não lembra de mim, encontrei com seus amigos americanos hoje de manhã, nós saímos para dar um rolezinho por aí. ";
		delay(texto);
		texto = "AGENTE (tom preocupado) - “ONDE ESTÁ MINHA EQUIPE ??!!”\n";
		delay(texto);
		texto = "HAMID – Tenho duas localizações para te passar, ainda tenho um pouco de esperança de que você seja uma pessoa boa então quero ver que atitude o senhor irá tomar professor.";
		delay(texto);
		texto =  "Tem um armazém localizado ao sul do aeroporto com uma fachada vermelha e branca, vá para lá se quiser encontrar os seus amigos, agora, caso você ainda seja a pessoa boa que eu costumava a conhecer,";
		delay(texto);
		texto =  "um grupo de professoras estão presas em um prédio e chamas ao oeste de sua posição, apenas siga a fumaça. Agora, elas são pessoas inocentes, diferente dos seus amiguinhos americanos, que assassinaram um homem a sangue frio tempos atrás.";
		delay(texto);

		// FINAL DO DESAFIO 02

		// INÍCIO DO DESAFIO 03
                System.out.println("CAPÍTULO 3: O RESGATE DOS REFÉNS\n");
		System.out.println(" Parabéns!!!! " + nomeJogador + " Você chegou ao  Capítulo3!!!!!\n");
		
		texto = "Agora " + nomeJogador + " vc precisa salvar os reféns.";
		delay(texto);

		System.out.println(
				"Nesta parte do jogo terão muitos desafios com números, " + nomeJogador + ", vc está pronto(a)????");

		int escolha;

		System.out.println("\n[1] - Sim \n[2] - Não");
		escolha = sc.nextInt();
		if (escolha == 1) {
			System.out.println("Vamos ao desafio!!!");
		} else {
			sair();
		}

		texto = "O agente parte rapidamente para o local onde fica o armazém, chegando próximo das redondezas \n"
				+ "se vê uma gigantesca fumaça saindo de um lugar que possivelmente é onde as professoras se encontram\n";
		delay(texto);

		texto = "Ao entrar no prédio em chamas, o agente corre rapidamente subindo as escadas e perguntando se havia alguém a\n"
				+ "então as professoras começaram a gritar:  “Socorro!! Alguém nos ajude!!\n";
		delay(texto);

		texto = "O agente chega no fundo do armazém onde as professoras estavam e se depara com a seguinte \n"
				+ "situação.As professoras estavam amarradas e assustadas gritando socorro, mas a porta\n";
		delay(texto);

		texto = "que dava acesso a elas estava presa com um bomba e para desativá-la Hamid \n"
				+ "deixou uma dica - 'lembra quantas vezes que quase perdi a vida no treinamento'??\n";
		delay(texto);

		System.out.println("Agora " + nomeJogador + ", para lembrar quantas vezes Hamid "
				+ "quase´perdeu a vida nos treinamentos. \n\n\n");

		texto = "Resolva a equação de segundo grau : 5x²-20=0 para descobrir quantas vezes Hamid quase morreu";
		delay(texto);

		System.out.println(nomeJogador + " Vc só tem uma chance, escolha alternativa abaixo: \n"
				+ "1) 1 vez  .\n" + "2) 2 vezes.\n" // ALTERNATIVA CORRETA
				+ "3) 3 vezes.\n" + "4) 4 vezes");

		int alternativa = sc.nextInt();

		if (alternativa == 2) {
			System.out.println("\nVocê acertou!!!!Conseguiu salvar as professoras");
		} else {
			System.out.println("Vc errou!!!! GameOver");
			fimDeJogo();
		}

		texto = "Três professoras estão amarradas em  com cordas de cores \n"
				+ "diferentes, Azul, Vermelho e Branco. Isso chama a atenção do agente cores da bandeira americana,\n";
		delay(texto);

		texto = "mas ele continua avançando para desamarrá-las, após libertá-las\n"
				+ "uma das professoras entrega um bilhete a mando de Hamid para o \n";
		delay(texto);

		texto = "agente. Ela diz:\"“Ele pediu para lhe entregar\n"
				+ "Então as três professoras correm para fora do prédio em chama junto com o agente";
		delay(texto);

		texto = "No bilhete entregue pelas professoras Hamid mostram a localização da equipe de soldados\n"
				+ "era uma armazém próximo do armazém onde estavam as professoras, mas este não estva em chamas";
		delay(texto);
		texto = "Ao entrar no armazém, o agente identifica rapidamente uma bomba embaixo da plataforma \n"
				+ "onde estava sua equipe";
		delay(texto);
		texto = "A bomba será acionada  pela mudança de peso...ou seja, para tirar um soldado a bomba explode  \n"
				+ "o time da bomba esta acionada e só faltam 5 minutos para a bomba explodir.\n\n\n";
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
				System.out.println("Parabéns!!!!!Vc salvou os soldados americanos!");
				acertou = true;
			} else if (palpite < numeroAleatorio) {
				System.out.println("Seu palpite está baixo, então chute um número maior, vc tem "
						+ tentativas-- + " chances restantes");

			} else {
				System.out.println("Seu palpite está alto, então chute um número menor, vc tem "
						+ tentativas-- + " chances restantes");

			}
			if (tentativas == -1) {
				System.out.println("Acabou suas chances. Game over!!!!");
			}

		}

		texto = "Após salvar sua equipe, o armazém explode e o Agente fica assustado, pois não sabe do que "
				+ "Hamid é capaz";
		delay(texto);

		texto = "Um dos soldados entrega uma chave para o Agente e ele percebe que esta chave é "
				+ "de um armário no aeroporto. Soldado avisa que se refere a próxima dica, "
				+ "onde será o novo atentado";
		delay(texto);

		texto = "Chegando ao Aeroporto abre o armário e dentro dele estava uma caixa, mas para abrí-la "
				+ "irá precisar de uma senha de quatro dígitos.  \n \n ";
		delay(texto);

		texto = "Resolva a equação de primeiro grau : 2x- 6700 = x -4x + 4525 para encontrar a senha.";
		delay(texto);

		System.out.println(nomeJogador + " Vc só tem uma chance, escolha uma letra para as alternativas abaixo: \n"
				+ "a) 2241.\n" + "b) 2240.\n" + "c) 2245.\n"// ALTERNATIVA CORRETA
				+ "d) 2250");

		char opcoes = sc.next().toLowerCase().charAt(0);

		if (opcoes == 'c') {
			System.out.println("\nVocê acertou!!!!Conseguiu pegar a dica para novo atentado;");
		} else {
			System.out.println("Vc errou!!!! GameOver");
			fimDeJogo();
		}

		texto = "Com a senha o Agente abre a caixa e pega um envelope e papel timbrado da embaixada americana "
				+ "o bilhete dizia 'Me encontre no ninho de ratos do seu país'";
		delay(texto);

		texto = "O agente também lembra que as cordas que amarravam as professoras tinham as cores da bandeira americana "
				+ "e corre para Embaixada. \n\n";
		delay(texto);

		// FIM DO DESAFIO 03

		// INICIO DO DESAFIO 04
		 texto = "CAPITULO 4: ATAQUE A EMBAIXADA";
		delay(texto);
		texto = " O agente chega à embaixada após salvar os reféns quando é abordado por um homem,\n"
				+ "ele se apresenta como diplomata e explica ao agente sobre a situação da embaixada.\n"
				+ "Ela está cheia de dignitários de outros países que compõem a embaixada\n"
				+ "buscando obter a documentação para sair do país.\n";
		delay(texto);

		texto = " Então o agente pergunta:\n";
		delay(texto);
		System.out.println(" (a) O senhor notou algum movimento estranho por aqui?");
		System.out.println(" (b) Qual a situação da embaixada?");

		boolean useless1 = true;
		do {
			String useless = sc.next();
			if (useless.equalsIgnoreCase("a") || useless.equalsIgnoreCase("b")) {
				texto = "O Diplomata: Tirando o fato de todos estarem e pânico para fugir dessa guerra iminente?\n"
						+ "notei a falta de alguns embaixadores nesta manhã na reunião, mas ha pouco quando perguntei\n"
						+ "por eles no prédio, e me foi informado que eles não deixaram as intalações.\n ";
				delay(texto);
				useless1 = false;
			} else
				System.out.println("Lamento, digite um caracter válido");
		} while (useless1 == true);

		texto = "Sem muitas informações, o agente segue investigando o local.\n"
				+ "Graças ao caos na embaixada, há somente 3 caminhos acessíveis.\n";
		delay(texto);
		texto = nomeJogador + ", para onde o agente deve seguir primeiro?\n";
		delay(texto);
		System.out.println(" (a) Seguir para o saguão principal, aonde há a maior concentração de pessoas");
		System.out.println(" (b) Ir até a sala de reuniões, aonde há a menor conentração de pessoas");
		System.out.println(" (c) Seguir pelo corredor e ir checando lentamente cada comodo do local");
		boolean htgo = true;
		do {
			String heretogo = sc.next();
			if (heretogo.equalsIgnoreCase("a")) {
				texto = "O agente segue pelo saguão principal mas não nota nenhum movimento estranho,\n"
						+ "as pessoas estão ou em ligações ou organizando suas papeladas para deixarem o pais,\n"
						+ "o local está uma bagunça mas todos parecem bem calmos.\n";
				delay(texto);
				htgo = false;
			} else if (heretogo.equalsIgnoreCase("b")) {
				texto = "O agente vai até a sala de reuniões e nota duas pessoas conversando,\n"
						+ "um deles era o diplomata afegão, ele aparentava estar triste e suplicava\n"
						+ "ao diplomata americano para não abandonar o país, mas sem aparentes resultados.\n"
						+ "O Talibã tomaria conta do pais novamente sem o exercito americano.\n";
				delay(texto);
				System.out.println(" Escolha outra alternativa:\n");
				System.out.println(" (a) Seguir para o saguão principal, aonde há a maior concentração de pessoas");
				System.out.println(" (c) Seguir pelo corredor e ir checando lentamente cada comodo do local");

			} else if (heretogo.equalsIgnoreCase("c")) {
				texto = "O agente segue pelo corredor olhando sala por sala do complexo,\n"
						+ "os olhares assustados das pessoas deixam o agente intrigado\n ";
				delay(texto);
				htgo = false;
			} else
				System.out.println("Lamento, digite um caracter válido.");
		} while (htgo == true);

		texto = " Até que ele nota um homem com aparencia suspeita,\n"
				+ "acompanhado de um dos embaixadores que aparentava estar assustado.\n";
		delay(texto);
		texto = " Ao tentar se aproximar do homem ele ameaça atirar no embaixador assustando todos no local\n"
				+ "O agente então trava uma luta contra o terrorista e o desarma\n";
		delay(texto);

		texto = "!!ATENÇÃO, VOCE ESTÁ PRESTES A INICIAR UM COMBATE.!!\n";
		delay(texto);
		texto = nomeJogador + ", escolha par ou impar para continuar:\n ";
		delay(texto);
		texto = " (a) Par";
		delay(texto);
		texto = " (b) Ímpar\n";
		delay(texto);
		texto = " O numero aleatório vai ser sorteado e\n" 
				+ "caso seja par ou impar dependendo de sua decisão\n"
				+ "voce vencerá o turno do combate.";
		delay(texto);
		int ddamage = 0;
		int tdamage = 0;
		do {
			String escolha12 = sc.next();
			texto = "Sorteando o numero...";
			delay(texto);
			int decisor = (int) (Math.random() * 10 + 1);
			texto = "O numero sorteado é: " + decisor;
			delay(texto);
			if (decisor % 2 == 0) {// PAR
				texto = "O resultado é par!\n";
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
				texto = "O resultado é impar: ";
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
					System.out.println("Por favor digite um caracter válido");
			}
			if (tdamage < 3 && ddamage < 2) {
				texto = "Escolha novamente par ou impar para continuar:\n ";
				delay(texto);
				texto = " (a) Par";
				delay(texto);
				texto = " (b) Ímpar\n";
				delay(texto);
			}
		} while (tdamage < 3 && ddamage < 2);
		if (ddamage >= 2) {
			System.out.println("Voce Ganhou o combate!\n");
			texto = " Neutralizando o Alvo e salvando as pessoas do local,\n"
					+ "O agente parte para examinar o local do acontecido e nota\n"
					+ "uma porta ligeiramente aberta, ele a abre e ve uma tilha\n "
					+ "de algum fluido no chão indo escada a baixo da embaixada.\n";
			delay(texto);
		} else if (tdamage >= 3) {
			System.out.println("Voce perdeu o combate! ");
			fimDeJogo();
		}
		
	
		// INICIO DESAFIO 5
		
		System.out.println("CAPÍTULO 5: O FINAL");
		int dialogo51 = 0;

		do {
			texto = "Inicio da conversa do Agente com o vilão";
			delay(texto);
			texto = "Escolha a opção de 1 a 6";
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
		texto = "Briga física entre o Agente e o vilão";
		delay(texto);

		for (int i = 5; i > 0; i--) {
			texto = "Selecione o golpe:\n 1: Soco na boca do estômago\n 2: golpe na garganta\n 3: Cruzado no queixo\n 4: Chute na canela\n 5: Empurrão\n 6: Soco no braço\n ";
			delay(texto);
			int golpe = sc.nextInt();

			if (golpe == 1 || golpe == 2) {
				texto = "Dano crítico. ";
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
				texto = "HAMID: foi bom brincar com você, mas como você não me impediu á tempo é hora de dizer adeus.";
				delay(texto);
				texto = "BOMBA EXPLODE ";
				delay(texto);
				fimDeJogo();
			}
		}
		texto = "Hamid finalmente desaba, e o  Agente corre para desarmar a bomba. Mas antes disso, ele procura por pistas no local";
		delay(texto);
		for (int j = 0; j < 4; j++) {
			texto = "Onde o agente olha á seguir?\n 1: \n 2: \n 3: \n 4: \n 5: \n 6: \n 7: \n";
			delay(texto);
			int escolhaAgente = sc.nextInt();

			switch (escolhaAgente) {
			case 1:
				texto = "O Agente lembra do ódio que Hamid tem pelos EUA, então sabe que escolheria fios com as cores da bandeira americana.";
				delay(texto);
				break;

			case 6:
				texto = "O agente lembra que fios roxos são perigosos para se cortar, então seria melhor deixar quieto.";
				delay(texto);
				break;

			case 4:
				texto = "O agente lembra que na maioria das bombas o relógio, caso seja desarmado, explodirá a bomba.";
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
				texto = "O Agente tenta mover a bomba, mas nota que ela é muito pesada. ";
				delay(texto);
				break;
			case 7:
				texto = "O Agente vê um quadro. O autor era cubista, logo o quadro é inútil.";
				delay(texto);
				break;

			default:
				break;
			}
		}

		texto = "AGENTE PERCEBE QUE NÃO TEM MAIS TEMPO, CORRE PRA DESARMAR A BOMBA";
		delay(texto);

		texto = "O QUE O AGENTE FARÁ PARA DESARMAR A BOMBA?\n 1: Cortar as linhas azul, vermelha, branca e preta \n 2: cortar as linhas preta, azul, roxa e amarela \n 3: Desconectar o timer";
		delay(texto);

		int desarmeDaBomba = sc.nextInt();
		if (desarmeDaBomba == 1) {
			texto = "PARABÉNS, BOMBA DESARMADA COM SUCESSO. BOM TRABALHO "+ nomeJogador;
			delay(texto);
		} else if (desarmeDaBomba == 2) {
			texto = "SEM EFEITO NENHUM, O AGENTE PERCEBE QUE SÓ TEM TEMPO PARA MAIS UMA TENTATIVA. ESCOLHA OUTRA OPÇÃO";
			delay(texto);
			desarmeDaBomba = sc.nextInt();
			if (desarmeDaBomba == 1) {
				texto = "PARABÉNS, AGENTE DESARMOU A BOMBA COM SUCESSO, GANHANDO O JOGO";
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
		System.out.println("CRÉDITOS: \n - Victor Henrique Moreira\\n\"\r\n"
				+ "						+ \" - Viviane Cipollari\\n\" + \" - Ricardo Magalhães\\n\" + \" - Matheus\\n");
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

