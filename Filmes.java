import java.util.ArrayList;

public class Filmes {
	
	private ArrayList<ArrayList<String>> filmes = new ArrayList<>();	// Lista que irá armazenar listas com o nome do filme e suas informações
	private boolean filme3D;											// Determina se o filme é em 3D ou não
	private String filmeSelecionado;									// Armazena o filme que foi selecionado
	
	// Adiciona um filme com suas informações num formato de lista dentro da lista de filmes
	void addFilme(String nome, String descricao, String autor, String genero, String duracao) {
		ArrayList<String> f = new ArrayList<>();
		f.add(nome);
		f.add(descricao);
		f.add(autor);
		f.add(genero);
		f.add(duracao);
		this.filmes.add(f);
	}
	
	// Lista os filmes contidos na lista de filmes
	void listarFilmes() {
		for (int i = 0; i < this.filmes.size(); i++) {
			System.out.printf("[%d] - %s \n", i+1, this.filmes.get(i).get(0));
			
		}
	}
	
	// Mostra as informações do filme escolhido dado o id (O id sendo a posição dele na lista de filmes)
	void infoFilme(int id) {
		System.out.println("[******INFORMAÇÕES DO FILME******]");
		System.out.println("Nome: " + this.filmes.get(id).get(0));
		System.out.println("Descrição: " + this.filmes.get(id).get(1));
		System.out.println("Autor: " + this.filmes.get(id).get(2));
		System.out.println("Gênero: " + this.filmes.get(id).get(3));
		System.out.println("Duração: " + this.filmes.get(id).get(4));
	}
	
	// Ativa/Desativa o 3D
	void set3D(boolean ativar) {
		this.filme3D = ativar;
	}
	
	// Verifica se o filme está em 3D
	boolean get3D() {
		return this.filme3D;
	}
	
	// "Seta" o filme selecionado
	void setFilmeSeleiconado(int id) {
		this.filmeSelecionado = this.filmes.get(id).get(0);
	}
	
	// Retorna o filme selecionado
	String getFilmeSelecionado() {
		return filmeSelecionado;
	}
}
