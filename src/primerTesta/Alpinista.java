package primerTesta;
/*
Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost)
 i poeni se mogu menjati kroz adekvatnu metodu.
  Alpinista može da savlada sve uspone do 4000 metara,
  placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
Alpinista, id: id
ime: ime i prezime
Broj poena: poeni

Alpinista(Planinar+ poeni(int), maksUspon=4000)
 */
public class Alpinista extends Planinar{
    private int poeni;
    private int maksUspon=4000;

    private int clanarina=1500;

    public Alpinista(){

    }

    public Alpinista(int id, String imePrezime, int poeni){
        super(id, imePrezime);
        this.poeni=poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        if(poeni>=0){
            this.poeni = poeni;
        }else{
            System.err.println("Poeni moraju biti nula ili veci od nule");
        }

    }

    public int getMaksUspon() {
        return maksUspon;
    }



    public void stampaj(){
        System.out.println("Alpinista: id "+getId());
        System.out.println("Ime: "+getImePrezime());
        System.out.println("Broj poena: "+poeni);
    }

    public int clanarinaa(){
        clanarina-=(poeni*50);
        if(clanarina>=0){
            return clanarina;
        }
        return 0;


    }

    public boolean uspesanUspon(Planina planina){
        if(planina.getVisina()>maksUspon){
            return false;
        }
        return true;
    }

}
