package com.example.FINDWORK.exception;
/**
 * classe che deriva dalla generica classe per la gestione delle eccezioni Exception, serve per generare eccezioni dovute ad un jsonobject(object) errato inserito nella richiesta post
 * @author marty
 *
 */
public class bodyException  extends Exception {
	/**
	 * costruttore eccezione, che richiama costruttore della superclasse 
	 * @param messaggio
	 */
	public bodyException(String messaggio) {
		super(messaggio);
	}

}
