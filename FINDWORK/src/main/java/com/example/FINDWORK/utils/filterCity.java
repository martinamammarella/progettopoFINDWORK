package com.example.FINDWORK.utils;
import com.example.FINDWORK.model.*;
import com.example.FINDWORK.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import org.json.simple.*;
/**
 * classe da cui istanziare oggetti per il filtraggio sulle città, deriva dalla classe Filters 
 * @author marty
 *
 */
public class filterCity extends Filters {
	/**
	 * costruttore, richiama costruttore superclasse
	 */
	public filterCity() {
		super();
	}
	/**
	 * metodo per il filtraggio dei lavori in base alle città passate 
	 * @param offerte non filtrate
	 * @param fcity, elenco città su cui effettuare il filtraggio
	 * @return lavori filtrati in base alle città passate 
	 */
 public ArrayList<Lavori> filtraggio(ArrayList<Lavori> offerte,ArrayList fcity){
	 String[]city= new String[fcity.size()];
	 int count=0;
	 for(Object o:fcity) {
			JSONObject ob= new JSONObject();
			ob=(JSONObject)o;
			city[count]=(String)ob.get("name");
			count++;
		}
	 ArrayList<Lavori> filtrato = new ArrayList<Lavori>();
	 for(Lavori z:offerte) 
		  {if(z.getCity()!=null) {
		 for(String c:city) {
		  if(z.getCity().contains(c)) {
			 filtrato.add(z);
			 }
			  }}
 }return filtrato;}
}
	 

 
