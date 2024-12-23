import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = scanner.nextLine();
        
        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez entrer un nombre valide pour les cages : ");
            scanner.next();
        }
        zoo.nbrCages = scanner.nextInt();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        scanner.close();
    }
}
