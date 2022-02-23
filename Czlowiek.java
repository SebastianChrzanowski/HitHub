public class Czlowiek extends Animal {
    String imie;
    String nazwisko;

    public Czlowiek(int wiek, int nogi, String nazwa) {
        super(wiek, nogi, nazwa);
    }

    public Czlowiek(int wiek, int nogi, String nazwa, String imie, String nazwisko) {
        super(wiek, nogi, nazwa);
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    void przedstawsie(){
        System.out.println("mam lat "+wiek+ " nazywam sie " + imie + " " + nazwisko);
    }

}


