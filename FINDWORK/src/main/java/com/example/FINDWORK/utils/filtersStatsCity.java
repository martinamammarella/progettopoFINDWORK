package com.example.FINDWORK.utils;
import com.example.FINDWORK.model.*;
import org.json.simple.*;

import java.util.Vector;



import java.util.ArrayList;
import java.util.Date;
import java.math.*;

public class filtersStatsCity extends fStats {
	
	public filtersStatsCity() {super();};
	public filtersStatsCity(ArrayList<Lavori> offerte,String[]lin,String[] city,String sito,String data) {
		super(offerte,lin,city,sito,data);
	}
	public JSONArray statsCity(ArrayList<Lavori> offerte) {
		double r1=0, r2=0,r3=0,r4=0,r5=0;
		double f1=0, f2=0,f3=0,f4=0,f5=0;
		double totalechicago=0;
		double totaleberlino=0;
		int totaleseattle=0;
		int totalebrooklyn=0;
		int totaleplano=0;
		for(Lavori z:offerte) {
			 if(z.getCity()!=null) {
				 if(z.getCity().contains("Chicago, IL")){
					  totalechicago++;
					  if(z.getRemoto()==true)
							r1++;
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
						  f1++; 
					  }
				  if(z.getCity().contains("Berlin, Germany")){
					  totaleberlino++;
					  if(z.getRemoto()==true)
							r2++;
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
					  f2++;
					  }
				  if(z.getCity().contains("Seattle, WA")){
					  totaleseattle++;
					  if(z.getRemoto()==true)
							r3++;
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
						  f3++;
					  }
				  if(z.getCity().contains("Brooklyn, NY")){
					  totalebrooklyn++;
					  if(z.getRemoto()==true )
							r4++;
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
					  f4++;
					  }
				  if(z.getCity().contains("Plano")){
					  totaleplano++;
					  if(z.getRemoto()==true )
							r5++;
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
					   f5++;}
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
ob1.put("totalechicago",totalechicago);
ob1.put("remoteChicago", r1);
ob1.put("fullChicago", f1);
ob1.put("percentualeremoteChicago", s1);
ob1.put("percentualefullChicago",ss1);
array.add(ob1);}
else {
	ob1.put("totalechicago", totalechicago);
	ob1.put("nessuna statistica", null);
	array.add(ob1);
}
if(totaleberlino!=0) {
double s2= (r2/totaleberlino)*100;
double ss2= (f2/totaleberlino*100);
ob2.put("totaleberlino", totaleberlino);
ob2.put("remoteberlino", r2);
ob2.put("fullberlino", f2);
ob2.put("percentualeremoteberlino",s2);
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
ob3.put("totaleSeattle", totaleseattle);
ob3.put("remoteSeattle",r3);
ob3.put("fullSeattle", f3);
ob3.put("percentualeremoteSeattle", s3);
ob3.put("percentualefullSeattle", ss3);
array.add(ob3);}
else {
	ob3.put("totaleseattle", totaleseattle);
	ob3.put("nessuna statistica", null);
	array.add(ob3);
}
if(totalebrooklyn!=0) {
double s4=(r4/totalebrooklyn)*100;
double ss4=(f4/totalebrooklyn)*100;
ob4.put("totalebrooklyn", totalebrooklyn);
ob4.put("remoteBrooklyn", r4);
ob4.put("fullBrooklyn", f4);
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
ob5.put("totaleplano", totaleplano);
ob5.put("remotePlano", r5);
ob5.put("fullPlano", f5);
ob5.put("percentualeremotePlano", r5);
ob5.put("percentualefullPlano", ss5);
array.add(ob5);}
else {
	ob5.put("totaleplano", totaleplano);
	ob5.put("nessuna statistica", null);
	array.add(ob5);
}
return array;
		
	}
	
	
	public JSONArray filtraggioStatsCity(JSONArray scity,ArrayList<Lavori> offerte) {
	String[]city= new String[scity.size()];
	double r1=0, r2=0,r3=0,r4=0,r5=0;
	double f1=0, f2=0,f3=0,f4=0,f5=0;
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
											  if(z.getRemoto()==true)
													r1++;
											  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
												  f1++; 
											  }
										  if(z.getCity().contains("Berlin, Germany")){
											  totaleberlino++;
											  if(z.getRemoto()==true)
													r2++;
											 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
											  f2++;
											  }
										  if(z.getCity().contains("Seattle, WA")){
											  totaleseattle++;
											  if(z.getRemoto()==true)
													r3++;
											  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
												  f3++;
											  }
										  if(z.getCity().contains("Brooklyn, NY")){
											  totalebrooklyn++;
											  if(z.getRemoto()==true )
													r4++;
											 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
											  f4++;
											  }
										  if(c.contains("Plano")){
											  totaleplano++;
											  if(z.getRemoto()==true )
													r5++;
											  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
											   f5++;}
											  }}}}
		JSONObject ob1= new JSONObject();
		JSONObject ob2= new JSONObject();
		JSONObject ob3= new JSONObject();
		JSONObject ob4= new JSONObject();
		JSONObject ob5= new JSONObject();
		JSONArray array= new JSONArray();
		if(totalechicago!=0) {
		
		double s1=(r1/totalechicago)*100;
		double ss1=(f1/totalechicago)*100;
		ob1.put("totalechicago",totalechicago);
		ob1.put("remoteChicago", r1);
		ob1.put("fullChicago", f1);
		ob1.put("percentualeremoteChicago", s1);
		ob1.put("percentualefullChicago",ss1);
		
		array.add(ob1);}
		if(totaleberlino!=0) {
		double s2= (r2/totaleberlino)*100;
		double ss2= (f2/totaleberlino*100);
		ob2.put("totaleberlino", totaleberlino);
		ob2.put("remoteberlino", r2);
		ob2.put("fullberlino", f2);
		ob2.put("percentualeremoteberlino",s2);
		ob2.put("percentualefullberlino",ss2);
		
		array.add(ob2);}
		if(totaleseattle!=0) {
		double s3=(r3/totaleseattle)*100;
		double ss3=(f3/totaleseattle)*100;
		ob3.put("totaleSeattle", totaleseattle);
		ob3.put("remoteSeattle",r3);
		ob3.put("fullSeattle", f3);
		ob3.put("percentualeremoteSeattle", s3);
		ob3.put("percentualefullSeattle", ss3);
		array.add(ob3);}
		if(totalebrooklyn!=0) {
		double s4=(r4/totalebrooklyn)*100;
		double ss4=(f4/totalebrooklyn)*100;
        ob4.put("totalebrooklyn", totalebrooklyn);
		ob4.put("remoteBrooklyn", r4);
		ob4.put("fullBrooklyn", f4);
		ob4.put("percentualeremoteBrooklyn", s4);
		ob4.put("percentualefullBrooklyn", ss4);
		array.add(ob4);}
		if(totaleplano!=0) {
	   double s5=(r5/totaleplano)*100;
		double ss5=(f5/totaleplano)*100;
		ob5.put("totaleplano", totaleplano);
		ob5.put("remotePlano", r5);
		ob5.put("fullPlano", f5);
		ob5.put("percentualeremotePlano", r5);
		ob5.put("percentualefullPlano", ss5);
		array.add(ob5);}
		return array;
		}
	public JSONArray filtraggioLink(ArrayList<Lavori>offerte,String link) {
		double r1=0, r2=0,r3=0,r4=0,r5=0;
		double f1=0, f2=0,f3=0,f4=0,f5=0;
		double totalechicago=0;
		double totaleberlino=0;
		int totaleseattle=0;
		int totalebrooklyn=0;
		int totaleplano=0;
		for(Lavori z:offerte) {
			 if(z.getCity()!=null) {
				 if(z.getSitoWeb().equals(link)) {
				 if(z.getCity().contains("Chicago, IL")){
					  totalechicago++;
					  if(z.getRemoto()==true)
							r1++;
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
						  f1++; 
					  }
				  if(z.getCity().contains("Berlin, Germany")){
					  totaleberlino++;
					  if(z.getRemoto()==true)
							r2++;
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
					  f2++;
					  }
				  if(z.getCity().contains("Seattle, WA")){
					  totaleseattle++;
					  if(z.getRemoto()==true)
							r3++;
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
						  f3++;
					  }
				  if(z.getCity().contains("Brooklyn, NY")){
					  totalebrooklyn++;
					  if(z.getRemoto()==true )
							r4++;
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
					  f4++;
					  }
				  if(z.getCity().contains("Plano")){
					  totaleplano++;
					  if(z.getRemoto()==true )
							r5++;
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
					   f5++;}
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
ob1.put("totalechicago",totalechicago);
ob1.put("remoteChicago", r1);
ob1.put("fullChicago", f1);
ob1.put("percentualeremoteChicago", s1);
ob1.put("percentualefullChicago",ss1);
array.add(ob1);}
else {
	ob1.put("totalechicago", totalechicago);
	ob1.put("nessuna statistica", null);
	array.add(ob1);
}
if(totaleberlino!=0) {
double s2= (r2/totaleberlino)*100;
double ss2= (f2/totaleberlino*100);
ob2.put("totaleberlino", totaleberlino);
ob2.put("remoteberlino", r2);
ob2.put("fullberlino", f2);
ob2.put("percentualeremoteberlino",s2);
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
ob3.put("totaleSeattle", totaleseattle);
ob3.put("remoteSeattle",r3);
ob3.put("fullSeattle", f3);
ob3.put("percentualeremoteSeattle", s3);
ob3.put("percentualefullSeattle", ss3);
array.add(ob3);}
else {
	ob3.put("totaleseattle", totaleseattle);
	ob3.put("nessuna statistica", null);
	array.add(ob3);
}
if(totalebrooklyn!=0) {
double s4=(r4/totalebrooklyn)*100;
double ss4=(f4/totalebrooklyn)*100;
ob4.put("totalebrooklyn", totalebrooklyn);
ob4.put("remoteBrooklyn", r4);
ob4.put("fullBrooklyn", f4);
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
ob5.put("totaleplano", totaleplano);
ob5.put("remotePlano", r5);
ob5.put("fullPlano", f5);
ob5.put("percentualeremotePlano", r5);
ob5.put("percentualefullPlano", ss5);
array.add(ob5);}
else {
	ob5.put("totaleplano", totaleplano);
	ob5.put("nessuna statistica", null);
	array.add(ob5);
}
return array;
		
	}
	public JSONArray filtraggioData(ArrayList<Lavori>offerte,String data) {
		double r1=0, r2=0,r3=0,r4=0,r5=0;
		double f1=0, f2=0,f3=0,f4=0,f5=0;
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
					  if(z.getRemoto()==true)
							r1++;
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
						  f1++; 
					  }
				  if(z.getCity().contains("Berlin, Germany")){
					  totaleberlino++;
					  if(z.getRemoto()==true)
							r2++;
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
					  f2++;
					  }
				  if(z.getCity().contains("Seattle, WA")){
					  totaleseattle++;
					  if(z.getRemoto()==true)
							r3++;
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
						  f3++;
					  }
				  if(z.getCity().contains("Brooklyn, NY")){
					  totalebrooklyn++;
					  if(z.getRemoto()==true )
							r4++;
					 if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
					  f4++;
					  }
				  if(z.getCity().contains("Plano")){
					  totaleplano++;
					  if(z.getRemoto()==true )
							r5++;
					  if(z.getOrarioLavoro()!=null&&(!(z.getOrarioLavoro().equals("contract"))))
					   f5++;}
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
ob1.put("totalechicago",totalechicago);
ob1.put("remoteChicago", r1);
ob1.put("fullChicago", f1);
ob1.put("percentualeremoteChicago", s1);
ob1.put("percentualefullChicago",ss1);
array.add(ob1);}
else {
	ob1.put("totalechicago", totalechicago);
	ob1.put("nessuna statistica", null);
	array.add(ob1);
}
if(totaleberlino!=0) {
double s2= (r2/totaleberlino)*100;
double ss2= (f2/totaleberlino*100);
ob2.put("totaleberlino", totaleberlino);
ob2.put("remoteberlino", r2);
ob2.put("fullberlino", f2);
ob2.put("percentualeremoteberlino",s2);
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
ob3.put("totaleSeattle", totaleseattle);
ob3.put("remoteSeattle",r3);
ob3.put("fullSeattle", f3);
ob3.put("percentualeremoteSeattle", s3);
ob3.put("percentualefullSeattle", ss3);
array.add(ob3);}
else {
	ob3.put("totaleseattle", totaleseattle);
	ob3.put("nessuna statistica", null);
	array.add(ob3);
}
if(totalebrooklyn!=0) {
double s4=(r4/totalebrooklyn)*100;
double ss4=(f4/totalebrooklyn)*100;
ob4.put("totalebrooklyn", totalebrooklyn);
ob4.put("remoteBrooklyn", r4);
ob4.put("fullBrooklyn", f4);
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
ob5.put("totaleplano", totaleplano);
ob5.put("remotePlano", r5);
ob5.put("fullPlano", f5);
ob5.put("percentualeremotePlano", r5);
ob5.put("percentualefullPlano", ss5);
array.add(ob5);}
else {
	ob5.put("totaleplano", totaleplano);
	ob5.put("nessuna statistica", null);
	array.add(ob5);
}
return array;
		
	}
	
	}
	
		
		
		
		
	
	
		
		
		
	
	
	