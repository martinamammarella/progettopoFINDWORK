package com.example.FINDWORK.utils;
import com.example.FINDWORK.model.*;
import org.json.simple.*;

import java.util.Vector;



import java.util.ArrayList;
import java.util.Date;
import java.math.*;
/**
 * classe da cui istanziare oggetti per  la generazione delle statistiche sulle città e il filtraggio su queste ultime
 * @author marty
 *
 */
public class filtersStatsCity extends fStats {
	/**
	 * costruttore, richiama costruttore della superclasse
	 */
	public filtersStatsCity() {super();};
	/**
	 * metodo che genera statistiche sulle città scelte dal programmatore
	 * @param offerte su cui effettuare statistiche
	 * @return statistiche non filtrate
	 */
	public JSONArray statsCity(ArrayList<Lavori> offerte) {
		double r1=0, r2=0,r3=0,r4=0,r5=0;
		double f1=0, f2=0,f3=0,f4=0,f5=0;
		double rr1=0,rr2=0,rr3=0,rr4=0,rr5=0;
		double ff1=0,ff2=0,ff3=0,ff4=0,ff5=0;
		double totalechicago=0;
		double totaleberlino=0;
		int totaleseattle=0;
		int totalebrooklyn=0;
		int totaleplano=0;
		for(Lavori z:offerte) {
			 if(z.getCity()!=null) {
				 if(z.getCity().contains("Chicago, IL")){
					  totalechicago++;
					  if(z.getRemoto()==true) {
							r1++;}
					  else {rr1++;}
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
						  f1++; }
					  else {
						  ff1++;
					  }
					  }
				  if(z.getCity().contains("Berlin, Germany")){
					  totaleberlino++;
					  if(z.getRemoto()==true) {
							r2++;}else {
								rr2++;
							}
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
					  f2++;}
					 else {
						 ff2++;
					 }
					  }
				  if(z.getCity().contains("Seattle, WA")){
					  totaleseattle++;
					  if(z.getRemoto()==true) {
							r3++;}else {
								rr3++;
							}
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
						  f3++;}
					  else {
						  ff3++;
					  }
					  }
				  if(z.getCity().contains("Brooklyn, NY")){
					  totalebrooklyn++;
					  if(z.getRemoto()==true ) {
							r4++;}else {
								rr4++;
							}
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
					  f4++;}else {
						  ff4++;
					  }
					  }
				  if(z.getCity().contains("Plano")){
					  totaleplano++;
					  if(z.getRemoto()==true ) {
							r5++;}
				  else {
					  rr5++;}
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
					   f5++;}
					  else {
						  ff5++;
					  }
			 }
		}}
	  
JSONObject ob1= new JSONObject();
JSONObject ob2= new JSONObject();
JSONObject ob3= new JSONObject();
JSONObject ob4= new JSONObject();
JSONObject ob5= new JSONObject();
JSONArray array= new JSONArray();
if(totalechicago!=0) {
double s1=(r1/totalechicago)*100;
double ss1=(f1/totalechicago)*100;
double p1=(rr1/totalechicago)*100;
double pp1=(ff1/totalechicago)*100;
ob1.put("totalechicago",totalechicago);
ob1.put("remoteChicago", r1);
ob1.put("noremoteChicago", rr1);
ob1.put("fullChicago", f1);
ob1.put("partchicago",ff1);
ob1.put("percentualeremoteChicago", s1);
ob1.put("percentualenoremotechicago",p1 );
ob1.put("percentualefullChicago",ss1);
ob1.put("percentualepartchicago", pp1);
array.add(ob1);}
else {
	ob1.put("totalechicago", totalechicago);
	ob1.put("nessuna statistica", null);
	array.add(ob1);
}
if(totaleberlino!=0) {
double s2= (r2/totaleberlino)*100;
double ss2= (f2/totaleberlino*100);
double p2=(rr2/totaleberlino)*100;
double pp2=(ff2/totaleberlino)*100;
ob2.put("totaleberlino", totaleberlino);
ob2.put("remoteberlino", r2);
ob2.put("noremoteberlino", rr2);
ob2.put("fullberlino", f2);
ob2.put("partberlino", ff2);
ob2.put("percentualeremoteberlino",s2);
ob2.put("percentualenoremoteberlino", p2);
ob2.put("percentualefullberlino",ss2);
ob2.put("percentualepartberlino", pp2);
array.add(ob2);}
else {
		ob2.put("totaleberlino", totaleberlino);
		ob2.put("nessuna statistica", null);
		array.add(ob2);
	}

if(totaleseattle!=0) {
double s3=(r3/totaleseattle)*100;
double ss3=(f3/totaleseattle)*100;
double p3=(rr3/totaleseattle)*100;
double pp3=(ff3/totaleseattle)*100;
ob3.put("totaleSeattle", totaleseattle);
ob3.put("remoteSeattle",r3);
ob3.put("noremoteseattle", rr3);
ob3.put("fullSeattle", f3);
ob3.put("partseattle", ff3);
ob3.put("percentualeremoteSeattle", s3);
ob3.put("percentualenoremoteseattle" , p3);
ob3.put("percentualefullSeattle", ss3);
ob3.put("percentualepartSeattle", pp3);
array.add(ob3);}
else {
	ob3.put("totaleseattle", totaleseattle);
	ob3.put("nessuna statistica", null);
	array.add(ob3);
}
if(totalebrooklyn!=0) {
double s4=(r4/totalebrooklyn)*100;
double ss4=(f4/totalebrooklyn)*100;
double p4=(rr4/totalebrooklyn)*100;
double pp4=(ff4/totalebrooklyn)*100;
ob4.put("totalebrooklyn", totalebrooklyn);
ob4.put("remoteBrooklyn", r4);
ob4.put("noremotebrooklyn",rr4 );
ob4.put("fullBrooklyn", f4);
ob4.put("partbrooklyn", ff4);
ob4.put("percentualeremoteBrooklyn", s4);
ob4.put("percentualenoremotebrooklyn", p4);
ob4.put("percentualefullBrooklyn", ss4);
ob4.put("percentualepartbrooklyn", pp4);
array.add(ob4);}
else {
	ob4.put("totalebrooklyn", totalebrooklyn);
	ob4.put("nessuna statistica", null);
	array.add(ob4);
}
if(totaleplano!=0) {
double s5=(r5/totaleplano)*100;
double ss5=(f5/totaleplano)*100;
double p5=(rr5/totaleplano)*100;
double pp5=(ff5/totaleplano)*100;
ob5.put("totaleplano", totaleplano);
ob5.put("remotePlano", r5);
ob5.put("noremoteplano", rr5);
ob5.put("fullPlano", f5);
ob5.put("partplano", ff5);
ob5.put("percentualeremotePlano", r5);
ob5.put("percentualenoremoteplano", rr5);
ob5.put("percentualefullPlano", ss5);
ob5.put("percentualepartplano", ff5);
array.add(ob5);}
else {
	ob5.put("totaleplano", totaleplano);
	ob5.put("nessuna statistica", null);
	array.add(ob5);
}
return array;
		
	}
	/**
	 * metodo che realizza le statistiche e le filtra in base a quelle specificate dall'utente, fra quell scelte dal programmatore
	 * @param scity città su cui filtrare le statistiche, tra quelle scelte dal programmatore
	 * @param offerte su cui effettuare statistiche
	 * @return statistiche filtrate
	 */
	public JSONArray filtraggioStatsCity(JSONArray scity,ArrayList<Lavori> offerte) {
	String[]city= new String[scity.size()];
	double r1=0, r2=0,r3=0,r4=0,r5=0;
	double f1=0, f2=0,f3=0,f4=0,f5=0;
	double rr1=0,rr2=0,rr3=0,rr4=0,rr5=0;
	double ff1=0,ff2=0,ff3=0,ff4=0,ff5=0;
	double totalechicago=0;
	double totaleberlino=0;
	int totaleseattle=0;
	int totalebrooklyn=0;
	int totaleplano=0;
	int count=0;
	for(Object o:scity) {
		JSONObject ob= new JSONObject();
		ob=(JSONObject)o;
		city[count]=(String)ob.get("name");
		count++;
	}
	
			
						  for(Lavori z:offerte) {
								 if(z.getCity()!=null) {
								 for(String c:city) {
								  if(z.getCity().contains(c)) {
										  if(z.getCity().contains("Chicago, IL")){
											  totalechicago++;
											  if(z.getRemoto()==true) {
													r1++;}
											  else {
												  rr1++;
											  }
											  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
												  f1++; }
											  else {
												  ff1++;
											  }
											  }
										  if(z.getCity().contains("Berlin, Germany")){
											  totaleberlino++;
											  if(z.getRemoto()==true) {
													r2++;}
											  else {
												  rr2++;
											  }
											 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
											  f2++;}
											 else {
												 ff2++;
											 }
											  }
										  if(z.getCity().contains("Seattle, WA")){
											  totaleseattle++;
											  if(z.getRemoto()==true) {
													r3++;}
											  else {
												  rr3++;
											  }
											  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
												  f3++;}
											  else {
												  ff3++;
											  }
											  }
										  if(z.getCity().contains("Brooklyn, NY")){
											  totalebrooklyn++;
											  if(z.getRemoto()==true ) {
													r4++;}
											  else {
												  rr4++;
											  }
											 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
											  f4++;}
											 else {
												 ff4++;
											 }
											  }
										  if(c.contains("Plano")){
											  totaleplano++;
											  if(z.getRemoto()==true ) {
													r5++;}
											  else {
												  rr5++;
											  }
											  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
											   f5++;}
											  else {
												  ff5++;
											  }
											  }}}}}
		JSONObject ob1= new JSONObject();
		JSONObject ob2= new JSONObject();
		JSONObject ob3= new JSONObject();
		JSONObject ob4= new JSONObject();
		JSONObject ob5= new JSONObject();
		JSONArray array= new JSONArray();
		if(totalechicago!=0) {
		
		double s1=(r1/totalechicago)*100;
		double ss1=(f1/totalechicago)*100;
		double p1=(rr1/totalechicago)*100;
		double pp1=(ff1/totalechicago)*100;
		ob1.put("totalechicago",totalechicago);
		ob1.put("remoteChicago", r1);
		ob1.put("noremotechicago", rr1);
		ob1.put("fullChicago", f1);
		ob1.put("partchicago", ff1);
		ob1.put("percentualenoremotechicago", p1);
		ob1.put("percentualepartchicago", pp1);
		ob1.put("percentualeremoteChicago", s1);
		ob1.put("percentualefullChicago",ss1);
		
		array.add(ob1);}
		if(totaleberlino!=0) {
		double s2= (r2/totaleberlino)*100;
		double ss2= (f2/totaleberlino*100);
		double p2=(rr2/totaleberlino)*100;
		double pp2=(ff2/totaleberlino)*100;
		ob2.put("totaleberlino", totaleberlino);
		ob2.put("remoteberlino", r2);
		ob2.put("noremoteberlino", rr2);
		ob2.put("partberlino", ff2);
		ob2.put("fullberlino", f2);
		ob2.put("percentualepartchicago", p2);
		ob2.put("percentualeremoteberlino",s2);
		ob2.put("percentualefullberlino",ss2);
		ob2.put("percentualepartberlino", pp2);
		
		array.add(ob2);}
		if(totaleseattle!=0) {
		double s3=(r3/totaleseattle)*100;
		double ss3=(f3/totaleseattle)*100;
		double p3=(rr3/totaleseattle)*100;
		double pp3=(ff3/totaleseattle)*100;
		ob3.put("totaleSeattle", totaleseattle);
		ob3.put("remoteSeattle",r3);
		ob3.put("noremoteseattle", rr3);
		ob3.put("fullSeattle", f3);
		ob3.put("partseattle", ff3);
		ob3.put("percentualenoremoteseattle", p3);
		ob3.put("percentualeremoteSeattle", s3);
		ob3.put("percentualefullSeattle", ss3);
		ob3.put("percentualepartberlino", pp3);
		array.add(ob3);}
		if(totalebrooklyn!=0) {
		double s4=(r4/totalebrooklyn)*100;
		double ss4=(f4/totalebrooklyn)*100;
		double p4=(rr4/totalebrooklyn)*100;
		double pp4=(ff4/totalebrooklyn)*100;
        ob4.put("totalebrooklyn", totalebrooklyn);
		ob4.put("remoteBrooklyn", r4);
		ob4.put("noremotebrooklyn", rr4);
		ob4.put("fullBrooklyn", f4);
		ob4.put("partbrooklyn", ff4);
		ob4.put("percentualeremoteBrooklyn", s4);
		ob4.put("percentualenoremotebrooklyn", p4);
		ob4.put("percentualefullBrooklyn", ss4);
		ob4.put("percentualepartbrooklyn", pp4);
		array.add(ob4);}
		if(totaleplano!=0) {
	   double s5=(r5/totaleplano)*100;
		double ss5=(f5/totaleplano)*100;
		double p5=(rr5/totaleplano)*100;
		double pp5=(ff5/totaleplano)*100;
		ob5.put("totaleplano", totaleplano);
		ob5.put("remotePlano", r5);
		ob5.put("noremoteplano", rr5);
		ob5.put("fullPlano", f5);
		ob5.put("partplano", ff5);
		ob5.put("percentualenoremoteplano", p5);
		ob5.put("percentualeremotePlano", r5);
		ob5.put("percentualefullPlano", ss5);
		ob5.put("percentualepartplano", pp5);
		array.add(ob5);}
		return array;
		}
	/**
	 * metodo che effettua il filtraggio delle statistiche sulle città in base al link
	 * @param offerte  specificato su cui fare statistiche
	 * @param link in base a cui filtrare delle statistiche
	 * @return statistiche filtrate 
	 */
	public JSONArray filtraggioLink(ArrayList<Lavori>offerte,String link) {
		double r1=0, r2=0,r3=0,r4=0,r5=0;
		double f1=0, f2=0,f3=0,f4=0,f5=0;
		double rr1=0,rr2=0,rr3=0,rr4=0,rr5=0;
		double ff1=0,ff2=0,ff3=0,ff4=0,ff5=0;
		double totalechicago=0;
		double totaleberlino=0;
		int totaleseattle=0;
		int totalebrooklyn=0;
		int totaleplano=0;
		for(Lavori z:offerte) {
			 if(z.getCity()!=null) {
				 if(z.getSitoWeb().contains(link)) {
				 if(z.getCity().contains("Chicago, IL")){
					  totalechicago++;
					  if(z.getRemoto()==true) {
							r1++;}
					  else {
						  rr1++;
					  }
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
						  f1++; }
					  else {
						  ff1++;
					  }
					  }
				  if(z.getCity().contains("Berlin, Germany")){
					  totaleberlino++;
					  if(z.getRemoto()==true) {
							r2++;}
					  else {
						  rr2++;
					  }
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
					  f2++;}
					 else {
						 ff2++;
					 }
					  }
				  if(z.getCity().contains("Seattle, WA")){
					  totaleseattle++;
					  if(z.getRemoto()==true) {
							r3++;}
					  else {
						  rr3++;
					  }
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
						  f3++;}
					  else {
						  ff3++;
					  }
					  }
				  if(z.getCity().contains("Brooklyn, NY")){
					  totalebrooklyn++;
					  if(z.getRemoto()==true ) {
							r4++;}
					  else {
						  rr4++;
					  }
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
					  f4++;}
					 else {
						 ff4++;
					 }
					  }
				  if(z.getCity().contains("Plano")){
					  totaleplano++;
					  if(z.getRemoto()==true ) {
							r5++;}
					  else {
						  rr5++;
					  }
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
					   f5++;}
					  else {
						  ff5++;}}
					  }
			 }
		}
	  
JSONObject ob1= new JSONObject();
JSONObject ob2= new JSONObject();
JSONObject ob3= new JSONObject();
JSONObject ob4= new JSONObject();
JSONObject ob5= new JSONObject();
JSONArray array= new JSONArray();
if(totalechicago!=0) {
double s1=(r1/totalechicago)*100;
double ss1=(f1/totalechicago)*100;
double p1=(rr1/totalechicago)*100;
double pp1=(ff1/totalechicago)*100;
ob1.put("totalechicago",totalechicago);
ob1.put("remoteChicago", r1);
ob1.put("noremotechicago", rr1);
ob1.put("fullChicago", f1);
ob1.put("partchicago", ff1);
ob1.put("percentualenoremotechicago", pp1);
ob1.put("percentualeremoteChicago", s1);
ob1.put("percentualefullChicago",ss1);
ob1.put("percentualepartchicago", ff1);
array.add(ob1);}
else {
	ob1.put("totalechicago", totalechicago);
	ob1.put("nessuna statistica", null);
	array.add(ob1);
}
if(totaleberlino!=0) {
double s2= (r2/totaleberlino)*100;
double ss2= (f2/totaleberlino*100);
double p2=(rr2/totaleberlino)*100;
double pp2=(ff2/totaleberlino)*100;
ob2.put("totaleberlino", totaleberlino);
ob2.put("remoteberlino", r2);
ob2.put("noremoteberlino", rr2);
ob2.put("fullberlino", f2);
ob2.put("partberlino", ff2);
ob2.put("percentualeremoteberlino",s2);
ob2.put("percentualenoremoteberlino", p2);
ob2.put("percentualefullberlino",ss2);
ob2.put("percentualepartberlino", pp2);
array.add(ob2);}
else {
		ob2.put("totaleberlino", totaleberlino);
		ob2.put("nessuna statistica", null);
		array.add(ob2);
	}

if(totaleseattle!=0) {
double s3=(r3/totaleseattle)*100;
double ss3=(f3/totaleseattle)*100;
double p3=(rr3/totaleseattle)*100;
double pp3=(ff3/totaleseattle)*100;
ob3.put("totaleSeattle", totaleseattle);
ob3.put("remoteSeattle",r3);
ob3.put("noremoteseattle",rr3 );
ob3.put("fullSeattle", f3);
ob3.put("partseattle", ff3);
ob3.put("percentualeremoteSeattle", s3);
ob3.put("percentualenoremoteseattle", p3);
ob3.put("percentualefullSeattle", ss3);
ob3.put("percentualepartberlino", pp3);
array.add(ob3);}
else {
	ob3.put("totaleseattle", totaleseattle);
	ob3.put("nessuna statistica", null);
	array.add(ob3);
}
if(totalebrooklyn!=0) {
double s4=(r4/totalebrooklyn)*100;
double ss4=(f4/totalebrooklyn)*100;
double p4=(rr4/totalebrooklyn)*100;
double pp4=(ff4/totalebrooklyn)*100;
ob4.put("totalebrooklyn", totalebrooklyn);
ob4.put("remoteBrooklyn", r4);
ob4.put("noremotebrooklyn", rr4);
ob4.put("fullBrooklyn", f4);
ob4.put("partbrooklyn", ff4);
ob4.put("percentualeremoteBrooklyn", s4);
ob4.put("percentualenoremotebroklyn", p4);
ob4.put("percentualefullBrooklyn", ss4);
ob4.put("percentualefullbrooklyn", pp4);
array.add(ob4);}
else {
	ob4.put("totalebrooklyn", totalebrooklyn);
	ob4.put("nessuna statistica", null);
	array.add(ob4);
}
if(totaleplano!=0) {
double s5=(r5/totaleplano)*100;
double ss5=(f5/totaleplano)*100;
double p5=(rr5/totaleplano)*100;
double pp5=(ff5/totaleplano)*100;
ob5.put("totaleplano", totaleplano);
ob5.put("remotePlano", r5);
ob5.put("noremoteplano",rr5);
ob5.put("fullPlano", f5);
ob5.put("partplano", ff5);
ob5.put("percentualenoremoteplano", p5);
ob5.put("percentualeremotePlano", r5);
ob5.put("percentualefullPlano", ss5);
ob5.put("percentualepartplano", pp5);
array.add(ob5);}
else {
	ob5.put("totaleplano", totaleplano);
	ob5.put("nessuna statistica", null);
	array.add(ob5);
}
return array;
		
	}
	/**
	 * metodo che effettua il filtraggio delle statistiche sulle città in base alla data specificata
	 * @param offerte su cui fare statistiche
	 * @param data su cui filtrare le statistiche
	 * @return statistiche filtrate
	 */
	public JSONArray filtraggioData(ArrayList<Lavori>offerte,String data) {
		double r1=0, r2=0,r3=0,r4=0,r5=0;
		double f1=0, f2=0,f3=0,f4=0,f5=0;
		double rr1=0,rr2=0,rr3=0,rr4=0,rr5=0;
		double ff1=0,ff2=0,ff3=0,ff4=0,ff5=0;
		double totalechicago=0;
		double totaleberlino=0;
		int totaleseattle=0;
		int totalebrooklyn=0;
		int totaleplano=0;
		for(Lavori z:offerte) {
			 if(z.getCity()!=null) {
				 if(z.getData().contains(data)) {
				 if(z.getCity().contains("Chicago, IL")){
					  totalechicago++;
					  if(z.getRemoto()==true) {
							r1++;}else {
								rr1++;
							}
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
						  f1++; }else {ff1++;
					  }}
				  if(z.getCity().contains("Berlin, Germany")){
					  totaleberlino++;
					  if(z.getRemoto()==true) {
							r2++;}
					  else {
						  rr2++;
					  }
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
					  f2++;}else {
						  ff2++;
					  }
					  }
				  if(z.getCity().contains("Seattle, WA")){
					  totaleseattle++;
					  if(z.getRemoto()==true) {
							r3++;}
					  else {
						  rr3++;
					  }
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
						  f3++;}
					  else {
						  ff3++;
					  }
					  }
				  if(z.getCity().contains("Brooklyn, NY")){
					  totalebrooklyn++;
					  if(z.getRemoto()==true ) {
							r4++;}
					  else {
						  rr4++;
					  }
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
					  f4++;}
					 else {
						 ff4++;
					 }
					  }
				  if(z.getCity().contains("Plano")){
					  totaleplano++;
					  if(z.getRemoto()==true ) {
							r5++;}
					  else {
						  rr5++;
					  }
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract")))) {
					   f5++;}else {
						   ff5++;
					   }
			 }}
		}}
	  
JSONObject ob1= new JSONObject();
JSONObject ob2= new JSONObject();
JSONObject ob3= new JSONObject();
JSONObject ob4= new JSONObject();
JSONObject ob5= new JSONObject();
JSONArray array= new JSONArray();
if(totalechicago!=0) {
double s1=(r1/totalechicago)*100;
double ss1=(f1/totalechicago)*100;
double p1=(rr1/totalechicago)*100;
double pp1=(ff1/totalechicago)*100;
ob1.put("totalechicago",totalechicago);
ob1.put("remoteChicago", r1);
ob1.put("noremotochicago", rr1);
ob1.put("fullChicago", f1);
ob1.put("partchicago", ff1);
ob1.put("percentualeremoteChicago", s1);
ob1.put("percentualenoremotechicago", p1);
ob1.put("percentualefullChicago",ss1);
ob1.put("percentualepartchicago", pp1);
array.add(ob1);}
else {
	ob1.put("totalechicago", totalechicago);
	ob1.put("nessuna statistica", null);
	array.add(ob1);
}
if(totaleberlino!=0) {
double s2= (r2/totaleberlino)*100;
double ss2= (f2/totaleberlino*100);
double p2=(rr2/totaleberlino)*100;
double pp2=(ff2/totaleberlino)*100;
ob2.put("totaleberlino", totaleberlino);
ob2.put("remoteberlino", r2);
ob2.put("noremoteberlino", rr2);
ob2.put("fullberlino", f2);
ob2.put("partberlino", ff2);
ob2.put("percentualenoremoteberlino", p2);
ob2.put("percentualeremoteberlino",s2);
ob2.put("percentualepartberlino", pp2);
ob2.put("percentualefullberlino",ss2);
array.add(ob2);}
else {
		ob2.put("totaleberlino", totaleberlino);
		ob2.put("nessuna statistica", null);
		array.add(ob2);
	}

if(totaleseattle!=0) {
double s3=(r3/totaleseattle)*100;
double ss3=(f3/totaleseattle)*100;
double p3=(rr3/totaleseattle)*100;
double pp3=(ff3/totaleseattle)*100;
ob3.put("totaleSeattle", totaleseattle);
ob3.put("remoteSeattle",r3);
ob3.put("noremoteberlino", p3);
ob3.put("fullSeattle", f3);
ob3.put("partberlino", pp3);
ob3.put("percentualenoremoteberlino", p3);
ob3.put("percentualeremoteSeattle", s3);
ob3.put("percentualefullSeattle", ss3);
ob3.put("percentualepartseattle", ff3);
array.add(ob3);}
else {
	ob3.put("totaleseattle", totaleseattle);
	ob3.put("nessuna statistica", null);
	array.add(ob3);
}
if(totalebrooklyn!=0) {
double s4=(r4/totalebrooklyn)*100;
double ss4=(f4/totalebrooklyn)*100;
double p4=(rr4/totalebrooklyn)*100;
double pp4=(ff4/totalebrooklyn)*100;
ob4.put("totalebrooklyn", totalebrooklyn);
ob4.put("noremoteberlino",rr4);
ob4.put("remoteBrooklyn", r4);
ob4.put("partberlino", ff4);
ob4.put("fullBrooklyn", f4);
ob4.put("percentualenoremoteberlino", p4);
ob4.put("percentualepartberlino", pp4);
ob4.put("percentualeremoteBrooklyn", s4);
ob4.put("percentualefullBrooklyn", ss4);
array.add(ob4);}
else {
	ob4.put("totalebrooklyn", totalebrooklyn);
	ob4.put("nessuna statistica", null);
	array.add(ob4);
}
if(totaleplano!=0) {
double s5=(r5/totaleplano)*100;
double ss5=(f5/totaleplano)*100;
double p5=(rr5/totaleplano)*100;
double pp5=(ff5/totaleplano)*100;
ob5.put("totaleplano", totaleplano);
ob5.put("remotePlano", r5);
ob5.put("noremoteberlino", rr5);
ob5.put("fullPlano", f5);
ob5.put("partberlino",ff5);
ob5.put("percentualenoremoteberlino", p5);
ob5.put("percentualeremotePlano", r5);
ob5.put("percentualefullPlano", ss5);
ob5.put("percentualepartberlino", pp5);
array.add(ob5);}
else {
	ob5.put("totaleplano", totaleplano);
	ob5.put("nessuna statistica", null);
	array.add(ob5);
}
return array;
		
	}
	
	}
	
		
		
		
		
	
	
		
		
		
	
	
	