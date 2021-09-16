package com.example.FINDWORK.exception;
/**
 * classe che estende la superclasse exception, genera eccezioni dovute all'inserimento errato del parametro
 * @author marty
 *
 */
public class parException extends Exception {
	/**
	 * costruttore, richiama quello della superclasse
	 */
 public parException(String messaggio) {
	 
	  
	 super(messaggio);
 }
}
