package com.example.FINDWORK.utils;
import org.json.simple.*;
import com.example.FINDWORK.model.Lavori;
import java.util.*;
public class filterLin extends Filters {
	public filterLin() {};
	public filterLin(String[] city, String[] linguaggi,String remoto,String oreLavoro){
		 super(city,linguaggi,remoto,oreLavoro);
	}
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