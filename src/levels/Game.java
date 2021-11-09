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
			//INICIO DO DESAFIO 01
			texto = " -     DESAFIO 01     - ";

			delay(texto);
			texto = "Após desastres no Afeganistão e o Talibã tomar o poder do país, foi designado um agente da CIA para ir ao Afeganistão e ajudar na evacuação dos soldados americanos no aeroporto de Cabul no Afeganistão.\n"
					+ "Chegando no aeroporto e após conseguir realizar a evacuação dos soldados o/a agente percebeu que estava faltando um grupo de soldados e sabendo que teria que dar uma explicação aos EUA sobre isso \nele então tem que decidir se vai a procura dos soldados perdidos ou não...";
			delay(texto);
			texto = " -     AÇÃO     - ";
			delay(texto);
			texto = "1 - Procurar soldados? ";
			delay(texto);
			texto = "2 - Não procurar soldados? ";
			delay(texto);

			int n1 = sc.nextInt();

			switch (n1) {
			case 1:
				System.out.println(
						" O/a agente fica em uma intensa procura sobre os soldados restantes até que um grupo de mulheres que foram salvas pelo grupo de soldados\n"
								+ "fala que eles foram capturados pelo grupo terrorista do Talibã e que viu eles sendo levados dentro de um carro para fora do aeroporto, com isso em mente e sem poder deixar o local\n"
								+ "o/a agente notifica seu general e espera uma resposta através de uma ligação do que continuar fazendo, ficar no aeroporto e conseguir evacuar os soldados e alguns civis ou deixar o aeroporto e ir atrás dos soldados capturado");
				break;
			case 2:
				System.out.println(
						" Com a recusa do agente em procurar os soldados perdidos a multidão que está no aeroporto percebe que sobra algumas vagas ainda no avião\n"
								+ "e com isso gera uma grande briga entre os civis para ver quem vai entrar no avião e acaba que os civis tentam tomar controle do avião contra os soldados e isso gera uma briga intensa\n"
								+ "entre soldados e civis, gerando até mesmo uma morte por conta da tentativa de tomada de avião, fazendo assim com que o/a agente tenha que verificar se nenhum repórter flagrou a morte do civil\n"
								+ "e resolver o problema do homicídio e com isso notifica seu general através de um ligação e espera a resposta para saber o que fazer...");
				break;
			}
			texto = " - Após a ação do jogador - ";
			delay(texto);
			texto = "Sendo a ação do jogador a (sim) ou a (não) ele espera da mesma forma o telefone de seu general, mas não esperava que quem vai ligar para ele é uma pessoa misteriosa, mas que sabe muito sobre ele.";
			delay(texto);
			texto = " - Fim do desafio 1 - ";
			delay(texto);
		}
		// FINAL DESAFIO 01
		
		//INICIO DO DESAFIO 02
		texto = " -     DESAFIO 02     - ";

		delay(texto);
		texto = "O agente atende à ligação que estava aguardando, surpreso, ele descobre que a pessoa que havia lhe ligado era um antigo pupilo o qual ele havia treinado uma década antes em seu tempo no Afeganistão.\n"
				+ "Voltando no passado, esse rapaz chamado Hamid, integrava uma família que desprezava os EUA, mas ele não via problema na presença dos americanos no Afeganistão, e,\n"
				+ "como o EUA oferecia alimentação e uma condição de vida melhor para quem era recrutado, ele optou por se tornar um recruta.\n"
				+ "Conforme o passar do tempo, quase ao fim de seu treinamento, Hamid presenciou uma situação que mudou o seu destino.\n"
				+ "\n"
				+ "Em uma batida dos Estados Unidos em um vilarejo, eles suspeitaram que uma pessoa que tinha ligação com o grupo terrorista local a Isis-K, porém o rapaz conhecia aquela pessoa e a considerava alguém inocente.";
		delay(texto);
		texto = " -     AÇÃO     - ";
		delay(texto);
		texto = "1 - Ajudar o senhor? ";
		delay(texto);
		texto = "2 - Não ajudar o senhor? ";
		delay(texto);

		int n1 = sc.nextInt();

		switch (n1) {
		case 1:
			System.out.println(
					" Hamid toma atitude vendo aquela situação e tenta ajudar o senhor a qual estava sendo agredido, porém mesmo implorando para os soldados parassem com aquilo, eles continuaram até matar o homem.\n"
							+ "Após todo o ocorrido os soldados americanos ocultaram a morte do senhor e mesmo com a população de testemunha do ocorrido, seus atos foram ignorados e ninguém acabou punido.\n"
							+ "Ao testemunhar tudo aquilo, sua concepção a respeito dos Estados Unidos mudou, o garoto na qual não via problema algum na presença de americanos no Afeganistão, passou a odiá-los assim como seus familiares.");
			break;
		case 2:
			System.out.println(
					" Hamid permanece imóvel, quase em estado de choque testemunhando tudo aquilo sem saber o que fazer.\n"
							+ "Vendo toda essa situação, imaginando como uma pessoa seria capaz de fazer tal ato a alguém inocente,\n"
							+ "o rapaz pensa a respeito das suas decisões e passa a considerar os EUA invasores de seu país assim como seus familiares.");
			break;
		}
		texto = " - Após a ação do jogador - ";
		delay(texto);
		texto = "Voltando para o presente, o agente atende a ligação e escuta uma voz calma e conhecida...\n"
				+ "Hamid diz – “Lembra de mim “professor”?” sarcasticamente\n"
				+ "Então o agente respondeu – “Quem é você?”\n"
				+ "Hamid novamente diz – “Nossa, fico desapontado que você não lembra de mim, encontrei com seus amigos americanos hoje de manhã, nós saímos para dar um rolezinho por aí” diz novamente em um tom sarcástico.\n"
				+ "O agente responde preocupado - “ONDE ESTÁ MINHA EQUIPE ??!!”\n"
				+ "Hamid revela – “Tenho duas localizações para te passar, ainda tenho um pouco de esperança de que você seja uma pessoa boa então quero ver que atitude o senhor irá tomar professor”\n"
				+ "“Tem um armazém localizado ao sul do aeroporto com uma fachada vermelha e branca, vá para lá se quiser encontrar os seus amigos, agora, caso você ainda seja a pessoa boa que eu costumava a conhecer,\n"
				+ "um grupo de professoras estão presas em um prédio e chamas ao oeste de sua posição, apenas siga a fumaça. Agora, elas são pessoas inocentes, diferente dos seus amiguinhos americanos, que assassinaram um homem a sangue frio tempos atrás.”";
		delay(texto);
		texto = " - Fim do desafio 2 - ";
		delay(texto);

		// FINAL DO DESAFIO 02
                
                // INÍCIO DO DESAFIO 03
                
                texto= "Após a ligação, o agente ficou sem saber o que fazer,/n"
                        + "pensando em qual decisão tomar";
                delay(texto);
                
                texto = "salvar um grupo de professorar ou equipe de soldados americanos";
                delay(texto);
                
                System.out.println(
				"Escolha uma das opções abaixo:\n\n" 
						+ "1) Salvar as professoras\n"
						+ "2) Salvar equipe de soldados");
                
						
                
                
             do {

			int escolhaMenu = sc.nextInt();

			if (escolhaMenu== 1){
				 			 
				texto = " O agente parte rapidamente para o local do incêndio, chegando próximo das redondezas \n" 
                                        +" se vê uma gigantesca fumaça saindo de um lugar que possivelmente é onde as professoras se localizam\n" 
                                        +" Ao entrar no prédio em chamas, o agente corre rapidamente subindo as escadas e perguntando se havia alguém a\n"
                                        +"então as professoras começaram a gritar:  “Socorro!! Alguém nos ajude!!\n"
                                        +"O agente chega ao cômodo onde as professoras estavam e se depara com a seguinte situação.\n"
                                        +" Três professoras estão amarradas em uma sala com cordas de cores \n" 
                                        + "diferentes, Azul, Vermelho e Branco. Isso chama a atenção do agente,\n" 
                                        +"mas ele continua avançando para desamarrá-las, após libertá-las\n" 
                                        +"uma das professoras entrega um bilhete a mando de Hamid para o \n" 
                                        +"agente. Ela diz:\"“Ele pediu para lhe entregar\n" 
                                        +"Então as três professoras correm para fora do prédio em chama junto com o agentes";
                                delay(texto);
                        } else if(escolhaMenu==2){
			
				texto = " O agente parte rapidamente para o local informado por Hamid, chegando próximo, ele avista o letreiro vermelho\n"
                                        +" e branco como havia dito"
                                        +"Ao entrar no armazém, o agente identifica rapidamente uma bomba amarrada a estrutura do local, e os americanos" 
                                        +"desacordados em seu interior. Ele tenta chamá-los, mas apenas um parece estar seu interior. Ele tenta chamá-los,"
                                        + "mas apenas um parece estar ligeiramente acordado. Ele então, um por um, retira os americanos \n" 
                                        + "do lugar rapidamente antes do timer da bomba zerar.\n"
                                        + "O armazém explode e o agente fica assustado com aquela situação, ele liga para ajuda. Enquanto aguardava pela emergência um dos\n" 
                                        + "soldados americanos entrega para o agente um papel timbrado e diz:\n"
                                        + "“O terrorista, ele pediu para que eu entregasse a você caso viesse \n" 
                                        + "aqui, ele também disse pra eu te dizer que ele está muito desapontado com a sua decisão” \n";
                                delay(texto);
                        }else{
				System.out.println("Opção inválido.");
				
			}

		} while (sair && jogar);
		   
             texto= " O agente abre o envelope que tem timbrado a bandeira dos estados unidos bem grande e em cores, ele lê a mensagem que diz: \n"
                    + " 'Me encontre no ninho de ratos do seu país' e ao lado rabiscado um símbolo de um prédio grande. "
                    + "O agente então imagina que o Hamid está falando sobre a embaixada, e parte às pressas para lá.";   

                delay(texto);
                
                
                // FIM DO DESAFIO 03
		
		
		//INICIO DO DESAFIO 04 
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
        