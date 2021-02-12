/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_victorcruzjafetmorel;

import java.util.Random;

/**
 *
 * @author 24661
 */
public class Tiradores extends Jugadores {
    private int tiro_tres, tiro_2, man_balon;

    public Tiradores() {
    }

    public Tiradores(int tiro_tres, int tiro_2, int man_balon) {
        this.setTiro_tres(tiro_tres);
        this.setTiro_2(tiro_2);
        this.setMan_balon(man_balon);
    }

    public int getTiro_tres() {
        return tiro_tres;
    }

    public void setTiro_tres(int tiro_tres) {
        if(tiro_tres<=100&tiro_tres>=1){
            this.tiro_tres = tiro_tres;
        }
    }

    public int getTiro_2() {
        return tiro_2;
    }

    public void setTiro_2(int tiro_2) {
        if(tiro_2<=100&tiro_2>=1){
            this.tiro_2 = tiro_2;
        }
    }

    public int getMan_balon() {
        return man_balon;
    }

    public void setMan_balon(int man_balon) {
        if(man_balon<=100&man_balon>=1){
            this.man_balon = man_balon;
        }
    }
    
    Random rand = new Random();
    @Override
    public boolean anotar(){
        boolean anota=true;
        double prob=(tiro_tres+man_balon)*0.90*num_estre/10;
        int numero = 1+ rand.nextInt(100);
        if(numero<=prob){
            return anota;
        }else{
            anota=true;
            return anota;
        }
    }
    
    /*public boolean anotar2(){
        boolean anota=true;
        double prob=(tiro_2+man_balon)*0.95*num_estre/10;
        int numero = 1+ rand.nextInt(100);
        if(numero<=prob){
            return anota;
        }else{
            anota=true;
            return anota;
        }
    }*/
    
}
