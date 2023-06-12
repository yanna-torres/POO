package lista05br.ufc.smd.poo.ligacaotardia.app;

import br.ufc.smd.poo.ligacaotardia.model.*;

public class AppLigacaoTardia {

	public static void main(String[] args) {

		Media media1 = new Filme("filme 01", "poo", 2023);
		Media media2 = new Serie("serie 01", 5);
		
		media1.assistir();
		media2.assistir();
	}

}
