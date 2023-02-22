/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Smart
 */
public class Baraja {
    private List<Carta> cartas;
    private Random rand;

    public Baraja() {
        String[] palos = {"Corazones", "Diamantes", "Picas", "Tréboles"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        this.cartas = new ArrayList<Carta>();
        for (String palo : palos) {
            for (String valor : valores) {
                this.cartas.add(new Carta(palo, valor));
            }
        }

        this.rand = new Random();
    }

    public Carta sacarCarta() {
        int cartaIndex = this.rand.nextInt(this.cartas.size());
        Carta carta = this.cartas.get(cartaIndex);
        this.cartas.remove(cartaIndex);
        return carta;
    }
}
