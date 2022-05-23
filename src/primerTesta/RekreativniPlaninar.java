package primerTesta;

import javax.sound.midi.Soundbank;

/*
Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
naziv okruga odakle je rekreativni planinar
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
 s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
Rekreativac, id: id
ime: ime prezime Okrug: okrug

RekreativniPLaninar (Planinar+ tezinaOpreme(int), okrug(String), maksUspon(int))
 */
public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String okrug;
    private int maksUspon;

    private int clanarina=1500;

    public RekreativniPlaninar(){

    }

    public RekreativniPlaninar(int id, String imePrezime, int tezinaOpreme, String okrug, int maksUspon){
        super(id, imePrezime);
        setTezinaOpreme(tezinaOpreme);
        this.okrug=okrug;
        setMaksUspon(maksUspon);
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        if(tezinaOpreme>=0){
            this.tezinaOpreme = tezinaOpreme;
        }else{
            System.err.println("Tezina opreme mora biti veca od nule");
        }

    }

    public String getOkrug() {
        return okrug;
    }

    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public int getMaksUspon() {
        return maksUspon;
    }

    public void setMaksUspon(int maksUspon) {
        if(maksUspon>0){
            this.maksUspon = maksUspon;
        }else{
            System.err.println("Maksimalni uspon mora biti veci od nule");
        }

    }

    public void stampaj(){
        System.out.println("Rekreativac: id "+this.getId());
        System.out.println("ime: "+this.getImePrezime()+", okrug: "+this.getOkrug());
    }

    public int clanarinaa(){
      return clanarina;
    }


  // da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
  // s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
    public boolean uspesanUspon(Planina planina){
        maksUspon-=(tezinaOpreme*50);
        if(maksUspon< planina.getVisina()){
            return false;
        }
        return true;
    }

}
