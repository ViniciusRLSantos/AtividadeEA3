import java.util.ArrayList;
import java.util.Scanner;

public class Ingresso {
	
	// Atributos:
	int qntdmeia;									// Quantidade de ingressos de meia entrada
	int qntdinteira;								// Quantidade de ingressos no valor inteiro
	ArrayList<String> sessoes = new ArrayList<>(); 	// Lista das sessões disponíveis
	private String sessaoselecionada; 				// Sessão selecionada
	
	// Calcula o valor total dos ingressos escolhidos
	double calcularTotal() {
		double total = this.qntdmeia*12 + this.qntdinteira*24;
		return total;
	}
	// Diz se a lanchonete está liberada ou não
	void acessoLanchonete() {
		System.out.println("===================================");
		System.out.println("******LANCHONETE NÃO LIBERADA******");
		System.out.println("******COMPRE UM INGRESSO VIP*******");
		System.out.println("===================================");
	}
	
	// Adiciona uma sessão
	void addSessao(String data, String horario) {
		String sessao = data + " - " + horario;
		this.sessoes.add(sessao);
	}
	
	// Lista as sessões existentes
	void listarSessoes() {
		for (int i = 0; i < this.sessoes.size(); i++) {
			System.out.printf("[%d] - %s\n", i+1, this.sessoes.get(i));
		}
	}
	
	// Compra dos ingressos
	void comprarIngressos() {
		System.out.println("COMPRA DE INGRESSO (PADRÃO)");
		
		Scanner meia = new Scanner(System.in);
		System.out.println("Meia Entrada: ");
		this.qntdmeia = meia.nextInt();
		
		
		Scanner inteira = new Scanner(System.in);
		System.out.println("Inteira");
		this.qntdinteira = inteira.nextInt();
		
		System.out.println("Total: R$"+calcularTotal());
		meia.close();
		inteira.close();
	}
	
	// "Seta" a sessão escolhida baseado na posição da sessão na lista de sessões
	void setSessao(int sel) {
		this.sessaoselecionada = this.sessoes.get(sel-1);
	}
	
	// Retorna a sessão escolhida
	String getSessao() {
		return this.sessaoselecionada;
	}
}
