public class Zoo {
    String name;
    String city;
    int nbrCages;
    Animal [] animals;
    public Zoo() {

    }
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages +  "]";
    }
}
