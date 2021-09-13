package com.example.FINDWORK.utils;
import com.example.FINDWORK.model.*;
import java.util.Date;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
/**
 * classe da cui istanziare oggetti per  la generazione delle statistiche sui linguaggi e il filtraggio su queste ultime
 * @author marty
 *
 */
public class filteresStatsLinguaggi extends fStats{
	/**
	 * costruttore, richiama il costruttore della superclasse
	 */
	public filteresStatsLinguaggi () {};
	/**
	 *metodo per la generazione delle statistiche sui linguaggi scelti
	 * @param offerte su cui fare statistiche
	 * @return statistiche non filtrate
	 */
	public JSONArray statsLin(ArrayList<Lavori> offerte) {
		double r1=0, r2=0,r3=0,r4=0,r5=0,s1=0,s2=0,s3=0,s4=0,s5=0;
		double f1=0, f2=0,f3=0,f4=0,f5=0,ss1=0,ss2=0,ss3=0,ss4=0,ss5=0;
		double rr1=0,rr2=0,rr3=0,rr4=0,rr5=0;
		double ff1=0,ff2=0,ff3=0,ff4=0,ff5=0;
		double totalekotlin=0;
		double totaleruby=0;
		double totalejavas=0;
		double totalepython=0;
        double totaletypescript=0;
        
        for(Lavori z:offerte) {
        	if(z.getLinguaggi().contains("kotlin")){
				  totalekotlin ++;
				  if(z.getRemoto()==true) {
						r1++;}
				  else {
					  ff1++;
				  }
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
				  { f1++; }
				  else{
					  ff1++;}
				  }
			  if(z.getLinguaggi().contains("ruby")){
				  totaleruby ++;
				  if(z.getRemoto()==true ) {
						r2++;}
				  else {
					  rr2++;
				  }
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
					   f2++;}
				  else{
					  ff2++;}
				  }
			  if(z.getLinguaggi().contains("javascript")){
				  totalejavas ++;
				  if(z.getRemoto()==true ) {
						r3++;}
				  else {
					  rr3++;
				  }
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
					   f3++;}
				  else {
					  ff3++;
				  }
				  }
			  if(z.getLinguaggi().contains("python")){
				  totalepython ++;
				  if(z.getRemoto()==true ) {
						r4++;}
				  else {
					  rr4++;
				  }
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
					   f4++;}
				  else{
					  ff4++;}
				  }
			  if(z.getLinguaggi().contains("typescript")){
				  totaletypescript ++;
				  if(z.getRemoto()==true) {
						r5++;}
				  else {
					  rr5++;
				  }
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
					   f5++;}
				  else{
					  ff5++;}
				  }
        }
        JSONArray array= new JSONArray();
		JSONObject ob1= new JSONObject();
		JSONObject ob2= new JSONObject();
		JSONObject ob3= new JSONObject();
		JSONObject ob4= new JSONObject();
		JSONObject ob5= new JSONObject();
		if(totalekotlin!=0) {
		 ss1=(f1/totalekotlin)*100;
		 s1=(r1/totalekotlin)*100;
		 double p1=(rr1/totalekotlin)*100;
		 double pp1=(ff1/totalekotlin)*100;
		    ob1.put("totalekotlin", totalekotlin);
			ob1.put("remotekotlin", r1);
			ob1.put("noremotekotlin", rr1);
			ob1.put("fullkotlin", f1);
			ob1.put("partkotlin", ff1);
			ob1.put("percentualeremotekotlin", s1);
			ob1.put("percentualenoremotekotlin", p1);
			ob1.put("percentualepartkotlin", pp1);
			ob1.put("percentualefullkotlin", ss1);
			array.add(ob1);}
		else {
			ob1.put("totalekotlin", totalekotlin);
			ob1.put("nessunastatistica", null);
			array.add(ob1);
		}
		if(totaleruby!=0) {
		s2=(r2/totaleruby)*100;
		ss2=(f2/totaleruby)*100;
		double p2=(rr2/totaleruby)*100;
		double pp2=(ff2/totaleruby)*100;
		ob2.put("totaleruby", totaleruby);
		ob2.put("remoteruby", r2);
		ob2.put("noremoteruby", r2);
		ob2.put("fullruby", f2);
		ob2.put("partkotlin",ff2);
		ob2.put("percentualenoremoteruby", p2);
		ob2.put("percentualeremoteruby", s2);
	    ob2.put("percentualefullruby", ss2);
	    ob2.put("percentualepartruby", pp2);
		array.add(ob2);
		}
		else {
			ob2.put("totaleruby", totaleruby);
			ob2.put("nessunastatistica", null);
			array.add(ob2);
		}
		if(totalejavas!=0) {
		   s3=(r3/totalejavas)*100;
		   ss3=(f3/totalejavas)*100;
		   double p3=(rr3/totalejavas)*100;
		   double pp3=(ff3/totalejavas)*100;
            ob3.put("totalejavascript", totalejavas);
            ob3.put("noremotejavascript", rr3);
			ob3.put("remotejavascript",r3);
			ob3.put("partjavascript", ff3);
			ob3.put("fulljavascript", f3);
			ob3.put("percentualenoremotejavascript", p3);
			ob3.put("percentualeremotejavascript", s3);
			ob3.put("percentualepartjavascript", ff3);
			ob3.put("percentualefulljavascript", ss3);
			array.add(ob3);
		}
		else {
			ob3.put("totalejavascript",totalejavas);
			ob3.put("nessunastatistica", null);
			array.add(ob3);
		}
		if(totalepython!=0) {
		ss4=(f4/totalepython)*100;
	    s4=(r4/totalepython)*100;
        double p4=(rr4/totalepython)*100;
        double pp4=(ff4/totalepython)*100;
		ob4.put("totalepython", totalepython);
		ob4.put("noremotepython", rr4);
		ob4.put("remotepython", r4);
		ob4.put("partpython", ff4);
		ob4.put("fullpython", f4);
		ob4.put("percentualenoremotepython", p4);
		ob4.put("percentualeremotepython", s4);
		ob4.put("percentualefullpython", ss4);
		ob4.put("percentualepartpython", pp4);
		array.add(ob4);}
		else {
			ob4.put("totalepython",totalepython);
			ob4.put("nessunastatistica", null);
			array.add(ob4);
		}
		if(totaletypescript!=0) {
		 s5=(r5/totaletypescript)*100;
	    ss5=(f5/totaletypescript)*100;
	    double p5=(rr5/totaletypescript)*100;
	    double pp5=(ff5/totalepython)*100;
		ob5.put("totaletypescript", totaletypescript);
		ob5.put("remotetypescript", r5);
		ob5.put("noremotetypescript", rr5);
		ob5.put("fulltypescript",f5);
		ob5.put("parttypescript", ff5);
		ob5.put("percentualenoremotetypescript", p5);
		ob5.put("percentualeremotetypescript", s5);
		ob5.put("percentualefulltypescript", ss5);
		ob5.put("percentualeparttypescript", pp5);
		array.add(ob5);
		}else {
		ob5.put("totaletypescript",totaletypescript);
		ob5.put("nessunastatistica", null);
		array.add(ob5);}
		return array;
	}
	/**
	 * metodo che effettua il filtraggio delle statistiche effettuate sui linguaggi tra quelli scelti dal programmatore
	 * @param linguaggi su cui filtrare, tra quelli scelti dal programmatore
	 * @param offerte su cui fare statistiche
	 * @return statistiche filtrate
	 */
	
		public JSONArray filtraggioStatsLin(JSONArray linguaggi,ArrayList<Lavori> offerte) {
			String[]lin= new String[linguaggi.size()];
			double r1=0, r2=0,r3=0,r4=0,r5=0,s1=0,s2=0,s3=0,s4=0,s5=0;
			double f1=0, f2=0,f3=0,f4=0,f5=0,ss1=0,ss2=0,ss3=0,ss4=0,ss5=0;
			double rr1=0,rr2=0,rr3=0,rr4=0,rr5=0;
			double ff1=0,ff2=0,ff3=0,ff4=0,ff5=0;
			double totalekotlin=0;
			double totaleruby=0;
			double totalejavas=0;
			double totalepython=0;
            double totaletypescript=0;
            int count=0;
            for(Object o:linguaggi) {
        		JSONObject ob= new JSONObject();
        		ob=(JSONObject)o;
        		lin[count]=(String)ob.get("lin");
        		count++;
        	}
				
					 for(Lavori z:offerte) {
						 for(String c:lin) {
						 for(String l:z.getLinguaggi()) {
						  if(l.equals(c)) {
							  if(l.contains("kotlin")){
								  totalekotlin ++;
								  if(z.getRemoto()==true) {
										r1++;}
								  else {
									  rr1++;
								  }
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
									   f1++;}
								  else{
									  ff1++;}
								  }
							  if(l.contains("ruby")){
								  totaleruby ++;
								  if(z.getRemoto()==true ) {
										r2++;}
								  else {
									  rr2++;
								  }
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
									   f2++;}else {
										   ff2++;
									   }}
							  if(l.contains("javascript")){
								  totalejavas ++;
								  if(z.getRemoto()==true ) {
										r3++;}
								  else {
									  rr3++;
								  }
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
									   f3++;}else {
										   ff3++;
									   }}
							  if(l.contains("python")){
								  totalepython ++;
								  if(z.getRemoto()==true ) {
										r4++;}
								  else {
									  rr4++;
								  }
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
									   f4++;}else {
										   ff4++;
									   }}
							  if(l.contains("typescript")){
								  totaletypescript ++;
								  if(z.getRemoto()==true) {
										r5++;}
								  else {
									  rr5++;
								  }
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
									   f5++;}
								  else {
									  ff5++;
								  }
								  }}}}}
				JSONArray array= new JSONArray();
				JSONObject ob1= new JSONObject();
				JSONObject ob2= new JSONObject();
				JSONObject ob3= new JSONObject();
				JSONObject ob4= new JSONObject();
				JSONObject ob5= new JSONObject();
				if(totalekotlin!=0) {
				ss1=(f1/totalekotlin)*100;
				 s1=(r1/totalekotlin)*100;
				 double p1=(rr1/totalekotlin)*100;
				 double pp1=(ff1/totalekotlin)*100;
				 ob1.put("totalekotlin", totalekotlin);
				 ob1.put("remotekotlin", r1);
				 ob1.put("noremotekotlin",rr1);
				 ob1.put("fulljava", f1);
				 ob1.put("partkotlin", ff1);
				 ob1.put("percentualenoremotekotlin", p1);
				 ob1.put("percentualeremotekotlin", s1);
				 ob1.put("percentualepartkotlin", pp1);
				 ob1.put("percentualefullkotlin", ss1);
				array.add(ob1);}
				if(totaleruby!=0) {
				 s2=(r2/totaleruby)*100;
				ss2=(f2/totaleruby)*100;
				double p2=(rr2/totaleruby)*100;
				double pp2=(ff2/totaleruby)*100;
				ob2.put("totaleruby", totaleruby);
				ob2.put("remoteruby", r2);
				ob2.put("noremoteruby", rr2);
				ob2.put("fullruby", f2);
				ob2.put("partruby", ff2);
				ob2.put("percentualeremoteruby", s2);
				ob2.put("percentualenoremoteruby", p2);
			    ob2.put("percentualefullruby", ss2);
			    ob2.put("percentualepartruby", pp2);
				array.add(ob2);
				}
				if(totalejavas!=0) {
					 s3=(r3/totalejavas)*100;
				    ss3=(f3/totalejavas)*100;
                   double p3=(rr3/totalejavas)*100;
                   double pp3=(ff3/totalejavas)*100;
					ob3.put("totalejavascript", totalejavas);
					ob3.put("remotejavascript",r3);
					ob3.put("noremotejavas", rr3);
					ob3.put("fulljavascript", f3);
					ob3.put("partjavas", ff3);
					ob3.put("percentualenoremotejavas", p3);
					ob3.put("percentualeremotejavas", s3);
					ob3.put("percentualefulljavas", ss3);
					ob3.put("percentualepartjavas", pp3);
					array.add(ob3);
				}
				if(totalepython!=0) {
				ss4=(f4/totalepython)*100;
			   s4=(r4/totalepython)*100;
               double p4=(rr4/totalepython)*100;
               double pp4=(ff4/totalepython)*100;
				ob4.put("totalepython", totalepython);
				ob4.put("remotepython", r4);
				ob4.put("noremotepython", rr4);
				ob4.put("fullpython", f4);
				ob4.put("partjava", ff4);
				ob4.put("percentualenoremotepython", p4);
				ob4.put("percentualeremotepython", s4);
				ob4.put("percentualefullpython", ss4);
				array.add(ob4);}
				if(totaletypescript!=0) {
				 s5=(r5/totaletypescript)*100;
			    ss5=(f5/totaletypescript)*100;
			    double p5=(rr5/totaletypescript)*100;
			    double pp5=(ff5/totaletypescript)*100;
				ob5.put("totaletypescript", totaletypescript);
				ob5.put("remotetypescript", r5);
				ob5.put("noremotetypescript", rr5);
				ob5.put("fulltypescript",f5);
				ob5.put("parttypescript", ff5);
				ob5.put("percentualeremotetypescript", s5);
				ob5.put("percentualenoremotetypescript", p5);
				ob5.put("percentualeparttypescript", pp5);
				ob5.put("percentualefulltypescript", ss5);
				array.add(ob5);
				}
				return array;
				
			}
		/**
		 * metodo che effettua il filtraggio delle statistiche sui linguaggi in base al link specificato
		 * @param offerte non filtrate
		 * @param link in base a cui effettuare il filtraggio delle statistiche
		 * @return statistiche filtrate
		 */
		public JSONArray filtraggioLink(ArrayList<Lavori> offerte,String link) {
			double r1=0, r2=0,r3=0,r4=0,r5=0,s1=0,s2=0,s3=0,s4=0,s5=0;
			double f1=0, f2=0,f3=0,f4=0,f5=0,ss1=0,ss2=0,ss3=0,ss4=0,ss5=0;
			double rr1=0,rr2=0,rr3=0,rr4=0,rr5=0;
			double ff1=0,ff2=0,ff3=0,ff4=0,ff5=0;
			double totalekotlin=0;
			double totaleruby=0;
			double totalejavas=0;
			double totalepython=0;
	        double totaletypescript=0;
	        for(Lavori z:offerte) {
	        	if(z.getSitoWeb().contains(link)) {
	        	if(z.getLinguaggi().contains("kotlin")){
					  totalekotlin ++;
					  if(z.getRemoto()==true) {
							r1++;}
					  else {
						  rr1++;
					  }
					  if(z.getOrarioLavoro()!=null) {
						   f1++;}
					  else{
						  ff1++;}
					  }
				  if(z.getLinguaggi().contains("ruby")){
					  totaleruby ++;
					  if(z.getRemoto()==true ) {
							r2++;}
					  else {
						  rr2++;
					  }
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
						   f2++;}
					  else{
						  ff2++;}
					  }
				  if(z.getLinguaggi().contains("javascript")){
					  totalejavas ++;
					  if(z.getRemoto()==true ) {
							r3++;}
					  else {
						  rr3++;
					  }
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
						   f3++;}else{
							   ff3++;}
						   }
				  if(z.getLinguaggi().contains("python")){
					  totalepython ++;
					  if(z.getRemoto()==true ) {
							r4++;}
					  else {
						  rr4++;
					  }
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
						   f4++;}else {
							   ff4++;
						   }}
				  if(z.getLinguaggi().contains("typescript")){
					  totaletypescript ++;
					  if(z.getRemoto()==true) {
							r5++;}
					  else {
						  rr5++;
					  }
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
						   f5++;}else {
							   ff5++;
						   }}
	        }}
	        JSONArray array= new JSONArray();
			JSONObject ob1= new JSONObject();
			JSONObject ob2= new JSONObject();
			JSONObject ob3= new JSONObject();
			JSONObject ob4= new JSONObject();
			JSONObject ob5= new JSONObject();
			if(totalekotlin!=0) {
			 ss1=(f1/totalekotlin)*100;
			 s1=(r1/totalekotlin)*100;
			 double p1=(rr1/totalekotlin)*100;
			 double pp1=(ff1/totalekotlin)*100;
			 ob1.put("totalekotlin", totalekotlin);
			 ob1.put("noremotekotlin", rr1);
			 ob1.put("remotekotlin", r1);
			 ob1.put("fullkotlin", f1);
			 ob1.put("partkotlin",ff1);
			 ob1.put("percentualenoremotekotlin", p1);
			 ob1.put("percentualeremotekotlin", s1);
			 ob1.put("percentualefullkotlin", ss1);
			 ob1.put("percentualepartkotlin", pp1);
			 array.add(ob1);}
			else {
				ob1.put("totalekotlin", totalekotlin);
				ob1.put("nessunastatistica", null);
				array.add(ob1);
			}
			if(totaleruby!=0) {
			 s2=(r2/totaleruby)*100;
			ss2=(f2/totaleruby)*100;
			double p2=(rr2/totaleruby)*100;
			double pp2=(ff2/totalekotlin)*100;
			ob2.put("totaleruby", totaleruby);
			ob2.put("remoteruby", r2);
			ob2.put("noremoteruby", rr2);
			ob2.put("fullruby", f2);
			ob2.put("partkotlin", ff2);
			ob2.put("percentualenoremoteruby", p2);
			ob2.put("percentualeremoteruby", s2);
		    ob2.put("percentualefullruby", ss2);
		    ob2.put("percentualepartruby", pp2);
			array.add(ob2);
			}
			else {
				ob2.put("totaleruby", totaleruby);
				ob2.put("nessunastatistica", null);
				array.add(ob2);
			}
			if(totalejavas!=0) {
				 s3=(r3/totalejavas)*100;
			   ss3=(f3/totalejavas)*100;
               double p3=(rr3/totalejavas)*100;
               double pp3=(ff3/totalejavas)*100;
           
				ob3.put("totalejavascript", totalejavas);
			    ob3.put("noremotejavascript", rr3);
				ob3.put("remotejavascript",r3);
				ob3.put("partjavascript", ff3);
				ob3.put("fulljavascript", f3);
				ob3.put("parcentualenoremotejavas",p3);
				ob3.put("percentualeremotejavascript", s3);
				ob3.put("percentualefulljavascript", ss3);
				ob3.put("percentualepartjavascript", pp3);
				array.add(ob3);
			}
			else {
				ob3.put("totalejavascript",totalejavas);
				ob3.put("nessunastatistica", null);
				array.add(ob3);
			}
			if(totalepython!=0) {
			ss4=(f4/totalepython)*100;
		   s4=(r4/totalepython)*100;
           double p4=(rr4/totalepython)*100;
           double pp4=(ff4/totalepython)*100;
			ob4.put("totalepython", totalepython);
			ob4.put("noremotepython",rr4);
			ob4.put("remotepython", r4);
			ob4.put("partpython", ff4);
			ob4.put("fullpython", f4);
			ob4.put("percentualenoremotepython", p4);
			ob4.put("percentualeremotepython", s4);
			ob4.put("percentualefullpython", ss4);
			ob4.put("percentualepartpython", pp4);
			array.add(ob4);}
			else {
				ob4.put("totalepython",totalepython);
				ob4.put("nessunastatistica", null);
				array.add(ob4);
			}
			if(totaletypescript!=0) {
			 s5=(r5/totaletypescript)*100;
		    ss5=(f5/totaletypescript)*100;
		    double p5=(rr5/totaletypescript)*100;
		    double pp5=(ff5/totaletypescript)*100;
			ob5.put("totaletypescript", totaletypescript);
			ob5.put("noremotetypescript", p5);
			ob5.put("remotetypescript", r5);
			ob5.put("fulltypescript",f5);
			ob5.put("parttypescript", pp5);
			ob5.put("percentualenoremotetypescript", p5);
			ob5.put("percentualeremotetypescript", s5);
			ob5.put("percentualefulltypescript", ss5);
			ob5.put("percentualeparttypescript", pp5);
			array.add(ob5);
			}else {
			ob5.put("totaletypescript",totaletypescript);
			ob5.put("nessunastatistica", null);
			array.add(ob5);}
			return array;
		}
		/**
		 * metodo che effettua il filtraggio delle statistiche sui linguaggi in base alla data specificata 
		 * @param offerte su cui fare statistiche
		 * @param data in base a cui filtrare le statistiche
		 * @return statistiche filtrate in base alla data
		 */
		public JSONArray filtraggioData(ArrayList<Lavori> offerte,String data) {
			double r1=0, r2=0,r3=0,r4=0,r5=0,s1=0,s2=0,s3=0,s4=0,s5=0;
			double f1=0, f2=0,f3=0,f4=0,f5=0,ss1=0,ss2=0,ss3=0,ss4=0,ss5=0;
			double rr1=0,rr2=0,rr3=0,rr4=0,rr5=0;
			double ff1=0,ff2=0,ff3=0,ff4=0,ff5=0;
			double totalekotlin=0;
			double totaleruby=0;
			double totalejavas=0;
			double totalepython=0;
	        double totaletypescript=0;
	        for(Lavori z:offerte) {
	        	if(z.getData().contains(data)) {
	        	if(z.getLinguaggi().contains("kotlin")){
					  totalekotlin ++;
					  if(z.getRemoto()==true) {
							r1++;}
					  else {
						  rr1++;
					  }
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
					  {
						   f1++; }
					  else {
						  ff1++;
					  }}
				  if(z.getLinguaggi().contains("ruby")){
					  totaleruby ++;
					  if(z.getRemoto()==true ) {
							r2++;}
					  else {
						  rr2++;
					  }
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
						  
						   f2++;}
					  else {
						  ff2++;
					  }}
				  if(z.getLinguaggi().contains("javascript")){
					  totalejavas ++;
					  if(z.getRemoto()==true ) {
							r3++;}
					  else {
						  rr3++;
					  }
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
					  {
						   f3++;}
					  else {
						  ff3++;
					  }}
				  if(z.getLinguaggi().contains("python")){
					  totalepython ++;
					  if(z.getRemoto()==true ) {
							r4++;}else {
								rr4++;
							}
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
						   f4++;}
					  else {
						  ff4++;}
					  }
				  if(z.getLinguaggi().contains("typescript")){
					  totaletypescript ++;
					  if(z.getRemoto()==true) {
							r5++;}
					  else {
						  rr5++;
					  }
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract")))) {
						   f5++;}else {
							   ff5++;
						   }}
	        }}
	        JSONArray array= new JSONArray();
			JSONObject ob1= new JSONObject();
			JSONObject ob2= new JSONObject();
			JSONObject ob3= new JSONObject();
			JSONObject ob4= new JSONObject();
			JSONObject ob5= new JSONObject();
			if(totalekotlin!=0) {ss1=(f1/totalekotlin)*100;
			 s1=(r1/totalekotlin)*100;
			 double p1=(rr1/totalekotlin)*100;
			 double pp1=(ff1/totalekotlin)*100;
			 ob1.put("totalekotlin", totalekotlin);
			 ob1.put("noremotekotlin", rr1);
			 ob1.put("remotekotlin", r1);
			 ob1.put("partkotlin", ff1);
			 ob1.put("fullkotlin", f1);
			 ob1.put("percentualenoremotekotlin", p1);
			 ob1.put("percentualeremotekotlin", s1);
			 ob1.put("percentualefullkotlin", ss1);
			 ob1.put("percentualepartkotlin", pp1);
			 array.add(ob1);}
			else {
				ob1.put("totalekotlin", totalekotlin);
				ob1.put("nessunastatistica", null);
				array.add(ob1);
			}
			if(totaleruby!=0) {
			 s2=(r2/totaleruby)*100;
			ss2=(f2/totaleruby)*100;
			double p2=(rr2/totaleruby)*100;
			double pp2=(ff2/totaleruby)*100;
			ob2.put("totaleruby", totaleruby);
			ob2.put("remoteruby", r2);
			ob2.put("noremoteruby", rr2);
			ob2.put("partruby", ff2);
			ob2.put("fullruby", f2);
			ob2.put("percentualenoremoteruby", p2);
			ob2.put("percentualeremoteruby", s2);
		    ob2.put("percentualefullruby", ss2);
		    ob2.put("percentualepartruby", pp2);
			array.add(ob2);
			}
			else {
				ob2.put("totaleruby", totaleruby);
				ob2.put("nessunastatistica", null);
				array.add(ob2);
			}
			if(totalejavas!=0) {
				s3=(r3/totalejavas)*100;
			    ss3=(f3/totalejavas)*100;
                double p3=(rr3/totalejavas)*100;
                double pp3=(ff3/totalejavas)*100;
				ob3.put("totalejavascript", totalejavas);
				ob3.put("noremotejavascript", rr3);
				ob3.put("remotejavascript",r3);
				ob3.put("partjavascript", ff3);
				ob3.put("fulljavascript", f3);
				ob3.put("percentualenoremotejavascript", p3);
				ob3.put("percentualeremotejavas", s3);
				ob3.put("percentualefulljavas", ss3);
				ob3.put("percentualepartjavascript", pp3);
				array.add(ob3);
			}
			else {
				ob3.put("totalejavascript",totalejavas);
				ob3.put("nessunastatistica", null);
				array.add(ob3);
			}
			if(totalepython!=0) {
			ss4=(f4/totalepython)*100;
		    s4=(r4/totalepython)*100;
            double p4=(rr4/totalepython)*100;
            double pp4=(ff4/totalepython)*100;
			ob4.put("totalepython", totalepython);
			ob4.put("noremotepython",rr4);
			ob4.put("remotepython", r4);
			ob4.put("partpython", ff4);
			ob4.put("fullpython", f4);
			ob4.put("percentualenoremotepython", p4);
			ob4.put("percentualeremotepython", s4);
			ob4.put("percentualefullpython", ss4);
			ob4.put("percentualepartpython", pp4);
			array.add(ob4);}
			else {
				ob4.put("totalepython",totalepython);
				ob4.put("nessunastatistica", null);
				array.add(ob4);
			}
			if(totaletypescript!=0) {
			s5=(r5/totaletypescript)*100;
		    ss5=(f5/totaletypescript)*100;
		    double p5=(rr5/totaletypescript)*100;
		    double pp5=(ff5/totaletypescript)*100;
			ob5.put("totaletypescript", totaletypescript);
			ob5.put("noremotetypescript", rr5);
			ob5.put("remotetypescript", r5);
			ob5.put("parttypescript", ff5);
			ob5.put("fulltypescript",f5);
			ob5.put("percentualenoremotetypescript", p5);
			ob5.put("percentualeremotetypescript", s5);
			ob5.put("percentualefulltypescript", ss5);
			ob5.put("percentualeparttypescript", pp5);
			array.add(ob5);
			}else {
			ob5.put("totaletypescript",totaletypescript);
			ob5.put("nessunastatistica", null);
			array.add(ob5);}
			return array;
		}
			
			}
			