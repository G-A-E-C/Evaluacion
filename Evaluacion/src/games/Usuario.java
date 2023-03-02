/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package games;

/**
 *
 * @author Smart
 */
public class Usuario {
    private int puntos;
    private String correo;
    private String password;
    private String nombre;
    
    public Usuario() {
        this.puntos = 0;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void ganaPunto() {
        this.puntos++;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
