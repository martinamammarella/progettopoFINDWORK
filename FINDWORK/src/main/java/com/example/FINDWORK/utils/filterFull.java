package com.example.FINDWORK.utils;
import com.example.FINDWORK.model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import org.json.simple.*;
/**
 * classe da cui istanziare oggetti per il filtraggio part-time/full-time, deriva dalla classe Filters 
 * @author marty
 *
 */
public class filterFull extends Filters {
	/**
	 * costruttore, richiama costruttore della superclasse
	 */
	public filterFull() {};
	/**
	 * metodo per il filtraggio dei lavori in base al tipo di contratto part-time/full-time
	 * @param offerte non filtrate
	 * @return offerte filtrate in base al tipo di contratto
	 */
 public ArrayList<Lavori> filtraggio(ArrayList<Lavori> offerte) {
	 ArrayList<Lavori> filtrato = new ArrayList<Lavori>();
	 for(Lavori z:offerte) {
		    if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
			filtrato.add(z);}
 }
	return filtrato;
}
 }
