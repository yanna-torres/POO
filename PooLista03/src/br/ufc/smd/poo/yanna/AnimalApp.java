package br.ufc.smd.poo.yanna;

import br.ufc.smd.poo.yanna.model.Animal;

public class AnimalApp {

	public static void main(String[] args) {
		Animal owl = new Animal("corujinha");
		Animal hawk = new Animal("gaviaozinho");
		Animal mouse = new Animal ("ratinho");
		Animal fish = new Animal("peixinho");
		
		owl.addPredator(hawk);
		owl.addPrey(mouse);
		owl.addPrey(fish);
		owl.showPreys();
		owl.showPredators();
		owl.isPrey(mouse);
		owl.isPredator(hawk);
		fish.addPredator(hawk);
		hawk.showPreys();
	}

}
