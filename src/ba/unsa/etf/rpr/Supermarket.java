package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Supermarket {

    private Artikl[] artikli= new Artikl[1000];
    private int vel=0;

    public void dodajArtikl(Artikl artikal){
        artikli[vel]=artikal;
        vel=vel+1;

    }

    public Artikl[] getArtikli() {return artikli;}
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0; i<vel; i++){
            int pom=Integer.parseInt(artikli[i].getKod());
            if(pom==Integer.parseInt(kod)){
                Artikl vrati=artikli[i];
                System.arraycopy(artikli, i+1, artikli, i, vel-i);
                vel=vel-1;
                return vrati;
            }
        }
        return null;
    }
    public int getVel() {return vel;}
}
