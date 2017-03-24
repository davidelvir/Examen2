/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class adminUsuario {
    private ArrayList<Usuario>usuarios = new ArrayList();
    private File archivo = null;
    
    public adminUsuario(String path){
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setUsuario(Usuario a){
        usuarios.add(a);
    }
    public void cargarArchivo(){
        try {
            usuarios = new ArrayList();
            Usuario temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Usuario)objeto.readObject())!=null){
                        usuarios.add(temp);
                    }
                } catch (EOFException e) {
                   
                }
                objeto.close();
                entrada.close();
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for(Usuario t : usuarios){
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
