package com.example.FINDWORK.controller;
 import com.example.FINDWORK.exception.*;
	import com.example.FINDWORK.service.*;
	import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import com.example.FINDWORK.model.*;
	import com.example.FINDWORK.utils.*;
	import  java.util.*;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	@RestController
	/**
	 * classe per la gestione delle chiamate da parte del client
	 * @author marty
	 *
	 */
	public class controller{
	serviceAppImplements s= new serviceAppImplements();
	
	/**
	 * rotta di tipo get che permette di visulizzare tutte le offerte li lavoro
	 * @return offerte di lavoro 
	 */
	@GetMapping(value="offerte")
	 public ArrayList<Lavori> getOfferte(){
	 return	s.getOfferte();
			}
	/**
	 * rotta di tipo post che restituisce le offerte di lavoro filtrate in base al parametro specificato dall'utente 
	 * @param Jsonobject che contiene città, linguaggi e parametro necessari per effettuare il filtraggio
	 * @return offerte di lavoro filtrate 
	 * @throws bodyException
	 */
	@PostMapping(value="filtraggio")
	public ResponseEntity<Object> filtraggio(@RequestBody String richiesta ) throws bodyException {
		try {
	 return  new ResponseEntity<>(s.analisiFiltro( s.getOfferte(),(JSONArray)s.createJSONObject(richiesta).get("city"),(JSONArray)s.createJSONObject(richiesta).get("linguaggi"),(String)s.createJSONObject(richiesta).get("parametro")),HttpStatus.OK);
		}
		catch(bodyException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		}
	/**
	 * rotta di tipo post che effettua il filtraggio delle statistiche generate su linguaggi/città scelte dal programmatore
	 * @param richiesta serve per permettere all'utente di specificare quali statistiche vuole visulizzare(città/linguaggi) e il filtro da applicare su queste ultime
	 * @return statistiche filtrate
	 * @throws bodyException
	 * @throws cityException
	 * @throws linguaggiException
	 */

	@PostMapping(value="statistichefiltrate")
	public ResponseEntity<Object> statsfiltrate(@RequestBody String richiesta) throws bodyException,cityException{
		try {
	return  new ResponseEntity<> (s.analisiFiltersStats( s.getOfferte(), (JSONArray)s.createJSONObject(richiesta).get("city"), (JSONArray)s.createJSONObject(richiesta).get("linguaggi"),(String)s.createJSONObject(richiesta).get("parametro"),(String)s.createJSONObject(richiesta).get("link"),(String)s.createJSONObject(richiesta).get("data")),HttpStatus.OK);
	}catch(bodyException e) {
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	 catch(cityException e) {
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		catch(linguaggiException e ) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		}
  /**
   * rotta di tipo post che restituisce le statistiche relative alle città/linguaggi scelti dal programmatore 
   * @param parametro con cui l'utente specifica se vuole visulizzare le statistiche relative alle città o ai linguaggi
   * @return statistiche 
   * @throws parException
   */
	@PostMapping(value="statistiche")
	public ResponseEntity<Object> stats(@RequestParam String parametro) throws parException{
		try {
		return  new ResponseEntity<>(s.analisiStatsParametro(s.getOfferte(), parametro),HttpStatus.OK);}
		catch(parException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	
	}
	
	
		
		
		
		
	



