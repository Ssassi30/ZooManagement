package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private final static int nbrCages = 25;
    private Animal[] animals;

    // Constructeur avec validation du nom
    public Zoo(String name, String city) {
        setName(name);  // Utilisation du setter pour valider le nom
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    // Getter et Setter pour 'name' avec validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide.");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }

    // Ajouter un animal avec vérification
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein !");
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal est déjà présent dans le zoo !");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println("L'animal a été ajouté avec succès.");
                return true;
            }
        }
        System.out.println("Le zoo est plein, l'animal ne peut pas être ajouté.");
        return false;
    }

    // Affichage des animaux du zoo
    public void displayAnimals() {
        boolean isEmpty = true;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("Le zoo est vide !");
        }
    }

    // Recherche d'un animal par son nom
    int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // Supprimer un animal du zoo
    boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                animals[i] = null;
                return true;
            }
        }
        return false;
    }

    // Vérifier si le zoo est plein
    boolean isZooFull() {
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                count++;
                if (count == nbrCages) {
                    return true;
                }
            }
        }
        return false;
    }

    // Comparer deux zoos en fonction du nombre d'animaux
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        int countZ1 = 0;
        int countZ2 = 0;

        for (int i = 0; i < z1.animals.length; i++) {
            if (z1.animals[i] != null) {
                countZ1++;
            }
        }

        for (int i = 0; i < z2.animals.length; i++) {
            if (z2.animals[i] != null) {
                countZ2++;
            }
        }

        return countZ1 >= countZ2 ? z1 : z2;
    }
}
