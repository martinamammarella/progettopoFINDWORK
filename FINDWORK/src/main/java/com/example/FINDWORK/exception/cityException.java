package com.example.FINDWORK.exception;
/**
 * classe che deriva dalla generica classe per la gestione delle eccezioni Exception, serve per generare eccezioni dovute città nel jsonobject diverse da quelle scelte dal programmatore
 * @author marty
 *
 */
public class cityException  extends Exception{
	/**
	 * costruttore, richiama quello delle superclasse
	 * @param messaggio
	 */
	public cityException( String messaggio) {
		super(messaggio);
	}

}
