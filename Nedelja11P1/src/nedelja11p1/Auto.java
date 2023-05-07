
package nedelja11p1;
// import logger //  
import java.util.logging.Logger;

// klasa extenduje i implementira interfejs
public class Auto extends Vozilo implements Proveri{ 
// 8. insert construct
    public Auto(String marka, String model, String brojSasije, String registracija, int osnovnaCena, int snagaMotora) {
        super(marka, model, brojSasije, registracija, osnovnaCena, snagaMotora);
    }
// 9. override-ujemo boolean iz interfejsa i pravimo metodu
    @Override
    public boolean proveriRegistraciju(){
        boolean provera = false; 
        
        if(getRegistracija().length() == 10){
            if(getRegistracija().charAt(0) == 'A'
               
               && Character.isDigit(getRegistracija().charAt(1))
               && Character.isDigit(getRegistracija().charAt(2))
               && Character.isDigit(getRegistracija().charAt(3))
               && Character.isLowerCase(getRegistracija().charAt(8))
               && Character.isLowerCase(getRegistracija().charAt(9))){
                provera = true;
            }
        
        } 
        return provera;
    }  
    // 10. overridujemo drugu boolean i pravimo metodu
     @Override
    public boolean proveriBrojSasije() {
        
        boolean provera = false; 
        
        if(getBrojSasije().length() == 10){
            if(Character.isUpperCase(getBrojSasije().charAt(0)) 
             && Character.isUpperCase(getBrojSasije().charAt(1))
             && Character.isLowerCase(getBrojSasije().charAt(8))
             && Character.isLowerCase(getBrojSasije().charAt(9))){
                provera = true;
            }
        
        }
    
        return provera;
    } 
    // 11. overridujemo promenjivu iz klase i pravimo metodu
    @Override
    public int cena() {
         int izracunataCena = getOsnovnaCena() * 5; 
         if(getSnagaMotora() > 1500) 
             izracunataCena = getOsnovnaCena() * 15; 
         return izracunataCena;
    
    }
    
    
    
}
