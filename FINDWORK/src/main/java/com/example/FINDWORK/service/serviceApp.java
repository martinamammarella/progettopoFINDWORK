package com.example.FINDWORK.service;
import com.example.FINDWORK.exception.bodyException;
import com.example.FINDWORK.exception.parException;
import com.example.FINDWORK.model.Lavori;
import java.util.ArrayList;
import org.json.simple.*;
/**
 * interfaccia servizi esposti dall'applicazione
 * @author marty
 *
 */
public interface serviceApp {
	public ArrayList<Lavori> getOfferte();
	public ArrayList<Lavori> analisiFiltro(ArrayList<Lavori>offerte,JSONArray city,JSONArray flin,String parametro) throws bodyException;
	public ArrayList<Lavori>analisiStatsParametro(ArrayList<Lavori>offerte,String parametro)throws parException;
	public ArrayList<Lavori> analisiFiltersStats(ArrayList<Lavori> offerte,JSONArray city,JSONArray linguaggi,String parametro,String link,String data) throws bodyException;

}