package br.ufc.smd.poo.coercao.app;

import br.ufc.smd.poo.coercao.model.*;

public class CoercaoApp {

	public static void main(String[] args) {
		
		Veiculo a;
		a = new Carro("audi", "a3", 2020, 4, 4, "branco"); // upcasting
		a.mover();
		// a.ligarFarol();
		
		Carro b = (Carro) a; // downcasting
		b.ligarFarol();
	}

}
