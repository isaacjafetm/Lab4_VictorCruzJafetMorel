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
public class Pateadores extends Jugadores {
    int hp, f, hr;
    
    public Pateadores() {
    }

    public Pateadores(int hp, int f, int hr) {
        this.setHp(hp);
        this.setF(f);
        this.setHr(hr);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp<=100&hp>=1){
            this.hp = hp;
        }
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        if(f<101&f>0){
            this.f = f;
        }
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        if(hr<101&hr>0){
            this.hr = hr;
        }
    }
    
    Random rand = new Random();
    @Override
    public boolean anotar(){
        boolean anota=true;
        double prob=(hr+hp+f)*0.65*super.num_estre/10;
        int numero=1+rand.nextInt(100);
        if(numero<=prob){
            return anota;
        }else{
            anota=false;
            return anota;
        }
        
    }
    
    
    
}
