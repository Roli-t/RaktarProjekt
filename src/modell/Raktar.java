
package modell;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;


public class Raktar implements Iterable<Elelmiszer>, Serializable{

    
    public Raktar() throws Exception {
        try {
            Elelmiszer e1 = new Elelmiszer("Kenyér", "Pékség",LocalDate.of(2023, 1, 8)) {};
            Elelmiszer e2 = new Elelmiszer("Ropi", "Bolt") {};
            Konzerv k3 = new Konzerv("Finom májkrém","Májkrém", "Auchan",LocalDate.of(2022, 11, 8)) {};
            Konzerv k4 = new Konzerv("Friss",new File("recept.txt"),"Kávé", "Auchan",LocalDate.of(2022, 11, 8)) {};
            throw new Exception();
        } catch (HibasDatumException e) {
           
            e.getMessage();
        }
        }

    @Override
    public Iterator<Elelmiszer> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
