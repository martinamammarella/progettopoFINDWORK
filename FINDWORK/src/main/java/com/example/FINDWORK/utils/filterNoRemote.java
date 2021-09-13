package com.example.FINDWORK.utils;
import java.util.ArrayList;
import com.example.FINDWORK.model.Lavori;
/**
 * classe da cui istanziare oggetti per il filtraggio dei lavori che non possono essere svolti da remoto, deriva dalla classe Filters 
 * @author marty
 *
 */
public class filterNoRemote extends Filters {
	/*
	 * costruttore , richiama il costruttore della superclasse
	 */
	public filterNoRemote() {};
	/**
	 * metodo che effettua il filtraggio dei lavori che non possono essere svolti in remoto
	 * @param offerte non filtrate
	 * @return offerte filtrate
	 */
	public ArrayList<Lavori> filtraggio(ArrayList<Lavori> offerte) {
		ArrayList<Lavori> filtrato = new ArrayList<Lavori>();
		 for(Lavori z:offerte) {
				 if(z.getRemoto()!=true) {
				filtrato.add(z);
				 }
					 
			 }
		 
		 return filtrato;
	 }

}
