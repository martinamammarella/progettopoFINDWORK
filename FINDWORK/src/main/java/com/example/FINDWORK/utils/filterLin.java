package com.example.FINDWORK.utils;
import org.json.simple.*;
/**
 *  classe da cui istanziare oggetti per il filtraggio sui linguaggi, deriva dalla classe Filters 
 */
import com.example.FINDWORK.model.Lavori;
import java.util.*;
public class filterLin extends Filters {
	/**
	 * costruttore, richiaa costruttore della superclasse 
	 */
	public filterLin() {};
	/**
	 * metodo per il filtraggio dei lavori in base ai linguaggi passati
	 * @param flinguaggi, elenco linguaggi su cui effettuare il filtraggio
	 * @param offerte non filtrate
	 * @return lavori filtrati in base ai linguaggi specificati
	 */
	public ArrayList<Lavori> filtraggio(JSONArray flinguaggi,ArrayList<Lavori>offerte) {
		ArrayList<Lavori> filtrato = new ArrayList<Lavori>();
		String []flin= new String[flinguaggi.size()];
		int count=0;
		 for(Object o:flinguaggi) {
     		JSONObject ob= new JSONObject();
     		ob=(JSONObject)o;
     		flin[count]=(String)ob.get("lin");
     		count++;
     	}
		 for(Lavori z:offerte) {
			 List <String> l=z.getLinguaggi();
			 
			  {
			 for(String c:l) {
				 for(String c1:flin) {
					if(c.equals(c1)){
						  filtrato.add(z);
					 }
					 {
						 
				 
			 
				 }
					 
			 }}
		 }
		 
	 }
		 return filtrato;

}}