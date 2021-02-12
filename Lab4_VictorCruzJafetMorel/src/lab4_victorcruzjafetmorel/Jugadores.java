/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_victorcruzjafetmorel;

import java.util.ArrayList;

/**
 *
 * @author 24661
 */
public abstract class Jugadores{
    String nom_jug,apodo,fav_fut, fav_bas,fav_play;
    int num_cam,a_nac,num_estre;
    boolean may_ed;
    ArrayList<Pateadores> pateadores= new ArrayList();
    ArrayList<Tiradores> tiradores= new ArrayList();

    public Jugadores(String nom_jug, String apodo, String fav_fut, String fav_bas, String fav_play, int num_cam, int a_nac, int num_estre, boolean may_ed) {
        this.nom_jug = nom_jug;
        this.apodo = apodo;
        this.fav_fut = fav_fut;
        this.fav_bas = fav_bas;
        this.fav_play = fav_play;
        this.num_cam = num_cam;
        this.a_nac = a_nac;
        this.setNum_estre(num_estre);
        this.may_ed = may_ed;
    }

    public Jugadores() {
    }

    public String getNom_jug() {
        return nom_jug;
    }

    public void setNom_jug(String nom_jug) {
        this.nom_jug = nom_jug;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getFav_fut() {
        return fav_fut;
    }

    public void setFav_fut(String fav_fut) {
        this.fav_fut = fav_fut;
    }

    public String getFav_bas() {
        return fav_bas;
    }

    public void setFav_bas(String fav_bas) {
        this.fav_bas = fav_bas;
    }

    public String getFav_play() {
        return fav_play;
    }

    public void setFav_play(String fav_play) {
        this.fav_play = fav_play;
    }

    public int getNum_cam() {
        return num_cam;
    }

    public void setNum_cam(int num_cam) {
        this.num_cam = num_cam;
    }

    public int getA_nac() {
        return a_nac;
    }

    public void setA_nac(int a_nac) {
        this.a_nac = a_nac;
    }

    public int getNum_estre() {
        return num_estre;
    }

    public void setNum_estre(int num_estre) {
        if (num_estre<=5&num_estre>=1) {
            this.num_estre = num_estre;
        }
    }

    public boolean isMay_ed() {
        return may_ed;
    }

    public void setMay_ed(boolean may_ed) {
        
        this.may_ed = may_ed;
    }

    public ArrayList<Pateadores> getPateadores() {
        return pateadores;
    }

    public void setPateadores(ArrayList<Pateadores> pateadores) {
        if(pateadores.size()<4){
            this.pateadores = pateadores;
        }
    }

    public ArrayList<Tiradores> getTiradores() {
        return tiradores;
    }

    public void setTiradores(ArrayList<Tiradores> tiradores) {
        if(tiradores.size()<3){
            this.tiradores = tiradores;
        }
    }
    
    

    @Override
    public String toString() {
        return "Jugadores{" + "nom_jug=" + nom_jug + ", apodo=" + apodo + ", fav_fut=" + fav_fut + ", fav_bas=" + fav_bas + ", fav_play=" + fav_play + ", num_cam=" + num_cam + ", a_nac=" + a_nac + ", num_estre=" + num_estre + ", may_ed=" + may_ed + ", pateadores=" + pateadores + ", tiradores=" + tiradores + '}';
    }
    
    public abstract boolean anotar();
        
    }