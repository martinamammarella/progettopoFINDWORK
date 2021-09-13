package com.example.FINDWORK.exception;
/**
 * classe che deriva dalla generica classe per la gestione delle eccezioni Exception, serve per generare eccezioni dovute ad una stringa errata(parametro)  inserita nella richiesta 
 * @author marty
 *
 */
public class parException extends Exception {
	/**
	 * costruttore della classe che richiama costruttore della superclasse 
	 * @param messaggio
	 */
 public parException(String messaggio) {
	 super(messaggio);
 }
}
