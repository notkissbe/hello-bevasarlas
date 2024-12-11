package hu.notkissbe.bevasarlas;

public class Termek {
    String Nev;
    int mennyiseg;
    int darab_ar;
    String kategoria;

    public Termek(String nev, int mennyiseg, int darab_ar, String kategoria) {
        Nev = nev;
        this.mennyiseg = mennyiseg;
        this.darab_ar = darab_ar;
        this.kategoria = kategoria;
    }

    public String getNev() {
        return Nev;
    }

    public void setNev(String nev) {
        Nev = nev;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getDarab_ar() {
        return darab_ar;
    }

    public void setDarab_ar(int darab_ar) {
        this.darab_ar = darab_ar;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
}
