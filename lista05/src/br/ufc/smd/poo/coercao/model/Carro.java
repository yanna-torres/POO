package br.ufc.smd.poo.coercao.model;

public class Carro extends Veiculo {
	
	private int quantPortas;
	private int quantPneus;
	private String cor;
	
	public Carro(String marca, String modelo, int ano, int quantPortas, int quantPneus, String cor) {
		super(marca, modelo, ano);
		this.quantPortas = quantPortas;
		this.quantPneus = quantPneus;
		this.cor = cor;
	}

	public int getQuantPortas() {
		return quantPortas;
	}

	public void setQuantPortas(int quantPortas) {
		this.quantPortas = quantPortas;
	}

	public int getQuantPneus() {
		return quantPneus;
	}

	public void setQuantPneus(int quantPneus) {
		this.quantPneus = quantPneus;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void mover() {
		System.out.println("[Carro] carro esta andando...");
	}
	
	public void ligarFarol() {
		System.out.println("[Carro] farol esta ligado");
	}
	
}
