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
public class Equipos {
    String nombre_e,Estadio,Pais,entrenador_n,nombre_due,nombre_mas,fecha_crea,Color;
    ArrayList <Jugadores> jugadores = new ArrayList();

    public Equipos(String nombre_e, String Estadio, String Pais, String entrenador_n, String nombre_due, String nombre_mas, String fecha_crea, String Color) {
        this.nombre_e = nombre_e;
        this.Estadio = Estadio;
        this.Pais = Pais;
        this.entrenador_n = entrenador_n;
        this.nombre_due = nombre_due;
        this.nombre_mas = nombre_mas;
        this.fecha_crea = fecha_crea;
        this.Color = Color;
    }

    public Equipos() {
    }

    public String getNombre_e() {
        return nombre_e;
    }

    public void setNombre_e(String nombre_e) {
        this.nombre_e = nombre_e;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getEntrenador_n() {
        return entrenador_n;
    }

    public void setEntrenador_n(String entrenador_n) {
        this.entrenador_n = entrenador_n;
    }

    public String getNombre_due() {
        return nombre_due;
    }

    public void setNombre_due(String nombre_due) {
        this.nombre_due = nombre_due;
    }

    public String getNombre_mas() {
        return nombre_mas;
    }

    public void setNombre_mas(String nombre_mas) {
        this.nombre_mas = nombre_mas;
    }

    public String getFecha_crea() {
        return fecha_crea;
    }

    public void setFecha_crea(String fecha_crea) {
        this.fecha_crea = fecha_crea;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        if(jugadores.size()<6){
            this.jugadores = jugadores;
        }
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre_e=" + nombre_e + ", Estadio=" + Estadio + ", Pais=" + Pais + ", entrenador_n=" + entrenador_n + ", nombre_due=" + nombre_due + ", nombre_mas=" + nombre_mas + ", fecha_crea=" + fecha_crea + ", Color=" + Color + ", jugadores=" + jugadores + '}';
    }
    
    
}
