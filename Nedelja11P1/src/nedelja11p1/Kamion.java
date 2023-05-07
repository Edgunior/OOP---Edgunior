
package nedelja11p1;

// klasa extenduje i implementira interfejs
public class Kamion extends Vozilo implements Proveri{ 
// 12. insert constructors
    public Kamion(String marka, String model, String brojSasije, String registracija, int osnovnaCena, int snagaMotora) {
        super(marka, model, brojSasije, registracija, osnovnaCena, snagaMotora);
    }
    
// 13. override pravimo metodu na osnovu prvu boolean iz interfejsa  
    @Override
    public boolean proveriRegistraciju(){
        boolean provera = false; 
        
        if(getRegistracija().length() == 12){
            if(getRegistracija().charAt(0) == 'K'
               && getRegistracija().charAt(1) == 'A' 
               && Character.isDigit(getRegistracija().charAt(2))
               && Character.isDigit(getRegistracija().charAt(3))
               && Character.isDigit(getRegistracija().charAt(4))
               && Character.isLowerCase(getRegistracija().charAt(10))
               && Character.isLowerCase(getRegistracija().charAt(11))){
                provera = true;
            }
        
        } 
        return provera;
    } 
// 14. override pravimo metodu na osnovu drugu boolean iz interfejsa   
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
    // 15. override promenjivu iz klase pravimo metodu
    @Override
    public int cena() {
        int izracunataCena  = getOsnovnaCena() * 12; 
        if(getSnagaMotora() > 2000) 
            izracunataCena = getOsnovnaCena() * 20; 
        return izracunataCena;
    
    }
    
}
