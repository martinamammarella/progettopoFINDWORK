package com.example.FINDWORK.utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import com.example.FINDWORK.model.Lavori;
import org.json.simple.JSONArray;

public class filterRemote extends Filters{
	public filterRemote() {};
	public filterRemote(String[] city, String[] linguaggi,String remoto, String oreLavoro){
		 super(city,linguaggi,remoto,oreLavoro);
	}
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
