package br.ufc.smd.poo.ligacaotardia.model;

public class Serie extends Media {

    private int temporadaAtual;

	public Serie(String titulo, int temporadaAtual) {
		super(titulo);
		this.temporadaAtual = temporadaAtual;
	}

	public int getTemporadaAtual() {
		return temporadaAtual;
	}

	public void setTemporadaAtual(int temporadaAtual) {
		this.temporadaAtual = temporadaAtual;
	}

	@Override
	public void assistir() {
		System.out.println("[Serie] assistindo "+ this.getTitulo() + "...");
	}
    
}
