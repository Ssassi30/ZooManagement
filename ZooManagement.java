public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Belvedere", "Tunis");
        Zoo zoo2 = new Zoo("Friguia", "Hammamet");

        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal tigre = new Animal("Félin", "Tigre", 4, true);

        // Ajouter des animaux au zoo1
        zoo1.addAnimal(lion);

        // Ajouter des animaux au zoo2
        zoo2.addAnimal(tigre);
        zoo2.addAnimal(new Animal("Oiseau", "Perroquet", 2, false));

        // Vérifier si les zoos sont pleins
        System.out.println("Zoo 1 est plein ? " + zoo1.isZooFull());
        System.out.println("Zoo 2 est plein ? " + zoo2.isZooFull());

        // Comparer les deux zoos
        Zoo zooPlusPeuple = zoo1.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooPlusPeuple.name);
    }
}
