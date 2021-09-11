package com.example.FINDWORK.utils;
import com.example.FINDWORK.model.Lavori;

import java.util.Date;
import java.util.ArrayList;
public class fStats {
	private ArrayList<Lavori> offerte= new ArrayList<Lavori>();
	private String[] city;
	private String[] lin;
	private String sito;
	private String data;
	public fStats(){};
 public fStats(ArrayList<Lavori> offerte,String[]lin,String[] city,String sito,String data) {
	 setCity(city);
	 setOfferte(offerte);
	 setLin(lin);
	 setSito(sito);
	 setData(data);
 }
 public void setCity(String[] city) {
	 this.city=city;
 }
 public void setOfferte(ArrayList<Lavori> of) {
	 this.offerte=of;
	 }
 public void setLin(String[] lin) {
	 this.lin=lin;
 }
 public void setSito(String sito) {
	 this.sito=sito;
 }
 public void setData(String data) {
	 this.data=data;
 }
}