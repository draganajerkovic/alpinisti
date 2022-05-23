package primerTesta;
/*
Kreirati klasu Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
 Klasa mora imati konstruktore i getere i setere.

 Planina(ime(String), drzava(String), visina(int))
 */
public class Planina {
    private String ime;
    private String drzava;
    private int visina;

    public Planina(){

    }

    public Planina(String ime, String drzava, int visina) {
        this.ime = ime;
        this.drzava = drzava;
        setVisina(visina);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        if (visina>0) {
            this.visina = visina;
        }else{
            System.err.println("Visina mora biti veca od nule");
        }
    }

    @Override
    public String toString() {
        return  ime + " " + drzava + " " + visina;
    }
}
