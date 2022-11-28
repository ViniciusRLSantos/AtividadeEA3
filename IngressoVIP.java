import java.util.Scanner;

public class IngressoVIP extends Ingresso{
	
	// Atributos:
	int qntdmeia;									// Quantidade de ingressos de meia entrada
	int qntdinteira;								// Quantidade de ingressos no valor inteiro
	private String sessaoselecionada; 				// Sessão selecionada

	// Calcula o valor total dos ingressos VIP escolhidos
	double calcularTotal() {
		double total = this.qntdmeia*24 + this.qntdinteira*28;
		return total;
	}
	// Avisa que lanchonete está liberada para o usuário
	void acessoLanchonete() {
		System.out.println("===============================");
		System.out.println("******LANCHONETE LIBERADA******");
		System.out.println("===============================");
	}
	
	// Compra dos ingressos VIP
	void comprarIngressos() {
		System.out.println("COMPRA DE INGRESSO VIP");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Meia Entrada: ");
		this.qntdmeia = input.nextInt();
		
		System.out.println("Valor Inteiro: ");
		this.qntdinteira = input.nextInt();
		System.out.println("Total: R$"+calcularTotal());
		
		input.close();
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
