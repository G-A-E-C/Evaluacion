/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package games;

import games.gui.MainFrame;

/**
 *
 * @author Smart
 */
public class Main implements Runnable{
    long xTime = System.nanoTime();
    public static boolean terminator = false;
    public static int pWins = 0;
    public static int dWins = 0;
	
	//screen refresh rate
    public int Hz = 100;
	
    MainFrame gui = new MainFrame();
	
    public static void main(String[] args) {
	new Thread(new Main()).start();
    }
	
    @Override
    public void run() {
	while(terminator == false) {
            if (System.nanoTime() - xTime >= 1000000000/Hz) {
                gui.refresher();
                gui.repaint();
                xTime = System.nanoTime();
            }
        }
    }
}
