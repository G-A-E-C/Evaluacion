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
   public String name;
   public int value;
   public String shape;
   public boolean used = false;
   public int id;
   public String symbol;
   public String nombre;
	
    public Carta(int n, String s, int z) {
	if (n > 1 && n < 11) {
            this.name = Integer.toString(n);
            this.value = n;
            this.symbol = this.name;
        } else if (n > 10) {
            this.value = 10;
            if (n == 11) {
                this.name = "Jack";
                this.symbol = "J";
            } else if (n == 12) {
                this.name = "Queen";
                this.symbol = "Q";
            } else if (n == 13) {
                this.name = "King";
                this.symbol = "K";
            }
        } else if (n == 1) {
            this.value = 1;
            this.name = "Ace";
            this.symbol = "A";
        }
        this.shape = s;
        this.id = z;
    //System.out.println("New Card : " + name + " of " + shape + " (id = " + id + ")");
    }
	
    public void setUsed() {
	used = true;
	//	System.out.println("The Card  " + name + " of " + shape + " is now used");
    }
	
    public void setNotUsed() {
	used = false;
	//	System.out.println("The Card  " + name + " of " + shape + " is now not used");
    }
}
