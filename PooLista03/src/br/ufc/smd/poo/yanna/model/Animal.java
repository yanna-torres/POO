package br.ufc.smd.poo.yanna.model;

import java.util.List;

import java.util.ArrayList;

public class Animal {
   private String name;
   private List<Animal> predators;
   private List<Animal> preys;

   /**
	 * Create an object
	 * 
	 * @param nameObj Name of the object. Can't be *null*!  
	 */
   public Animal(String nameObj) {
	  if( nameObj == null ){
		  throw new NullPointerException("null name is not allowed");
	  }
      this.name = nameObj;
      this.predators = new ArrayList<Animal>();
      this.preys = new ArrayList<Animal>();
      
      System.out.println("[ANIMAL] "+ name + " was created succefully");
      System.out.println("  ");
   }

   /**
	 * Add a new predator of the Animal
	 * 
	 * @param animal New prey of the object. Can't be *null*!  
	 */
   public void addPredator(Animal animal) {
	   if (animal == null) {
			throw new NullPointerException("null animal is not allowed");
	   }
	   if (predators.contains(animal)) {
		   System.out.println("[ANIMAL] "+ animal.getName() + " was already on the predators list of " + name + ". It wasn't added.");
	   } else {
		   predators.add(animal);
		   System.out.println("[ANIMAL] "+ animal.getName() + " was added succefully to the predators list of " + name);
	       System.out.println("  ");
	       if (animal.isPrey(this) == false) {
	    	   animal.addPrey(this);
	       }
	   }
   }

   /**
	 * Add a new prey of the Animal
	 * 
	 * @param animal New prey of the object. Can't be *null*!  
	 */
   public void addPrey(Animal animal) {
	   if (animal == null) {
			throw new NullPointerException("null animal is not allowed");
	   }
	   if (preys.contains(animal)) {
		   System.out.println("[ANIMAL] "+ animal.getName() + " was already on the preys list of " + name + ". It wasn't added.");
	   } else {
		   preys.add(animal);
		   System.out.println("[ANIMAL] "+ animal.getName() + " was added succefully to the preys list of " + name);
		   System.out.println("  ");
		   if (animal.isPredator(this) == false) {
			   animal.addPredator(this);
		   }
	   }
   }

   public List<Animal> getPredadors() {
      return predators;
   }

   public List<Animal> getPreys() {
      return preys;
   }

	public String getName() {
		return name;
	}

   /**
	 * Updates the name of the Animal
	 * 
	 * @param newName New name of the object. Can't be *null*!  
	 */
	public void setNome(String newName) {
		this.name = newName;
	}
	
	public void showPreys() {
		System.out.println("[ANIMAL] Preys of " + name + ":");
        for (Animal prey : preys) {
            System.out.println("         " + prey.getName());
        }
        System.out.println("  ");
	}
	
	public void showPredators() {
		System.out.println("[ANIMAL] Predators of " + name + ":");
        for (Animal predator : predators) {
            System.out.println("         " + predator.getName());
        }
        System.out.println("  ");
		
	}
	
	public boolean isPrey(Animal animal) {
    	if (preys.contains(animal)) {
    		return true;
    	}
        return false;
	}
	
	public boolean isPredator(Animal animal) {
    	if (predators.contains(animal)) {
    		return true;
    	}
        return false;
	}
}
