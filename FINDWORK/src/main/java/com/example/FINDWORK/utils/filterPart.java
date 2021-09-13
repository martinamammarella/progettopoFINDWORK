package com.example.FINDWORK.utils;

import java.util.ArrayList;

import com.example.FINDWORK.model.Lavori;
/**
 * classe da cui istanziare oggetti per il filtraggio part-time, deriva dalla classe Filters 
 * @author marty
 *
 */
public class filterPart extends Filters{
	/**
	 * costruttore, richiama costruttore della superclasse
	 */
	public filterPart () {};
/**
 * metodo per il filtraggio dei lavori in base al tipo di contratto part-time
 * @param offerte non filtrate
 * @return offerte filtrate
 */
	public ArrayList<Lavori> filtraggio(ArrayList<Lavori> offerte) {
		ArrayList<Lavori> filtrato = new ArrayList<Lavori>();
		 for(Lavori z:offerte) {
			    if(!(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))) {
				filtrato.add(z);}
	 }
		return filtrato;
	}}

	