package orelo;

public class Livros {
	private String titulo;
	private String autor;
	private int publicacao;
	
	
	public Livros( String titulo, String autor, int publicacao) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.publicacao = publicacao;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public int getPublicacao() {
		return publicacao;
	}
	
	
	public String toString() {
		
		return "Título da obra: " +titulo+ " | Autor: " +autor+  " | Ano de publicação: " +publicacao;
	}
}
