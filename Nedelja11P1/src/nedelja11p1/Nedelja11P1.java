
package nedelja11p1; 
// import array list
import java.util.ArrayList;

public class Nedelja11P1 {
  // 1. Napraviti interfejs proveri
    public static void main(String[] args) { 
      // 16. array lista, dodajemo vozila na osnovu zadatih atributa
        ArrayList<Vozilo> vozila = new ArrayList<>(); 
        vozila.add(new Auto("Tesla", "Model 3", "TE123456jp", "A123hjklrr", 2000, 2000));
        vozila.add(new Auto("BMW", "Z3", "BW123456jp", "A123hjklrr", 1000, 2000));
        vozila.add(new Kamion("K1", "K1", "Jdf03423", "Def", 1000, 2000)); 
        
       // izracunat max 
        
        int max = 0; 
        
        for(Vozilo v : vozila) {
            if(v.proveriRegistraciju()) {
                if(v.getSnagaMotora() > max) 
                    max = v.getSnagaMotora();
            }
        } 
        
        System.out.println("Max je " + max);
        
    }
    
}
