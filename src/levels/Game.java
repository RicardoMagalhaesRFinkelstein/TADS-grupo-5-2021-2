package levels;
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
                
                 
                System.out.println ("O AGENTE A NO AFEGANIST�O"); 
                
                System.out.println("Ol�,  seja bem-vindo ao jogo!\n");
                System.out.println("Seu papel � muito importante, vc ser� o nosso agente");
                 System.out.println("Qual seu nome????");
                 nomeJogador=sc.next();

		System.out.println(
				nomeJogador+" Escolha uma das op��es abaixo:\n\n" 
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
		texto = "O agente atende � liga��o que estava aguardando, surpreso, ele descobre que a pessoa que havia lhe ligado era\n"
                       +" um antigo pupilo o qual ele havia treinado uma d�cada antes em seu tempo no Afeganist�o.Voltando no passado, esse rapaz chamado Hamid, \n";
			delay(texto);
                texto = "integrava uma fam�lia que desprezava os EUA, mas ele n�o via problema na presen�a dos americanos no Afeganist�o, e,\n"
                      + "como o EUA oferecia alimenta��o e uma condi��o de vida melhor para quem era recrutado, ele optou por se tornar um recruta.\n";
                        delay(texto);
		texto = "Conforme o passar do tempo, quase ao fim de seu treinamento, Hamid presenciou uma situa��o que mudou o seu destino.\n"
                      + "Em uma batida dos Estados Unidos em um vilarejo, eles suspeitaram que uma pessoa que tinha liga��o com o grupo terrorista local a Isis-K, por�m o rapaz conhecia aquela pessoa e a considerava algu�m inocente.";
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
		      + "Hamid diz � �Lembra de mim �professor�?� sarcasticamente Ent�o o agente respondeu � �Quem � voc�?\n";
			 delay(texto);	
                texto = "Hamid novamente diz � �Nossa, fico desapontado que voc� n�o lembra de mim, encontrei com seus amigos americanos hoje de manh�, n�s sa�mos para dar um rolezinho por a� diz novamente em um tom sarc�stico.\n"
		      + "O agente responde preocupado - �ONDE EST� MINHA EQUIPE ??!!�\n";
                        delay(texto);
		texto = "Hamid revela � �Tenho duas localiza��es para te passar, ainda tenho um pouco de esperan�a de que voc� seja uma pessoa boa ent�o quero ver que atitude o senhor ir� tomar professor�\n"
		      + "�Tem um armaz�m localizado ao sul do aeroporto com uma fachada vermelha e branca, v� para l� se quiser encontrar os seus amigos, agora, caso voc� ainda seja a pessoa boa que eu costumava a conhecer,\n"
                      + "um grupo de professoras est�o presas em um pr�dio e chamas ao oeste de sua posi��o, apenas siga a fuma�a. Agora, elas s�o pessoas inocentes, diferente dos seus amiguinhos americanos, que assassinaram um homem a sangue frio tempos atr�s.\n\n�";
		delay(texto);
		texto = " - Fim do desafio 2 - \n\n\n";
		delay(texto);

		// FINAL DO DESAFIO 02
                
                // IN�CIO DO DESAFIO 03
                System.out.println(" Parab�ns!!!! " + nomeJogador + " Voc� chegou ao desafio tr�s!!!!!\n");
                       
               
               
                texto = "Agora " + nomeJogador +" vc precisa salvar os ref�ns.";
                        delay(texto);
                
                System.out.println ("Nesta parte do jogo ter�o muitos desafios com n�meros, " +nomeJogador+ ", vc est� pronto????");        
                        
                int escolha;
            
                System.out.println("\n[1] - Sim \n[2] - N�o");
                escolha = sc.nextInt();
                   if(escolha ==1){
                       System.out.println("Vamos ao desafio!!!");
                   }else{
                       sair();
                   }   
                
              
		texto = "O agente parte rapidamente para o local onde fica o armaz�m, chegando pr�ximo das redondezas \n" 
                       +"se v� uma gigantesca fuma�a saindo de um lugar que possivelmente � onde as professoras se encontram\n";
                         delay (texto);
                
                texto =   "Ao entrar no pr�dio em chamas, o agente corre rapidamente subindo as escadas e perguntando se havia algu�m a\n"
                         +"ent�o as professoras come�aram a gritar:  �Socorro!! Algu�m nos ajude!!\n";
                         delay (texto);
                
                texto =  "O agente chega no fundo do armaz�m onde as professoras estavam e se depara com a seguinte situa��o.\n"
                        +"As professoras estavam amarradas e assustadas gritando socorro, mas a porta que dava acesso onde elas estavam \n";
                         delay (texto);
                         
                texto =  "estava presa com um bomba e para desativ�-la Hamid deixou uma dica 'lembra quantas vezes que quase perdi a vida no treinamento'??\n";
                         delay(texto);         
                 
                 
                System.out.println("Agora " +nomeJogador+", para lembrar quantas vezes Hamid "
                                  +"quase�perdeu a vida nos treinamentos. \n\n\n");
                        
                         texto=  "Resolva a equa��o de segundo grau : 5x�-20=0";
                                  delay(texto);
                                  
            System.out.println(nomeJogador+" Vc s� tem uma chance, escolha uma letra para as alternativas abaixo: \n"
                    + "a) 1.\n"
                    + "b) 2.\n" //ALTERNATIVA CORRETA
                    + "c) 3.\n"
                    + "d) 4");
            
                        
            char alternativa = sc.next().toLowerCase().charAt(0);
            
            if(alternativa == 'b') {
            	System.out.println("\nVoc� acertou!!!!Conseguiu salvar as professoras");            	
            } else {
            	System.out.println( "Vc errou!!!! GameOver");
            	sair();
            }
            
                                
                    texto = "Tr�s professoras est�o amarradas em  com cordas de cores \n" 
                           +"diferentes, Azul, Vermelho e Branco. Isso chama a aten��o do agente cores da bandeira americana,\n"; 
                            delay (texto);
                            
                    texto = "mas ele continua avan�ando para desamarr�-las, ap�s libert�-las\n" 
                           +"uma das professoras entrega um bilhete a mando de Hamid para o \n"; 
                            delay (texto);
                            
                    texto = "agente. Ela diz:\"�Ele pediu para lhe entregar\n" 
                           +"Ent�o as tr�s professoras correm para fora do pr�dio em chama junto com o agente";
                            delay(texto);
                        
                    texto ="No bilhete entregue pelas professoras Hamid mostram a localiza��o da equipe de soldados\n"
                           +"era uma armaz�m pr�ximo do armaz�m onde estavam as professoras, mas este n�o estva em chamas";
                           delay(texto);
                    texto = "Ao entrar no armaz�m, o agente identifica rapidamente uma bomba embaixo da plataforma onde estava sua equipe" ;
                          
                           delay(texto);
                    texto = "A bomba ser� acionada  pela mudan�a de peso...ou seja, para tirar um soldado a bomba explode  \n" 
                           +"o time da bomba esta acionada e s� faltam 5 minutos para a bomba explodir.\n\n\n";
                           delay(texto);
                           
                    System.out.println("Agora "+nomeJogador+" ajude a desarmar a bomba");
                    
                Random gerador = new Random();  
                boolean acertou = false;
                int numeroAleatorio = gerador.nextInt(10);
                int palpite = 1;
                int tentativas = 3;
                
                while(tentativas>=0 && acertou==false){
                 System.out.println("Chute um numero de 1 a 10");
                 palpite = sc.nextInt();
            
                     if (numeroAleatorio==palpite){
                         System.out.println("Parab�ns!!!!!Vc salvou os soldados americanos!");
                         acertou=true;
                    }else if(palpite<numeroAleatorio) {  
                         System.out.println("Seu palpite � menor que o n�mero escolhido, ent�o aumente seu n�mero, vc tem "+tentativas--+" chances restantes");
                     
                    } else{
                         System.out.println("Seu palpite � maior que o numero escolhido, ent�o diminua seu n�mero, vc tem "+tentativas--+" chances restantes");
             
                         }if(tentativas== -1){
                          System.out.println("Acabou suas chances. Game over!!!!");
                         }    
                         
                }
                
                 texto= "Ap�s salvar sua equipe, o armaz�m explode e o Agente percebe que Hamid n�o est� brincando";
                        delay(texto);
                        
                 texto = "Um dos soldados entrega uma chave para o Agente e ele percebe que esta chave � de um arm�rio no"
                        +"no aeroporto. Soldado avisa que se refere a pr�xima dica, onde ser� o novo atentado";
                        delay(texto);
                        
                 texto = "Chegando ao Aeroporto abre o arm�rio e dentro dele estava uma caixa, mas para abr�-la "
                        +"ir� precisar de uma sennha de quatro d�gitos. \n \n \n " ;
                        delay(texto);
                        
                 texto=  "Resolva a equa��o de primeiro grau : 2x- 6700 = x -4x + 4525 ";
                          delay(texto);
                 
                 
                 System.out.println(nomeJogador+" Vc s� tem uma chance, escolha uma letra para as alternativas abaixo: \n"
                    + "a) 2241.\n"
                    + "b) 2240.\n" 
                    + "c) 2245.\n"//ALTERNATIVA CORRETA
                    + "d) 2250");
            
                        
            char opcoes = sc.next().toLowerCase().charAt(0);
            
            if(opcoes == 'c') {
            	System.out.println("\nVoc� acertou!!!!Conseguiu pegar a dica para novo atentado;");            	
            } else {
            	System.out.println( "Vc errou!!!! GameOver");
            	sair();
            }
            
                texto = "Com a senha o Agente abre a caixa e pega um envelope e papel timbrado da embaixada americana "
                       +"o bilhete dizia 'Me encontre no ninho de ratos do seu pa�s'";
                        delay (texto);
                        
                texto = "O agente tamb�m lembra que as cordas que amarravam as professoras tinham as cores da bandeira americana "
                       +"e corre para Embaixada. \n\n";
                        delay (texto);
            
                
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
				+ "O agente se assusta, e encontra uma cobertura atr�s de uma parede\n";
                 delay(texto);
                 texto = "o homem ent�o corre para o sagu�o principal aonde da acesso a uma escadaria\n"
				+ "e entra em uma porta que l� estava, com uma fechadura eletronica.";
		delay(texto);
		
		 texto = "O agente chega na porta e nota um simbolo da ISIS-K desenhado em sangue em seu adorno.\n"
				+ "Tambem percebe-se uma fechadura eletr�nica que pede uma senha de 6 digitos para o acesso.";
		delay(texto);
		
		//FIM DO DESAFIO 04
		//INICIO DESAFIO 5
				int dialogo51= 0;
				
				do {
					//int dialogoLocal = 1;
					texto = "Inicio da conversa do Agente com o vil�o";
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
					

					
				} while (dialogo51 == 0 || dialogo51 == 1 || dialogo51 == 2 ||dialogo51 == 3 ||dialogo51 == 4 ||dialogo51 == 5 );
				
				int golpeRuim = 0;
				texto = "Briga f�sica entre o Agente e o vil�o";
				delay(texto);
				
				for (int i = 5; i > 0; i--) {
					texto = "Selecione o golpe: 1 a 6 ";
					delay(texto);
					int golpe = sc.nextInt();
					
					if (golpe == 1 || golpe == 2) {
						texto = "Dano cr�tico ";
						delay(texto);
						i--;
					} else if (golpe == 3 || golpe == 4) {
						texto = "Dano normal ";
						delay(texto);
					} else {
						texto = "Golpe falhou ";
						delay(texto);
						golpeRuim++;
					}
					
					if(golpeRuim >= 2) {
						texto = "VIL�O: foi bom brincar com voc�, mas como voc� n�o me impediu � tempo � hora de dizer adeus.";
						delay(texto);
						texto = "BOMBA EXPLODE ";
						delay(texto);
						fimDeJogo();
					}
				}
				texto = "AGENTE OBSERVA O LOCAL, PROCURANDO PISTAS PARA DESARMAR A BOMBA ";
				delay(texto);
				for (int j = 0; j < 4; j++) {
					texto = "Onde o agente olha � seguir? Escolha 1 a 7";
					delay(texto);
					int escolhaAgente = sc.nextInt();
					
					switch (escolhaAgente) {
					case 1:
						texto = "PISTA �TIL ";
						delay(texto);
						break;
					
					case 2:
						texto = "PISTA �TIL ";
						delay(texto);
						break;
						
					case 3:
						texto = "PISTA �TIL ";
						delay(texto);
						break;
						
					case 4:
						texto = "PISTA IN�TIL ";
						delay(texto);
						break;
						
					case 5:
						texto = "PISTA IN�TIL ";
						delay(texto);
						break;
					case 6:
						texto = "PISTA IN�TIL ";
						delay(texto);
						break;
					case 7:
						texto = "PISTA IN�TIL ";
						delay(texto);
						break;
						
						
					default:
						break;
					}
				}
				
				texto = "AGENTE PERCEBE QUE N�O TEM MAIS TEMPO, CORRE PRA DESARMAR A BOMBA";
				delay(texto);
				
				texto = "O QUE O AGENTE FAR� PARA DESARMAR A BOMBA? ";
				delay(texto);
				
				int desarmeDaBomba = sc.nextInt();
				if (desarmeDaBomba == 1) {
					texto = "PARAB�NS, AGENTE DESARMOU A BOMBA COM SUCESSO, GANHANDO O JOGO";
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
        		System.out.println( "CR�DITOS");
        		sair();
        	}
        	
        	static void sair() {
        		System.exit(0);
        	}

        	static void delay(String TextoFuncao) {
        		int tamanhoDelay = TextoFuncao.length();
        		System.out.println(TextoFuncao);
        		try {
        			TimeUnit.SECONDS.sleep(tamanhoDelay /30);
        		} catch (InterruptedException ie) {
        			Thread.currentThread().interrupt();
        		}
        	}
}
        