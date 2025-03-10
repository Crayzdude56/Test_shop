package bookstore;
import java.util.Scanner;


public class BookStore {
    private String name;
    private Book[] books;
    public BookStore(String name) {
        this.name = name;
    }

    public void addBoooks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet knih kolik chces pridat");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("Nazev: ");
            String nazev = sc.nextLine();

            System.out.println("Rok vydani: ");
            int rokVydani = sc.nextInt();
            sc.nextLine();

            System.out.println("Pocet stran: ");
            int pocetstranek = sc.nextInt();
            sc.nextLine();

            System.out.println("Zanr: roman,scifi,detektivka");
            String zanrString = sc.nextLine();
            Zanr zanr =Zanr.valueOf(zanrString.toUpperCase());

            Book book = new Book(nazev, rokVydani, pocetstranek, zanr);
            books[i] = book;

        }
        sc.close();
    }


    public void printInfo(){
        System.out.println("-----INFO O KNIHKUPECTVI-----");
        System.out.println("Nazev: " + name);
        System.out.println("Na sklade mame tyhle knihy:");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getNazev());
            System.out.println(books[i].getZanr());
            System.out.println(books[i].getRokVydani());

        }
        System.out.println("-----");
    }




    public void najdinejkratsikniha(){
        if (books.length == 0){
            System.out.print("prazdne");
            return;
        }

        int nejkratsikniha = books.length - 1;
        for (Book book : books) {
            if (book.getPocetstranek() < nejkratsikniha){
                nejkratsikniha = book.getPocetstranek();
            }
        }
        System.out.print("Pocet stranek nejkratsi knihy jsou:"+nejkratsikniha);
    }
}
