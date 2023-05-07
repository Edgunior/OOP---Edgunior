
package nedelja11p1;

// 3. napraviti zadate promenjive koje su uvek privatne
// klasa implementira interfejs
public abstract class Vozilo implements Proveri{ 
    
   
    private String marka, model, brojSasije, registracija; 
    private int osnovnaCena, snagaMotora; 

    // 4. insert constructor
    
    public Vozilo(String marka, String model, String brojSasije, String registracija, int osnovnaCena, int snagaMotora) {
        this.marka = marka;
        this.model = model;
        this.brojSasije = brojSasije;
        this.registracija = registracija;
        this.osnovnaCena = osnovnaCena;
        this.snagaMotora = snagaMotora;
    }

    // 5. insert getere
    
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getBrojSasije() {
        return brojSasije;
    }

    public String getRegistracija() {
        return registracija;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public int getSnagaMotora() {
        return snagaMotora;
    }
    
    // 6. abstract promenjiva za kasniju metodu
    
    abstract int cena();
    
}
// 7. napraviti dve obicne klase