package primerTesta;
/*
Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
 Pored toga, klasa ima:
apstraktnu metodu štampaj
apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu.
 Metoda kao ulazni parametar prima objekat tipa Planina.

 Planinar(ID(int), imePrezime(String))
 metoda stampaj
 metoda clanarina
 metoda uspesan uspon
 */
public abstract class Planinar {
    private int id;
    private String imePrezime;

    public Planinar(){

    }

    public Planinar(int id, String imePrezime) {
        if(id>0){
            this.id = id;
        }else{
            System.err.println("id mora biti veci od nule");
        }

        this.imePrezime = imePrezime;
    }

    public int getId() {
        return id;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public abstract void stampaj();
    public abstract int clanarinaa();
    public abstract  boolean uspesanUspon(Planina planina);

}
