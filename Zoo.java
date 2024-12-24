public class Zoo {
    String name;
    String city;
    final static int  nbrCages = 25;
    Animal[] animals;
    public Zoo() {}

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }

    // Ajout
    boolean addAnimal(Animal animal) {

        if (searchAnimal(animal)!=-1)
        {
            System.out.println("cet animal est deja present");
            return false;
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null ) {
                animals[i] = animal;
                return true;
            }
        }
        System.out.println("Le zoo est plein !");
        return false;
    }

    // Affichae
    void displayAnimals() {
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

    //Recherche
    int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    //Supression
    boolean removeAnimal(Animal animal)
    {
        for( int i=0; i<animals.length ; i++)
        {
            if (animals[i]!=null && animals[i].name.equals(animal.name))
            {
                animals[i] = null;
                return true;
            }
        }
        return false;
    }

    //verifier si le zoo est plein
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

    Zoo comparerZoo(Zoo z1, Zoo z2) {
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
