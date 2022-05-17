
package modell;

import java.io.File;
import java.time.LocalDate;


public class Konzerv extends Elelmiszer{
    public String leiras;
    public File ajanlas;


    public Konzerv(String leiras, String nev, String gyarto) throws HibasDatumException {
        super(nev, gyarto);
        this.leiras = leiras;
    }

    public Konzerv(String leiras, String nev, String gyarto, LocalDate lejaratiDatum) throws HibasDatumException {
        super(nev, gyarto, lejaratiDatum);
        this.leiras = leiras;
    }

    public Konzerv(String leiras, File ajanlas, String nev, String gyarto, LocalDate lejaratiDatum) throws HibasDatumException {
        super(nev, gyarto, lejaratiDatum);
        this.leiras = leiras;
        this.ajanlas = ajanlas;
    }
    
    public void receptetMutat(){
        if(ajanlas.exists()){
            System.out.println("Létezik a fájl.");
        }
    }

    @Override
    public String toString() {
        return "Konzerv{" + "leiras=" + leiras + ", ajanlas=" + ajanlas + '}';
    }
    
}
