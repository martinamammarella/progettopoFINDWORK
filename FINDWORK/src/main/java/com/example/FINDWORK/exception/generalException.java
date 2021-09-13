package com.example.FINDWORK.exception;
import java.lang.*;
/**
 * classe per la generazione di eccezioni generiche, deriva dalla classe generica Exception
 * @author marty
 *
 */
public class generalException extends Exception{
	/**
	 * costruttore della classe, richiama costruttore della superclasse
	 * @param messaggio
	 */
	 public generalException(String messaggio) {
		 super(messaggio);
	 }

}
