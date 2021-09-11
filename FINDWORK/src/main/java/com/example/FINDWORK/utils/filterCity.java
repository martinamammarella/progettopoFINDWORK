package com.example.FINDWORK.utils;
import com.example.FINDWORK.model.*;
import com.example.FINDWORK.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import org.json.simple.*;

public class filterCity extends Filters {
	public filterCity() {
		super();
	}
	public filterCity(String[] city, String[] linguaggi,String remoto,String oreLavoro){
		 super(city,linguaggi,remoto,oreLavoro);
	}
 public ArrayList<Lavori> filtraggio(String[] fcity,ArrayList<Lavori> offerte) {
	 ArrayList<Lavori> filtrato = new ArrayList<Lavori>();
	 for(Lavori z:offerte) {
		 if(z.getCity()!=null) {
		 for(String c:fcity) {
		  if(z.getCity().contains(c)) {
			 filtrato.add(z);}
			  }
	 }}
	  return filtrato;
 }
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
	 

 
