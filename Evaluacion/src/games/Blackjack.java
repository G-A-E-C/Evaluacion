/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Smart
 */
public class Blackjack {
    private Usuario usuario;
    private Baraja baraja;
    private List<Carta> mano;

    public Blackjack() {
        this.usuario = new Usuario();
        this.baraja = new Baraja();
        this.mano = new ArrayList<Carta>();
    }

    public void jugar() {
        System.out.println("¡Bienvenido al juego de Blackjack!");
        while (true) {
            // Inicializar la mano
            this.mano.clear();
            this.mano.add(this.baraja.sacarCarta());
            this.mano.add(this.baraja.sacarCarta());

            // Mostrar la mano
            System.out.println("Tu mano es:");
            for (Carta carta : this.mano) {
                System.out.println(" - " + carta);
            }

            // Pedir más cartas
            while (true) {
                int total = this.calcularTotal();
                if (total > 21) {
                    System.out.println("Te pasaste de 21, pierdes.");
                    return;
                } else if (total == 21) {
                    System.out.println("¡Blackjack! Ganaste.");
                    this.usuario.ganaPunto();
                    return;
                }

                System.out.print("¿Quieres otra carta? (s/n) ");
                Scanner scanner = new Scanner(System.in);
                String respuesta= scanner.nextLine();
            if (respuesta.equals("s")) {
                Carta carta = this.baraja.sacarCarta();
                this.mano.add(carta);
                System.out.println("Recibiste la carta " + carta);
            } else {
                break;
            }
        }

        // Jugar la mano del dealer
        System.out.println("Turno del dealer.");
        while (true) {
            int total = this.calcularTotal();
            if (total > 21) {
                System.out.println("El dealer se pasó de 21, ganaste.");
                this.usuario.ganaPunto();
                break;
            } else if (total >= 17) {
                int usuarioTotal = this.calcularTotal();
                if (total > usuarioTotal) {
                    System.out.println("El dealer ganó.");
                } else if (total < usuarioTotal) {
                    System.out.println("Ganaste.");
                    this.usuario.ganaPunto();
                } else {
                    System.out.println("Empate.");
                }
                break;
            } else {
                Carta carta = this.baraja.sacarCarta();
                this.mano.add(carta);
                System.out.println("El dealer recibió la carta " + carta);
            }
        }

        // Mostrar los puntos
        System.out.println("Tienes " + this.usuario.getPuntos() + " puntos.");
        System.out.print("¿Quieres jugar otra vez? (s/n) ");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (!respuesta.equals("s")) {
            System.out.println("Gracias por jugar.");
            break;
        }
    }
}

    private int calcularTotal() {
        int total = 0;
        int numAces = 0;
        for (Carta carta : this.mano) {
            total += carta.getValorNumerico();
            if (carta.getValorNumerico() == 11) {
                numAces++;
            }
        }
        while (total > 21 && numAces > 0) {
            total -= 10;
            numAces--;
        }
        return total;
    }
}
