/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;


/**
 *
 * @author Smart
 */
public class Mensaje {
    String mes = "empty_for_now";
    String who = "nobody_for_now";
	
    public Mensaje(String m, String w) {
	this.mes = m;
	this.who = w;
    }
	
    public String getMessage() {
	return this.mes;
    }
	
    public String getWho() {
	return this.who;
    }
}
