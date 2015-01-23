package kuutio.kuutio;

import java.util.*;

public class Kuutio {
    private int[] kuutio;
    
    public Kuutio(){   //luo uuden ratkaistussa tilassa olevan kuution
        this.kuutio = new int[49];
        for (int i = 0; i < 48; i++) {
            if( i < 8 ) this.kuutio[i] = 0;
            else if( i > 7 && i < 16 ) this.kuutio[i] = 1;
            else if( i > 15 && i < 24 ) this.kuutio[i] = 2;
            else if( i > 39 && i < 48 ) this.kuutio[i] = 3;
            else if( i > 23 && i < 32 ) this.kuutio[i] = 4;
            else if( i > 31 && i < 40 ) this.kuutio[i] = 5;
        }
    }
    
    public int[] getTila(){ //palauttaa kuution tämän hetkisen tilan
        return kuutio;
    }
    
    public void sekoita(){ //suorittaa 20 satunnaista siirtoa
        Random random = new Random();
        
        for (int i = 0; i < 20; i++) {
            int a = random.nextInt(12);
            if (a == 0) keltainenMyota();
            else if (a == 1) keltainenVasta();
            else if (a == 2) valkoinenMyota();
            else if (a == 3) valkoinenVasta();
            else if (a == 4) sininenMyota();
            else if (a == 5) sininenVasta();
            else if (a == 6) punainenMyota();
            else if (a == 7) punainenVasta();
            else if (a == 8) oranssiMyota();
            else if (a == 9) oranssiVasta();
            else if (a == 10) vihreäMyota();
            else if (a == 11) vihreäVasta();
        }
    }
    
    
    public void tulosta(){
        System.out.println("   "+this.kuutio[31]+this.kuutio[30]+this.kuutio[29]);
        System.out.println("   "+this.kuutio[24]+4+this.kuutio[28]);
        System.out.println("   "+this.kuutio[25]+this.kuutio[26]+this.kuutio[27]);
        System.out.println(""+this.kuutio[15]+this.kuutio[14]+this.kuutio[13]+this.kuutio[7]+this.kuutio[6]+this.kuutio[5]+this.kuutio[39]+this.kuutio[38]+this.kuutio[37]+this.kuutio[47]+this.kuutio[46]+this.kuutio[45]);
        System.out.println(""+this.kuutio[8]+1+this.kuutio[12]+this.kuutio[0]+0+this.kuutio[4]+this.kuutio[32]+5+this.kuutio[36]+this.kuutio[40]+3+this.kuutio[44]);
        System.out.println(""+this.kuutio[9]+this.kuutio[10]+this.kuutio[11]+this.kuutio[1]+this.kuutio[2]+this.kuutio[3]+this.kuutio[33]+this.kuutio[34]+this.kuutio[35]+this.kuutio[41]+this.kuutio[42]+this.kuutio[43]);
        System.out.println("   "+this.kuutio[23]+this.kuutio[22]+this.kuutio[21]);
        System.out.println("   "+this.kuutio[16]+2+this.kuutio[20]);
        System.out.println("   "+this.kuutio[17]+this.kuutio[18]+this.kuutio[19]);
    }
    
    //siirrot
    
    public void valkoinenMyota(){
        this.kuutio[48] = this.kuutio[0];
        this.kuutio[0] = this.kuutio[2];
        this.kuutio[2] = this.kuutio[4];
        this.kuutio[4] = this.kuutio[6];
        this.kuutio[6] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[26];
        this.kuutio[26] = this.kuutio[12];
        this.kuutio[12] = this.kuutio[22];
        this.kuutio[22] = this.kuutio[32];
        this.kuutio[32] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[7];
        this.kuutio[7] = this.kuutio[1];
        this.kuutio[1] = this.kuutio[3];
        this.kuutio[3] = this.kuutio[5];
        this.kuutio[5] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[25];
        this.kuutio[25] = this.kuutio[11];
        this.kuutio[11] = this.kuutio[21];
        this.kuutio[21] = this.kuutio[39];
        this.kuutio[39] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[13];
        this.kuutio[13] = this.kuutio[23];
        this.kuutio[23] = this.kuutio[33];
        this.kuutio[33] = this.kuutio[27];
        this.kuutio[27] = this.kuutio[48];
    }
    
    public void keltainenMyota(){
        this.kuutio[48] = this.kuutio[46];
        this.kuutio[46] = this.kuutio[40];
        this.kuutio[40] = this.kuutio[42];
        this.kuutio[42] = this.kuutio[44];
        this.kuutio[44] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[45];
        this.kuutio[45] = this.kuutio[47];
        this.kuutio[47] = this.kuutio[41];
        this.kuutio[41] = this.kuutio[43];
        this.kuutio[43] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[29];
        this.kuutio[29] = this.kuutio[35];
        this.kuutio[35] = this.kuutio[17];
        this.kuutio[17] = this.kuutio[15];
        this.kuutio[15] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[30];
        this.kuutio[30] = this.kuutio[36];
        this.kuutio[36] = this.kuutio[18];
        this.kuutio[18] = this.kuutio[8];
        this.kuutio[8] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[31];
        this.kuutio[31] = this.kuutio[37];
        this.kuutio[37] = this.kuutio[19];
        this.kuutio[19] = this.kuutio[9];
        this.kuutio[9] = this.kuutio[48];
        
    }
    
    public void punainenMyota(){
        this.kuutio[48] = this.kuutio[14];
        this.kuutio[14] = this.kuutio[8];
        this.kuutio[8] = this.kuutio[10];
        this.kuutio[10] = this.kuutio[12];
        this.kuutio[12] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[24];
        this.kuutio[24] = this.kuutio[44];
        this.kuutio[44] = this.kuutio[16];
        this.kuutio[16] = this.kuutio[0];
        this.kuutio[0] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[15];
        this.kuutio[15] = this.kuutio[9];
        this.kuutio[9] = this.kuutio[11];
        this.kuutio[11] = this.kuutio[13];
        this.kuutio[13] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[31];
        this.kuutio[31] = this.kuutio[43];
        this.kuutio[43] = this.kuutio[23];
        this.kuutio[23] = this.kuutio[7];
        this.kuutio[7] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[25];
        this.kuutio[25] = this.kuutio[45];
        this.kuutio[45] = this.kuutio[17];
        this.kuutio[17] = this.kuutio[1];
        this.kuutio[1] = this.kuutio[48];
    }
    
    public void oranssiMyota(){
        this.kuutio[48] = this.kuutio[38];
        this.kuutio[38] = this.kuutio[32];
        this.kuutio[32] = this.kuutio[34];
        this.kuutio[34] = this.kuutio[36];
        this.kuutio[36] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[37];
        this.kuutio[37] = this.kuutio[39];
        this.kuutio[39] = this.kuutio[33];
        this.kuutio[33] = this.kuutio[35];
        this.kuutio[35] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[5];
        this.kuutio[5] = this.kuutio[21];
        this.kuutio[21] = this.kuutio[41];
        this.kuutio[41] = this.kuutio[29];
        this.kuutio[29] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[4];
        this.kuutio[4] = this.kuutio[20];
        this.kuutio[20] = this.kuutio[40];
        this.kuutio[40] = this.kuutio[28];
        this.kuutio[28] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[3];
        this.kuutio[3] = this.kuutio[19];
        this.kuutio[19] = this.kuutio[47];
        this.kuutio[47] = this.kuutio[27];
        this.kuutio[27] = this.kuutio[48];
    }
    
    public void sininenMyota(){
        this.kuutio[48] = this.kuutio[22];
        this.kuutio[22] = this.kuutio[16];
        this.kuutio[16] = this.kuutio[18];
        this.kuutio[18] = this.kuutio[20];
        this.kuutio[20] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[21];
        this.kuutio[21] = this.kuutio[23];
        this.kuutio[23] = this.kuutio[17];
        this.kuutio[17] = this.kuutio[19];
        this.kuutio[19] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[2];
        this.kuutio[2] = this.kuutio[10];
        this.kuutio[10] = this.kuutio[42];
        this.kuutio[42] = this.kuutio[34];
        this.kuutio[34] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[3];
        this.kuutio[3] = this.kuutio[11];
        this.kuutio[11] = this.kuutio[43];
        this.kuutio[43] = this.kuutio[35];
        this.kuutio[35] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[1];
        this.kuutio[1] = this.kuutio[9];
        this.kuutio[9] = this.kuutio[41];
        this.kuutio[41] = this.kuutio[33];
        this.kuutio[33] = this.kuutio[48];
    }
    
    public void vihreäMyota(){
        this.kuutio[48] = this.kuutio[30];
        this.kuutio[30] = this.kuutio[24];
        this.kuutio[24] = this.kuutio[26];
        this.kuutio[26] = this.kuutio[28];
        this.kuutio[28] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[31];
        this.kuutio[31] = this.kuutio[25];
        this.kuutio[25] = this.kuutio[27];
        this.kuutio[27] = this.kuutio[29];
        this.kuutio[29] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[7];
        this.kuutio[7] = this.kuutio[39];
        this.kuutio[39] = this.kuutio[47];
        this.kuutio[47] = this.kuutio[15];
        this.kuutio[15] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[6];
        this.kuutio[6] = this.kuutio[38];
        this.kuutio[38] = this.kuutio[46];
        this.kuutio[46] = this.kuutio[14];
        this.kuutio[14] = this.kuutio[48];
        
        this.kuutio[48] = this.kuutio[5];
        this.kuutio[5] = this.kuutio[37];
        this.kuutio[37] = this.kuutio[45];
        this.kuutio[45] = this.kuutio[13];
        this.kuutio[13] = this.kuutio[48];
        
    }
    
    public void valkoinenVasta(){
        valkoinenMyota();
        valkoinenMyota();
        valkoinenMyota();
    }
    
    public void keltainenVasta(){
        keltainenMyota();
        keltainenMyota();
        keltainenMyota();
    }
    
    public void punainenVasta(){
        punainenMyota();
        punainenMyota();
        punainenMyota();
    }
    
    public void oranssiVasta(){
        oranssiMyota();
        oranssiMyota();
        oranssiMyota();
    }
    
    public void sininenVasta(){
        sininenMyota();
        sininenMyota();
        sininenMyota();
    }
    
    public void vihreäVasta(){
        vihreäMyota();
        vihreäMyota();
        vihreäMyota();
    }
}
