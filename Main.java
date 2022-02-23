public class Main {

    public static void main(String[] args) {

        Animal czlowiek = new Animal(33,2,"czlowiek");
        Animal pies = new Animal (4,4,"pies");

        czlowiek.napisz();
        pies.napisz();


        Czlowiek JanKowalski = new Czlowiek(33,2,"czlowiek", "Jan", "Kowalski");

        JanKowalski.przedstawsie();

    }
}
