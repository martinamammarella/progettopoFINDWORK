package com.example.FINDWORK.exception;
/**
 * classe che deriva dalla generica classe per la gestione delle eccezioni Exception, serve per generare eccezioni dovuti a inserimento nel jsonobject di linguaggi diversi da quelli scelti dal programmatore 
 * @author marty
 *
 */
public class linguaggiException extends Exception {
	/**
	 * costruttore, richiama costruttore superclasse
	 * @param messaggio
	 */
public linguaggiException(String messaggio) {
	super(messaggio);
}
}
