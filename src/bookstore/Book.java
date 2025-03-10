package bookstore;


public class Book {
    private String nazev;
    private int rokVydani;
    private int pocetstranek;
    private Zanr zanr;

    public Book(String nazev, int rokVydani, int pocetstranek, Zanr zanr) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.pocetstranek = pocetstranek;
        this.zanr = zanr;

    }

    public int getPocetstranek() {
        return pocetstranek;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public String getNazev() {
        return nazev;
    }

    public void printInfo(){
        System.out.println(nazev + ":" + zanr + ":" + rokVydani);
    }
}
