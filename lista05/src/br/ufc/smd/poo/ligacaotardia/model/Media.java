package br.ufc.smd.poo.ligacaotardia.model;

public class Media {
	private String titulo;

	public Media(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void assistir() {
		System.out.println("[Media] assistindo "+ this.getTitulo() + "...");
	}
	
}
