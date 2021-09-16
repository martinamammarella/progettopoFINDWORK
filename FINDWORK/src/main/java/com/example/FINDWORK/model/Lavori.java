package com.example.FINDWORK.model;
import org.json.simple.*;
import java.util.*;
/**
 * classe da cui istanziare oggetti lavoro
 * @author marty
 *
 */
public class Lavori {
 private long id;
 private String ruolo;
 private String azienda;
 private boolean remoto;
 private List<String> linguaggi= new ArrayList<String>();
 private String city;
 private String data;  
 private String orarioLavoro;
 private String sitoWeb;
/**
 * costruttore1
 */
 public Lavori() {};
 /**
  * costruttore2
  * @param id
  * @param ruolo
  * @param azienda
  * @param remoto
  * @param linguaggi
  * @param city
  * @param data
  * @param orarioLavoro
  * @param sitoWeb
  */
 public Lavori(long id, String ruolo, String azienda, boolean remoto, JSONArray  linguaggi,String city,String data, String orarioLavoro, String sitoWeb) {
	 setId(id);
	 setRuolo(ruolo);
	 setAzienda(azienda);
	 setRemoto(remoto);
	 setLinguaggi(linguaggi);
	 setCity(city);
	 setData(data);
	 setOrarioLavoro(orarioLavoro);
	 setSitoWeb(sitoWeb);
 }
/**
 * metodo che serve per impostare valore attributo data
 * @param data
 */
 public void setData(String data) {
	 this.data=data;
 }
/**
 * metodo che restituisce valore attributo data
 * @return valore data
 */
 public String getData() {
	 return data;
 }
 /**
  * metodo che serve per impostare valore attributo linguaggi
  * @param array che contiene i linguaggi
  */
 public void setLinguaggi(JSONArray array1) {
	
	 for(int i=0; i < array1.size(); i++) {
         linguaggi.add((String)array1.get(i));
      }
	
 }
 /**
  * metodo che restituisce valore attributo linguaggi
  * @return linguaggi
  */
 public List<String> getLinguaggi () {
	 return linguaggi;
 }
 /**
  * metodo che serve per impostare valore attributo city
  * @param city
  */
public void setCity(String city) {
	 this.city=city;
 }
/**
 * metodo che restituisce valore attributo city
 * @return city
 */
 public String getCity() {
	 return city;
 }
 /**
  * metodo che serve per impostare valore attributo id
  * @param id
  */
 public void setId(long id) {
	 this.id=id;
 }
 /**
  * metodo che serve per restituire valore attributo id
  * @return id 
  */
 public long getId() {
	 return id;
 }
 /**
  * metodo che serve per impostare valore attributo ruolo
  * @param ruolo
  */
 public void setRuolo(String ruolo) {
	 this.ruolo=ruolo;
 }
 /**
  * metodo che serve per restituire valore attributo ruolo
  * @return ruolo
  */
 public String getRuolo() {
	 return ruolo;
 }
/**
 * metodo che serve per impostare valore attributo azienda
 * @param azienda
 */
 public void setAzienda(String azienda) {
	 this.azienda=azienda;
 }
 /**
  * metodo che serve per restituire valore attributo azienda
  * @return azienda
  */
 public String getAzienda() {
	 return azienda;
 }
 /**
  * metodo che serve per impostare valore attributo remoto
  * @param remoto
  */
 public void setRemoto(boolean remoto) {
	 this.remoto=remoto;
 }
/**
 * metodo che serve per restituire valore attributo remoto
 * @return remoto
 */
 public boolean getRemoto() {
	 return remoto;
 }
/**
 * metodo che serve per impostare valore attributo orariolavoro
 * @param orarioLavoro
 */
public void setOrarioLavoro(String orarioLavoro) {
	 this.orarioLavoro=orarioLavoro;
 }
/**
 * metodo che serve per restituire valore attributo orariolavoro
 * @return orariolavoro
 */
 public String getOrarioLavoro() {
	 return orarioLavoro;
 }
 /**
  * metodo che serve per impostare valore attributo link
  * @param sitoWeb
  */
 public void setSitoWeb(String sitoWeb) {
	 this.sitoWeb=sitoWeb;
 }
/**
 * metodo che serve per restituire valore attributo sitoWeb
 * @return sitoWeb
 */
 public String getSitoWeb() {
	 return sitoWeb;
 }

}
