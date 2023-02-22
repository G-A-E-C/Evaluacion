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

    public Usuario() {
        this.puntos = 0;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void ganaPunto() {
        this.puntos++;
    }
    
}
