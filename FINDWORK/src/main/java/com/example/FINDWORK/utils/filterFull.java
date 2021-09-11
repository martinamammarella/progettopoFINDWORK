package com.example.FINDWORK.utils;
import com.example.FINDWORK.model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import org.json.simple.*;
public class filterFull extends Filters {
	public filterFull() {};
	public filterFull(String[] city, String[] linguaggi,String remoto, String oreLavoro){
		 super(city,linguaggi,remoto,oreLavoro);
	}
 public ArrayList<Lavori> filtraggio(ArrayList<Lavori> offerte) {
	 ArrayList<Lavori> filtrato = new ArrayList<Lavori>();
	 for(Lavori z:offerte) {
		    if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
			filtrato.add(z);}
 }
	return filtrato;
}
 }
