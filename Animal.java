public class Animal {

    int wiek;
    int nogi;
    String nazwa;

    public Animal(int wiek, int nogi, String nazwa) {
        this.wiek = wiek;
        this.nogi = nogi;
        this.nazwa = nazwa;
    }

    void napisz(){
        System.out.println("jest to zwierze "+ nazwa +"w wieku "+ wiek +"o liczbie nog: "+ nogi);
    }

}
