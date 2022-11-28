import java.util.Scanner;

public class MenuController {
	
	public static void main(String[] args) {

		// Scanner para aceitar input do usuário
		Scanner selecao = new Scanner(System.in);
		
		
		// Criação da classe Filmes e adicionando filmes
		Filmes filme = new Filmes();
		filme.addFilme("Desventuras de um Careca Bombado", "Nosso herói Calvino Clementino, uma pessoa bem infortuna, terá de derrotar Richard, o menino que sempre teve o que queria.", "Vinícius Santos", "Ação & Comédia", "105 min");
		filme.addFilme("Sonhos Longos", "Um homem chega no hospital se queixando dos seus sonhos que apesar de passarem apenas algumas horas, seus sonhos pareciam levar dias, mêses e até anos para acabar", "Junji Ito", "Terror Psicológico", "90 min");
		filme.addFilme("Feitiço do Tempo", "Phil, um arrogante meteorologista de um canal de televisão, fica preso em uma espécie de túnel do tempo, condenado a reviver indefinidamente o mesmo dia \naté que mude suas atitudes.", "Harold Ramis", "Comédia Dramática & Fantasia", "101 min");
		
		// Seleção de filme
		System.out.println("****Filmes****");
		filme.listarFilmes();
		
		System.out.println("Selecione um filme:");
		int index = selecao.nextInt();
		filme.infoFilme(index - 1);
		filme.setFilmeSeleiconado(index - 1);
		
		// Seleção de 2D ou 3D
		System.out.println("\n\nSelecione o tipo do filme:\n[0] - 2D\n[1] - 3D (Apenas ingressos VIP)\n");
		int sel3D = selecao.nextInt();
		if (sel3D == 1) {
			filme.set3D(true);
		} else {
			filme.set3D(false);
		}
		
		// Seleção do tipo do ingresso, da sessão e compra do(s) ingresso(s)
		// Caso o usuário tenha selecionado filme 3D, ele automaticamente seleciona o ingresso vip e já parte pra escolha da sessão e compra do(s) ingresso(s)
		if (filme.get3D() == false) {
			System.out.println("\n\nSelecione o tipo de Ingresso:\n[0] - Normal (Sem acesso à lanchonete)\n[1] - VIP (Acesso à lanchonete)\n");
			int vip = selecao.nextInt();
			if (vip == 0) {
				Ingresso ingresso = new Ingresso();
				
				ingresso.acessoLanchonete();
				
				ingresso.addSessao("12/12/2022", "11:30");
				ingresso.addSessao("14/01/2023", "19:00");
				ingresso.addSessao("20/01/2023", "00:30");
				ingresso.addSessao("01/02/2023", "13:00");
				
				System.out.println("****Sessões***");
				ingresso.listarSessoes();
				System.out.println("Selecione uma sessão:");
				int ses = selecao.nextInt();
				ingresso.setSessao(ses);
				
				ingresso.comprarIngressos();
				
				System.out.printf("\n\nVocê comprou ingressos para o filme %s para a sessão %s no valor de R$%2f\n", filme.getFilmeSelecionado(), ingresso.getSessao(), ingresso.calcularTotal());
				
			} else {
				IngressoVIP ingressoVIP = new IngressoVIP();
				
				ingressoVIP.acessoLanchonete();
				
				ingressoVIP.addSessao("12/12/2022", "11:30");
				ingressoVIP.addSessao("14/01/2023", "19:00");
				ingressoVIP.addSessao("20/01/2023", "00:30");
				ingressoVIP.addSessao("01/02/2023", "13:00");
				
				System.out.println("****Sessões***");
				ingressoVIP.listarSessoes();
				System.out.println("Selecione uma sessão:");
				int sesVIP = selecao.nextInt();
				ingressoVIP.setSessao(sesVIP);
				
				ingressoVIP.comprarIngressos();
				
				System.out.printf("\n\nVocê comprou ingressos para o filme %s para a sessão %s no valor de R$%2f\n", filme.getFilmeSelecionado(), ingressoVIP.getSessao(), ingressoVIP.calcularTotal());
				
			}
			
		} else {
			IngressoVIP ingressoVIP = new IngressoVIP();
			
			ingressoVIP.acessoLanchonete();
			
			ingressoVIP.addSessao("12/12/2022", "11:30");
			ingressoVIP.addSessao("14/01/2023", "19:00");
			ingressoVIP.addSessao("20/01/2023", "00:30");
			ingressoVIP.addSessao("01/02/2023", "13:00");
			
			System.out.println("****Sessões***");
			ingressoVIP.listarSessoes();
			System.out.println("Selecione uma sessão:");
			int sessaoVIP = selecao.nextInt();
			ingressoVIP.setSessao(sessaoVIP);
			
			ingressoVIP.comprarIngressos();
			
			System.out.printf("\n\nVocê comprou ingressos para o filme %s para a sessão %s no valor de R$%2f\n", filme.getFilmeSelecionado(), ingressoVIP.getSessao(), ingressoVIP.calcularTotal());
			
		}
		selecao.close(); // Fecha o Scanner para evitar Memory Leaks (Não sei o termo em português, acho que é vazamento de memória)
	
	}

}
