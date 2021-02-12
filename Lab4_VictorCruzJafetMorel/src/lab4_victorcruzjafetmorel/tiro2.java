/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_victorcruzjafetmorel;

/**
 *
 * @author 24661
 */
public class tiro2 extends Tiradores{
    @Override
    public boolean anotar(){
        boolean anota=true;
        double prob=(super.getTiro_2()+super.getMan_balon())*0.90*super.num_estre/10;
        int numero = 1+ rand.nextInt(100);
        if(numero<=prob){
            return anota;
        }else{
            anota=true;
            return anota;
        }
    }
}
