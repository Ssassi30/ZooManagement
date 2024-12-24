package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo zoo1 = new Zoo("Zoo1", "Tunis");
        Zoo zoo2 = new Zoo("Zoo2", "Sousse");

        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal tigre = new Animal("Félin", "Tigre", -3, true);  // Erreur d'âge

        zoo1.addAnimal(lion);
        zoo2.addAnimal(tigre);  // Ne sera pas ajouté à cause de l'âge invalide

        zoo1.displayAnimals();
        zoo2.displayAnimals();

        Zoo meilleurZoo = zoo1.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + meilleurZoo.getName());

        //Classes méres
        Aquatic aquatic = new Aquatic("DD","ss",5,false,"swi");
        Terrestrial terrestrial = new Terrestrial("F","AA",7,true,5);

        //Classes filles
        Dolphin dolphin = new Dolphin("d","slim",5,true,"anteractique",5);
        Penguin penguin = new Penguin("D","slim",8,false,"ital",4);

    }
}
