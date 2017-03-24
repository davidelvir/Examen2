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
public class Usuario implements Serializable{
    private String nombre;
    private String user;
    private int edad;
    private String password;
    private ArrayList<Playlist>playlists = new ArrayList();
    private Playlist favoritos;

    public Usuario(String nombre, String user, int edad, String password) {
        this.nombre = nombre;
        this.user = user;
        this.edad = edad;
        this.password = password;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }
    public void setFavorito(Cancion c){
        this.favoritos.setCancion(c);
    }
    public Playlist getFavoritos() {
        return favoritos;
    }
    public Cancion getFavorita(int x) {
        return favoritos.getCancion(x);
    }
    public void setFavoritos(Playlist favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
