package com.example.FINDWORK.utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import com.example.FINDWORK.model.Lavori;
import org.json.simple.JSONArray;
/**
 * classe da cui istanziare oggetti per il filtraggio in base alla possibilità di svolgere lavori in remoto , deriva dalla classe Filters 
 * @author marty
 *
 */
public class filterRemote extends Filters{
	/**
	 * costruttore, richiama costruttore superclasse
	 */
	public filterRemote() {};
	/**
	 * metodo che effettua il filtraggio dei lavori che possono essere svolti in remoto
	 * @param offerte non filtrate
	 * @return offerte filtrate 
	 */
	public ArrayList<Lavori> filtraggio(ArrayList<Lavori> offerte) {
		ArrayList<Lavori> filtrato = new ArrayList<Lavori>();
		 for(Lavori z:offerte) {
				 if(z.getRemoto()==true) {
				filtrato.add(z);
				 }
					 
			 }
		 
		 return filtrato;
	 }
}
