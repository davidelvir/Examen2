/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Playlist implements Serializable{
    private ArrayList<Cancion>canciones = new ArrayList();
    private String nombre;
    public Playlist() {
    }

    public Playlist(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    public void setCancion(Cancion c){
        this.canciones.add(c);
    }
    public Cancion getCancion(int x){
        return canciones.get(x);
    }
    public String toString(){
        return nombre;
    }
}
