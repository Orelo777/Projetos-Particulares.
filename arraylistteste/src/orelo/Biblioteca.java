package orelo;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Livros> livro = new ArrayList<>();
	
	
	
	public void addlivros (String titulo, String autor, int  publicacao) {
		
		Livros L = new Livros(titulo, autor, publicacao);
		
		livro.add(L);
		
		System.out.println("Livro adicionado com sucesso!");
		
		return;
		
		
	}
	
	public void buscarlivro(String titulo) {
		
		if (livro.isEmpty()) {
			
			System.out.println("Nenhum livro foi cadastrado ainda!");
			
		}
		
		
		for(Livros L : livro) {
			
			if(L.getTitulo().equalsIgnoreCase(titulo)) {
				
				System.out.println("Livro encontrado: "  +L+ " ");
				
				return;
				
			}
		}
		
		System.out.println("Livro não encontrado!!!");
		
		
	}
	
	public void listarlivros() {
		
		if(livro.isEmpty()) {
			System.out.println("Não existe nenhum livro cadastrado ainda!");
		}else {
			System.out.println("Livros listados: ");
			
			for(Livros L : livro) {
				
				System.out.println(L);
				System.out.println();
				
			}
			
		}
		
		
		
	}
	
	public void removerlivro(String titulo) {
		
		for(Livros L:livro) {
			if(L.getTitulo().equalsIgnoreCase(titulo)) {
				livro.remove(L);
				
				System.out.println("Livro removido com sucesso!");
				
				return;
			}
			
		}
		
		System.out.println("Livro não encontrado!");
		
		
	}
}
