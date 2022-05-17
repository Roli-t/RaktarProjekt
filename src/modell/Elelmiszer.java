
package modell;

import java.io.Serializable;
import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;

 class RendezesNevSzerint implements Comparator<Elelmiszer>{
     @Override
     public int compare(Elelmiszer e1, Elelmiszer e2){
         Collator coll = Collator.getInstance();
         return coll.compare(e1.getNev(), e2.getNev());
     }
}

class RendezesGyartoSzerint implements Comparator<Elelmiszer>{
     @Override
     public int compare(Elelmiszer e1, Elelmiszer e2){
         Collator coll = Collator.getInstance();
         return coll.compare(e1.getGyarto(), e2.getGyarto());
     }
}



public abstract class Elelmiszer implements Serializable{
    private String nev, gyarto;
    private LocalDate lejaratiDatum;

    public Elelmiszer(String nev, String gyarto) throws HibasDatumException {
        LocalDate aktDatum = LocalDate.now();
        this.nev = nev;
        this.gyarto = gyarto;
        lejaratiDatum = aktDatum.plusYears(1);
    }

    public Elelmiszer(String nev, String gyarto, LocalDate lejaratiDatum) throws HibasDatumException {
        this.nev = nev;
        this.gyarto = gyarto;
        this.lejaratiDatum = lejaratiDatum;
    }
    
    public static void lejarat(LocalDate lejaratiDatum) throws HibasDatumException{
        if (lejaratiDatum==LocalDate.now() || lejaratiDatum.isBefore(LocalDate.now())){
            throw new HibasDatumException("lejárt élelmiszer");
        }
    }
    

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }

    public LocalDate getLejaratiDatum() {
        return lejaratiDatum;
    }

    @Override
    public String toString() {
        return "Elelmiszer{" + "nev=" + nev + ", gyarto=" + gyarto + ", lejaratiDatum=" + lejaratiDatum + '}';
    }
    
    
    
}
