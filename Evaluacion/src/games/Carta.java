/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

/**
 *
 * @author Smart
 */
public class Carta {
    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public int getValorNumerico() {
        if (this.valor.equals("A")) {
            return 11;
        } else if (this.valor.equals("J") || this.valor.equals("Q") || this.valor.equals("K")) {
            return 10;
        } else {
            return Integer.parseInt(this.valor);
        }
    }

    public String toString() {
        return this.valor + " de " + this.palo;
    }
}
