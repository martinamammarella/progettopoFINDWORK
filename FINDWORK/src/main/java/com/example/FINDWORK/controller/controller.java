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
	public class controller{
	serviceAppImplements s= new serviceAppImplements();
	
	
	@GetMapping(value="offerte")
	 public ArrayList<Lavori> getOfferte(){
	 return	s.getOfferte();
			}
	
	@PostMapping(value="filtraggio")
	public ResponseEntity<Object> filtraggio(@RequestBody String richiesta ) throws bodyException {
		try {
	 return  new ResponseEntity<>(s.analisiFiltro( s.getOfferte(),(JSONArray)s.createJSONObject(richiesta).get("city"),(JSONArray)s.createJSONObject(richiesta).get("linguaggi"),(String)s.createJSONObject(richiesta).get("parametro")),HttpStatus.OK);
		}
		catch(bodyException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		}
	@PostMapping(value="statistichefiltrate")
	public ResponseEntity<Object> statsfiltrate(@RequestBody String richiesta) throws bodyException{
		try {
	return  new ResponseEntity<> (s.analisiFiltersStats( s.getOfferte(), (JSONArray)s.createJSONObject(richiesta).get("city"), (JSONArray)s.createJSONObject(richiesta).get("linguaggi"),(String)s.createJSONObject(richiesta).get("parametro"),(String)s.createJSONObject(richiesta).get("link"),(String)s.createJSONObject(richiesta).get("data")),HttpStatus.OK);
	}catch(bodyException e) {
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
		}
	@PostMapping(value="statistiche")
	public ResponseEntity<Object> stats(@RequestParam String parametro) throws parException{
		try {
		return  new ResponseEntity<>(s.analisiStatsParametro(s.getOfferte(), parametro),HttpStatus.OK);}
		catch(parException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	}
	
	
		
		
		
		
	



