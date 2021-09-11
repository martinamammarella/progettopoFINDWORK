package com.example.FINDWORK.utils;
import com.example.FINDWORK.model.*;
import java.util.Date;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
public class filteresStatsLinguaggi extends fStats{
	public filteresStatsLinguaggi () {};
	public JSONArray statsLin(ArrayList<Lavori> offerte) {
		double r1=0, r2=0,r3=0,r4=0,r5=0,s1=0,s2=0,s3=0,s4=0,s5=0;
		double f1=0, f2=0,f3=0,f4=0,f5=0,ss1=0,ss2=0,ss3=0,ss4=0,ss5=0;
		double totalekotlin=0;
		double totaleruby=0;
		double totalejavas=0;
		double totalepython=0;
        double totaletypescript=0;
        
        for(Lavori z:offerte) {
        	if(z.getLinguaggi().contains("kotlin")){
				  totalekotlin ++;
				  if(z.getRemoto()==true)
						r1++;
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
					   f1++; }
			  if(z.getLinguaggi().contains("ruby")){
				  totaleruby ++;
				  if(z.getRemoto()==true )
						r2++;
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
					   f2++;}
			  if(z.getLinguaggi().contains("javascript")){
				  totalejavas ++;
				  if(z.getRemoto()==true )
						r3++;
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
					   f3++;}
			  if(z.getLinguaggi().contains("python")){
				  totalepython ++;
				  if(z.getRemoto()==true )
						r4++;
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
					   f4++;}
			  if(z.getLinguaggi().contains("typescript")){
				  totaletypescript ++;
				  if(z.getRemoto()==true)
						r5++;
				  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
					   f5++;}
        }
        JSONArray array= new JSONArray();
		JSONObject ob1= new JSONObject();
		JSONObject ob2= new JSONObject();
		JSONObject ob3= new JSONObject();
		JSONObject ob4= new JSONObject();
		JSONObject ob5= new JSONObject();
		if(totalekotlin!=0) {ss1=(f1/totalekotlin)*100;
		 s1=(r1/totalekotlin)*100;
		 ob1.put("totalekotlin", totalekotlin);
			ob1.put("remotekotlin", r1);
			ob1.put("fulljava", f1);
			ob1.put("percentualeremotekotlin", s1);
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
		
		ob2.put("totaleruby", totaleruby);
		ob2.put("remoteruby", r2);
		ob2.put("fullruby", f2);
		ob2.put("percentualeremoteruby", s2);
	    ob2.put("percentualefullruby", ss2);
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

			ob3.put("totalejavascript", totalejavas);
			ob3.put("remotejavascript",r3);
			ob3.put("fulljavascript", f3);
			ob3.put("percentualeremotejavas", s3);
			ob3.put("percentualefulljavas", ss3);
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

		ob4.put("totalepython", totalepython);
		ob4.put("remotepython", r4);
		ob4.put("fullpython", f4);
		ob4.put("percentualeremotepython", s4);
		ob4.put("percentualefullpython", ss4);
		array.add(ob4);}
		else {
			ob4.put("totalepython",totalepython);
			ob4.put("nessunastatistica", null);
			array.add(ob4);
		}
		if(totaletypescript!=0) {
		 s5=(r5/totaletypescript)*100;
	    ss5=(f5/totaletypescript)*100;
		ob5.put("totaletypescript", totaletypescript);
		ob5.put("remotetypescript", r5);
		ob5.put("fulltypescript",f5);
		ob5.put("percentualeremotetypescript", s5);
		ob5.put("percentualefulltypescript", ss5);
		array.add(ob5);
		}else {
		ob5.put("totaletypescript",totaletypescript);
		ob5.put("nessunastatistica", null);
		array.add(ob5);}
		return array;
	}
	
		public JSONArray filtraggioStatsLin(JSONArray linguaggi,ArrayList<Lavori> offerte) {
			String[]lin= new String[linguaggi.size()];
			double r1=0, r2=0,r3=0,r4=0,r5=0,s1=0,s2=0,s3=0,s4=0,s5=0;
			double f1=0, f2=0,f3=0,f4=0,f5=0,ss1=0,ss2=0,ss3=0,ss4=0,ss5=0;
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
								  if(z.getRemoto()==true)
										r1++;
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
									   f1++; }
							  if(l.contains("ruby")){
								  totaleruby ++;
								  if(z.getRemoto()==true )
										r2++;
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
									   f2++;}
							  if(l.contains("javascript")){
								  totalejavas ++;
								  if(z.getRemoto()==true )
										r3++;
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
									   f3++;}
							  if(l.contains("python")){
								  totalepython ++;
								  if(z.getRemoto()==true )
										r4++;
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
									   f4++;}
							  if(l.contains("typescript")){
								  totaletypescript ++;
								  if(z.getRemoto()==true)
										r5++;
								  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
									   f5++;}}}}}
				JSONArray array= new JSONArray();
				JSONObject ob1= new JSONObject();
				JSONObject ob2= new JSONObject();
				JSONObject ob3= new JSONObject();
				JSONObject ob4= new JSONObject();
				JSONObject ob5= new JSONObject();
				if(totalekotlin!=0) {ss1=(f1/totalekotlin)*100;
				 s1=(r1/totalekotlin)*100;
				 ob1.put("totalekotlin", totalekotlin);
					ob1.put("remotekotlin", r1);
					ob1.put("fulljava", f1);
					ob1.put("percentualeremotekotlin", s1);
					ob1.put("percentualefullkotlin", ss1);
					array.add(ob1);}
				if(totaleruby!=0) {
				 s2=(r2/totaleruby)*100;
				ss2=(f2/totaleruby)*100;
				
				ob2.put("totaleruby", totaleruby);
				ob2.put("remoteruby", r2);
				ob2.put("fullruby", f2);
				ob2.put("percentualeremoteruby", s2);
			    ob2.put("percentualefullruby", ss2);
				array.add(ob2);
				}
				if(totalejavas!=0) {
					 s3=(r3/totalejavas)*100;
				   ss3=(f3/totalejavas)*100;

					ob3.put("totalejavascript", totalejavas);
					ob3.put("remotejavascript",r3);
					ob3.put("fulljavascript", f3);
					ob3.put("percentualeremotejavas", s3);
					ob3.put("percentualefulljavas", ss3);
					array.add(ob3);
				}
				if(totalepython!=0) {
				ss4=(f4/totalepython)*100;
			   s4=(r4/totalepython)*100;

				ob4.put("totalepython", totalepython);
				ob4.put("remotepython", r4);
				ob4.put("fullpython", f4);
				ob4.put("percentualeremotepython", s4);
				ob4.put("percentualefullpython", ss4);
				array.add(ob4);}
				if(totaletypescript!=0) {
				 s5=(r5/totaletypescript)*100;
			    ss5=(f5/totaletypescript)*100;
				ob5.put("totaletypescript", totaletypescript);
				ob5.put("remotetypescript", r5);
				ob5.put("fulltypescript",f5);
				ob5.put("percentualeremotetypescript", s5);
				ob5.put("percentualefulltypescript", ss5);
				array.add(ob5);
				}
				return array;
				
			}
		public JSONArray filtraggioLink(ArrayList<Lavori> offerte,String link) {
			double r1=0, r2=0,r3=0,r4=0,r5=0,s1=0,s2=0,s3=0,s4=0,s5=0;
			double f1=0, f2=0,f3=0,f4=0,f5=0,ss1=0,ss2=0,ss3=0,ss4=0,ss5=0;
			double totalekotlin=0;
			double totaleruby=0;
			double totalejavas=0;
			double totalepython=0;
	        double totaletypescript=0;
	        for(Lavori z:offerte) {
	        	if(z.getSitoWeb().contains(link)) {
	        	if(z.getLinguaggi().contains("kotlin")){
					  totalekotlin ++;
					  if(z.getRemoto()==true)
							r1++;
					  if(z.getOrarioLavoro()!=null)
						   f1++; }
				  if(z.getLinguaggi().contains("ruby")){
					  totaleruby ++;
					  if(z.getRemoto()==true )
							r2++;
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
						   f2++;}
				  if(z.getLinguaggi().contains("javascript")){
					  totalejavas ++;
					  if(z.getRemoto()==true )
							r3++;
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
						   f3++;}
				  if(z.getLinguaggi().contains("python")){
					  totalepython ++;
					  if(z.getRemoto()==true )
							r4++;
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
						   f4++;}
				  if(z.getLinguaggi().contains("typescript")){
					  totaletypescript ++;
					  if(z.getRemoto()==true)
							r5++;
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
						   f5++;}
	        }}
	        JSONArray array= new JSONArray();
			JSONObject ob1= new JSONObject();
			JSONObject ob2= new JSONObject();
			JSONObject ob3= new JSONObject();
			JSONObject ob4= new JSONObject();
			JSONObject ob5= new JSONObject();
			if(totalekotlin!=0) {ss1=(f1/totalekotlin)*100;
			 s1=(r1/totalekotlin)*100;
			 ob1.put("totalekotlin", totalekotlin);
				ob1.put("remotekotlin", r1);
				ob1.put("fulljava", f1);
				ob1.put("percentualeremotekotlin", s1);
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
			
			ob2.put("totaleruby", totaleruby);
			ob2.put("remoteruby", r2);
			ob2.put("fullruby", f2);
			ob2.put("percentualeremoteruby", s2);
		    ob2.put("percentualefullruby", ss2);
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

				ob3.put("totalejavascript", totalejavas);
				ob3.put("remotejavascript",r3);
				ob3.put("fulljavascript", f3);
				ob3.put("percentualeremotejavas", s3);
				ob3.put("percentualefulljavas", ss3);
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

			ob4.put("totalepython", totalepython);
			ob4.put("remotepython", r4);
			ob4.put("fullpython", f4);
			ob4.put("percentualeremotepython", s4);
			ob4.put("percentualefullpython", ss4);
			array.add(ob4);}
			else {
				ob4.put("totalepython",totalepython);
				ob4.put("nessunastatistica", null);
				array.add(ob4);
			}
			if(totaletypescript!=0) {
			 s5=(r5/totaletypescript)*100;
		    ss5=(f5/totaletypescript)*100;
			ob5.put("totaletypescript", totaletypescript);
			ob5.put("remotetypescript", r5);
			ob5.put("fulltypescript",f5);
			ob5.put("percentualeremotetypescript", s5);
			ob5.put("percentualefulltypescript", ss5);
			array.add(ob5);
			}else {
			ob5.put("totaletypescript",totaletypescript);
			ob5.put("nessunastatistica", null);
			array.add(ob5);}
			return array;
		}
		public JSONArray filtraggioData(ArrayList<Lavori> offerte,String data) {
			double r1=0, r2=0,r3=0,r4=0,r5=0,s1=0,s2=0,s3=0,s4=0,s5=0;
			double f1=0, f2=0,f3=0,f4=0,f5=0,ss1=0,ss2=0,ss3=0,ss4=0,ss5=0;
			double totalekotlin=0;
			double totaleruby=0;
			double totalejavas=0;
			double totalepython=0;
	        double totaletypescript=0;
	        for(Lavori z:offerte) {
	        	if(z.getData().contains(data)) {
	        	if(z.getLinguaggi().contains("kotlin")){
					  totalekotlin ++;
					  if(z.getRemoto()==true)
							r1++;
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
						   f1++; }
				  if(z.getLinguaggi().contains("ruby")){
					  totaleruby ++;
					  if(z.getRemoto()==true )
							r2++;
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
						   f2++;}
				  if(z.getLinguaggi().contains("javascript")){
					  totalejavas ++;
					  if(z.getRemoto()==true )
							r3++;
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
						   f3++;}
				  if(z.getLinguaggi().contains("python")){
					  totalepython ++;
					  if(z.getRemoto()==true )
							r4++;
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
						   f4++;}
				  if(z.getLinguaggi().contains("typescript")){
					  totaletypescript ++;
					  if(z.getRemoto()==true)
							r5++;
					  if(z.getOrarioLavoro()!=null &&(!(z.getOrarioLavoro().equals("contract"))))
						   f5++;}
	        }}
	        JSONArray array= new JSONArray();
			JSONObject ob1= new JSONObject();
			JSONObject ob2= new JSONObject();
			JSONObject ob3= new JSONObject();
			JSONObject ob4= new JSONObject();
			JSONObject ob5= new JSONObject();
			if(totalekotlin!=0) {ss1=(f1/totalekotlin)*100;
			 s1=(r1/totalekotlin)*100;
			 ob1.put("totalekotlin", totalekotlin);
				ob1.put("remotekotlin", r1);
				ob1.put("fulljava", f1);
				ob1.put("percentualeremotekotlin", s1);
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
			
			ob2.put("totaleruby", totaleruby);
			ob2.put("remoteruby", r2);
			ob2.put("fullruby", f2);
			ob2.put("percentualeremoteruby", s2);
		    ob2.put("percentualefullruby", ss2);
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

				ob3.put("totalejavascript", totalejavas);
				ob3.put("remotejavascript",r3);
				ob3.put("fulljavascript", f3);
				ob3.put("percentualeremotejavas", s3);
				ob3.put("percentualefulljavas", ss3);
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

			ob4.put("totalepython", totalepython);
			ob4.put("remotepython", r4);
			ob4.put("fullpython", f4);
			ob4.put("percentualeremotepython", s4);
			ob4.put("percentualefullpython", ss4);
			array.add(ob4);}
			else {
				ob4.put("totalepython",totalepython);
				ob4.put("nessunastatistica", null);
				array.add(ob4);
			}
			if(totaletypescript!=0) {
			 s5=(r5/totaletypescript)*100;
		    ss5=(f5/totaletypescript)*100;
			ob5.put("totaletypescript", totaletypescript);
			ob5.put("remotetypescript", r5);
			ob5.put("fulltypescript",f5);
			ob5.put("percentualeremotetypescript", s5);
			ob5.put("percentualefulltypescript", ss5);
			array.add(ob5);
			}else {
			ob5.put("totaletypescript",totaletypescript);
			ob5.put("nessunastatistica", null);
			array.add(ob5);}
			return array;
		}
			
			}
			