/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author David
 */
public class Hilo_Play extends Thread{
    private JLabel hora;
    private Cancion c;
    private boolean vive;
    private JProgressBar b;
    public Hilo_Play(JLabel hora, Cancion c, JProgressBar b){
        this.hora = hora;
        this.c = c;
        this.b = b;
        vive = true;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }

    public Cancion getC() {
        return c;
    }

    public void setC(Cancion c) {
        this.c = c;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run() {
        int playing = 0;
        int f = c.getDuracion();
        System.out.println(f);
        while(vive){
            playing++;
            String p ="";
            p+=playing;
            hora.setText(p);
            b.setValue(playing);
            if(playing == c.getDuracion()){
                vive = false;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
