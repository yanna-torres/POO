package br.ufc.smd.poo.ligacaotardia.model;

public class Filme extends Media {
	private String categoria;
    private int anoLancamento;
    
	public Filme(String titulo, String categoria, int anoLancamento) {
		super(titulo);
		this.categoria = categoria;
		this.anoLancamento = anoLancamento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	@Override
	public void assistir() {
		System.out.println("[Filme] assistindo "+ this.getTitulo() + "...");
	}
}
