package kuutio.kuutio;

import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        
    Kuutio k = new Kuutio();
    
    int[] kuutio = k.getTila();
        k.tulosta();
        
        System.out.println("");
        
        k.valkoinenMyota();
        k.valkoinenVasta();
        
        k.keltainenMyota();
        k.keltainenVasta();
        
        k.oranssiMyota();
        k.oranssiVasta();
        
        k.sininenMyota();
        k.sininenVasta();
        
        k.punainenMyota();
        k.punainenVasta();
        
        k.vihreäMyota();
        k.vihreäVasta();
        
        k.tulosta();
        
    }
    

    
}
