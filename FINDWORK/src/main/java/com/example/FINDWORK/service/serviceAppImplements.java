package com.example.FINDWORK.service;
import com.example.FINDWORK.utils.*;
import com.example.FINDWORK.exception.*;
import com.example.FINDWORK.model.Lavori;
import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**La classe serviceAppImplements implementa i servizi offerti all'utente dall'interfaccia ServiceApp richiamati attraverso il controller
 * @author marty
 *
 */
public class serviceAppImplements implements serviceApp{
	/**
	 * il metodo richiama un altro metodo che consente di ottenere l'elenco di tutte le offerte di lavoro
	 * @return offerte di lavoro
	 */
	public ArrayList<Lavori> getOfferte() {
		cJson x= new cJson();
		ArrayList<Lavori>offerte= new ArrayList();
		offerte=x.toJson();
		return offerte;
		
	}
	/**
	 *il metodo analizza il parametro in cui viene specificato il tipo di filtro da utilizzare e, in base a quest'ultimo, vengono richiamati opportuni metodi per il filtraggio
	 *@param elenco tutte offerte di lavoro
	 *@param città su con cui filtrare
	 *@param linguaggi con cui filtrare
	 *@param specifica il tipo di filtro da applicare 
	 * @return offerte di lavoro filtrate in base al parametro scelto
	 * 
	 */
	public ArrayList<Lavori> analisiFiltro(ArrayList<Lavori>offerte,JSONArray city,JSONArray flin,String parametro) throws bodyException {
		if(parametro.equals("noremote")) {
			filterNoRemote x= new filterNoRemote();
			return x.filtraggio(offerte);
		}
		if(parametro.equals("remote")) {
			filterRemote x= new filterRemote();
			return x.filtraggio(offerte);
		}
		
		if(parametro.equals("fulltime")) {
			filterFull x= new filterFull();
			return x.filtraggio(offerte);
		}
		if(parametro.equals("city")) {
			filterCity x= new filterCity();
			return x.filtraggio(offerte, city);
		}
		if(parametro.equals("linguaggi")) {
			filterLin x= new filterLin();
			return x.filtraggio(flin, offerte);
			
		}
		if(parametro.equals("parttime")) {
			filterPart x= new filterPart();
			 return x.filtraggio(offerte);
		}
		else {
			throw new bodyException("BODY ERRATO :inserire un body corretto per la richiesta ");
			}
		
	}
	/**
	 * il metodo analizza il parametro specificato dall'utente per capire i metodi da richiamare per effetuare la statistica esatta 
	 * @param elenco di tutti i lavori
	 * @param parametro utilizzato dal metodo per capire se effettuare statistiche sui linguaggi o sulle città
	 * @return statistiche sui lavori
	 */
	public ArrayList<Lavori>analisiStatsParametro(ArrayList<Lavori>offerte,String parametro)throws parException{
		if(parametro.equals("city")) {
			filtersStatsCity x= new filtersStatsCity();
			return x.statsCity(offerte);
		}
		if(parametro.equals("linguaggi")) {
     	filteresStatsLinguaggi x= new filteresStatsLinguaggi();
    	return x.statsLin(offerte);}
		else {
			throw new parException("PARAMETRO ERRATO:inserire un parametro corretto per la richiesta");
		}
	}
	/**
	 * metodo usato per il filtraggio delle statistiche 
	 * @param elenco di tutti i lavori
	 * @param elenco città su cui effettuare statistiche
	 * @param elenco linguaggi su cui effettuare statistiche
	 * @param specifica parametro su cui effettuare le statistiche
	 * @param link per eventuale filtraggio
	 * @param data per eventuale filtraggio
	 * @return
	 * 
	 */
	public ArrayList<Lavori> analisiFiltersStats(ArrayList<Lavori> offerte,JSONArray city,JSONArray linguaggi,String parametro,String link,String data) throws bodyException{
		if(parametro.equals("city")) {
			filtersStatsCity x= new filtersStatsCity();
			return x.filtraggioStatsCity(city, offerte);
		}
		if(parametro.equals("linguaggi")) {
	     	filteresStatsLinguaggi x= new filteresStatsLinguaggi();
	    	return x.filtraggioStatsLin(linguaggi, offerte);}
		if(parametro.equals("link")) {
		  filtersStatsCity x= new filtersStatsCity();
		  filteresStatsLinguaggi y= new filteresStatsLinguaggi();
		  JSONArray res= new JSONArray();
		 res.add( x.filtraggioLink(offerte, link));
		 res.add( y.filtraggioLink(offerte, link));
		 return res;
		}
		if(parametro.equals("data")) {
			filtersStatsCity x= new filtersStatsCity();
			  filteresStatsLinguaggi y= new filteresStatsLinguaggi();
			  JSONArray res= new JSONArray();
			  res.add(x.filtraggioData(offerte, data));
			  res.add(y.filtraggioData(offerte, data));
			  return res;
		}
		else {
			throw new bodyException("BODY ERRATO :inserire un body corretto per la richiesta ");
		}
		
	} 
	/**
	 * metodo usato per la creazione di un oggetto json a partire da una stringa 
	 * @param jsonString, stringa a partire dalla quale viene creato il un jsonobject
	 * @return jsonobject creato 
	 */
	
	public  JSONObject createJSONObject(String jsonString){
	    JSONObject  jsonObject=new JSONObject();
	    JSONParser jsonParser=new  JSONParser();
	    if ((jsonString != null) && !(jsonString.isEmpty())) {
	        try {
	            jsonObject=(JSONObject) jsonParser.parse(jsonString);
	        } catch (org.json.simple.parser.ParseException e) {
	            e.printStackTrace();
	        }
	    }
	    return jsonObject;
	}
	
	
}