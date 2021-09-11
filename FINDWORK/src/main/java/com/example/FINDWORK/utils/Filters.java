package com.example.FINDWORK.utils;

public class Filters {

 private String remoto;
 private String oreLavoro;
 private String[] city;
 private String[]linguaggi;
 private String link;
 private String data;
 public Filters() {};
 
 public Filters(String[] city, String[] linguaggi,String remoto,String oreLavoro) {
	 setCity(city);
	 setLinguaggi(linguaggi);
	 setRemoto(remoto);
	 setOreLavoro(oreLavoro);
	 setLink(link);
	 setData(data);
	 
 }
 public void setCity(String[] city) {
	 this.city=city;
 }
 
 public String[] getCity() {
	 return city;
 }
 public String getDate() {
	 return data;
 }
 public void setData(String data) {
	 this.data=data;
 }
 public void setLinguaggi(String[] linguaggi) {
	 this.linguaggi=linguaggi;
 }
 public String[] getLinguaggi() {
	 return linguaggi;
 }
 public void setOreLavoro(String oreLavoro) {
	 this.oreLavoro=oreLavoro;
 }
 public String getOreLavoro() {
	 return oreLavoro;
 }
 public void setRemoto(String remoto) {
	 this.remoto=remoto;
 }
 public String getRemoto(){
	 return remoto;
 }
 public void setLink(String link) {
	 this.link=link;
 }
 public String getLink() {
	 return link;
 }
 
}