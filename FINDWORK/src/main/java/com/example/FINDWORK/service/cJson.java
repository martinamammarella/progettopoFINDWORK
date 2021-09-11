package com.example.FINDWORK.service;
import  com.example.FINDWORK.model.Lavori;
import com.example.FINDWORK.exception.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Date;
import java.io.*;
import java.util.*;
public class cJson {
	public ArrayList<Lavori> toJson() {
		 JSONObject chiamata=null;
			JSONParser parser= new JSONParser();
			try {
		    String url="https://findwork.dev/api/jobs/";
		    HttpURLConnection openConnection=(HttpURLConnection)new URL(url).openConnection();
		     openConnection.setRequestMethod("GET");
			 openConnection.setRequestProperty("Authorization", "Token 1175bbee759222ff5ed46fe1471c896b779e2fdf");
			 openConnection.setRequestProperty("Content-Type", "application/json");
			 openConnection.setRequestProperty("Accept","application/json");
			 openConnection.setDoOutput(true);
		    String line="";
		    try { InputStream in=openConnection.getInputStream();
			    InputStreamReader inR= new InputStreamReader(in);
			    BufferedReader buf= new BufferedReader(inR);
			    while((line=buf.readLine())!=null){
			    	chiamata=(JSONObject) parser.parse(line);
				}
			    in.close();}
		    catch(Exception e) {
		 	System.out.println("errore generico1");}}
		 catch(Exception e ) {
		    System.out.println("errore2");}
			JSONArray r= new JSONArray();
			r=(JSONArray)chiamata.get("results");
			ArrayList<Lavori> offerte = new ArrayList<Lavori>();
			for(Object o:r) {
		    JSONObject l= new JSONObject();
		    l=(JSONObject) o;
		    Lavori elem=new Lavori();
		    elem.setAzienda((String)l.get("company_name"));
		    elem.setCity((String)l.get("location"));
		    elem.setData((String)l.get("date_posted"));
		    elem.setId((long)l.get("id"));
		    elem.setLinguaggi((JSONArray)l.get("keywords"));
		    elem.setOrarioLavoro((String)l.get("employment_type"));
		    elem.setRemoto((boolean)l.get("remote"));
		    elem.setRuolo((String)l.get("role"));
		    elem.setSitoWeb((String)l.get("source"));
		    offerte.add(elem);}
		    while(chiamata!=null&&(String) chiamata.get("next")!=null ) { 
		    
			try {
		    String url=(String)chiamata.get("next");
		    HttpURLConnection openConnection=(HttpURLConnection)new URL(url).openConnection();
		     openConnection.setRequestMethod("GET");
			 openConnection.setRequestProperty("Authorization", "Token 1175bbee759222ff5ed46fe1471c896b779e2fdf");
			 openConnection.setRequestProperty("Content-Type", "application/json");
			 openConnection.setRequestProperty("Accept","application/json");
			 openConnection.setDoOutput(true);
		    String line1="";
		    JSONParser parser1= new JSONParser();
		    try { InputStream in=openConnection.getInputStream();
			    InputStreamReader inR= new InputStreamReader(in);
			    BufferedReader buf= new BufferedReader(inR);
			    while((line1=buf.readLine())!=null){
			    		chiamata=(JSONObject) parser1.parse(line1);
			    	}
			    if(chiamata!=null) {
			    in.close();}
			    else {
			    	in.close();
			    	break;
			    }}
		    catch(Exception e1) {break;
		 	}}
		 catch(Exception e ) {
		    	System.out.println("erroregenerico1parte2");}
			if(chiamata!=null) {
		    	JSONArray r1= new JSONArray();
				r1=(JSONArray)chiamata.get("results");
				for(Object o:r1) {
				    JSONObject l= new JSONObject();
				    l=(JSONObject) o;
				    Lavori elem=new Lavori();
				    elem.setAzienda((String)l.get("company_name"));
				    elem.setCity((String)l.get("location"));
				    elem.setData((String)l.get("date_posted"));
				    elem.setId((long)l.get("id"));
				    elem.setLinguaggi((JSONArray)l.get("keywords"));
				    elem.setOrarioLavoro((String)l.get("employment_type"));
				    elem.setRemoto((boolean)l.get("remote"));
				    elem.setRuolo((String)l.get("role"));
				    elem.setSitoWeb((String)l.get("source"));
				    offerte.add(elem);}
		    	  }else {
		    		  break;
		    	  }}
		    	
			return offerte;
}
	
	}