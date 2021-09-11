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


public class serviceAppImplements implements serviceApp{
	
	public ArrayList<Lavori> getOfferte() {
		cJson x= new cJson();
		ArrayList<Lavori>offerte= new ArrayList();
		offerte=x.toJson();
		return offerte;
		
	}
	public ArrayList<Lavori> analisiFiltro(ArrayList<Lavori>offerte,JSONArray city,JSONArray flin,String parametro) throws bodyException {
		if(parametro.equals("remote")) {
			filterRemote x= new filterRemote();
			return x.filtraggio(offerte);
		}
		if(parametro.equals("full")) {
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
		else {
			throw new bodyException("BODY ERRATO :inserire un body corretto per la richiesta ");
			}
		
	}
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