/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_hectorflores;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public final class Comment {
    int postId;
    String autor;
    String contenido;
    Calendar fecha;

    public Comment(int postId, String autor, String contenido) {
        this.postId = postId;
        this.autor = autor;
        this.contenido = contenido;
        this.fecha = Calendar.getInstance();
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
    public void print(){
        SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yy");
        
        JOptionPane.showMessageDialog(null, autor + " - " + simple.format(fecha.getTime()) + "\n" + contenido);
    }
}
