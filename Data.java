package Game;

import java.util.*;
public class Data {
	public List<Swimmers> getSwimmers() {
		List<Swimmers> Swimmers = new ArrayList<Swimmers>();
		 Swimmers.add(new Swimmers("S01","Mark",25,"Vic",0));
		 Swimmers.add(new Swimmers("S02","Peter",20,"Vic",0));

		 return Swimmers;
	     }	
	public List<Cyclists> getCyclists() {
		List<Cyclists> Cyclists = new ArrayList<Cyclists>();
		 Cyclists.add(new Cyclists("C01","Harden",25,"Vic",0));
		 Cyclists.add(new Cyclists("C02","Kevin",20,"Vic",0));
		 Cyclists.add(new Cyclists("C03","Polo",22,"Vic",0));
		 Cyclists.add(new Cyclists("C04","Wayne",19,"Vic",0));
		 Cyclists.add(new Cyclists("C05","Allen",18,"Vic",0));
		 Cyclists.add(new Cyclists("C06","Parker",30,"Vic",0));
		 Cyclists.add(new Cyclists("C07","Tim",30,"Vic",0));
		 Cyclists.add(new Cyclists("C08","Bob",30,"Vic",0));
		 Cyclists.add(new Cyclists("C09","Alex",30,"Vic",0));
		 return Cyclists;
	     }	
	public List<Sprinters> getSprinters() {
		List<Sprinters> Sprinters = new ArrayList<Sprinters>();
		Sprinters.add(new Sprinters("R01","Green",25,"Vic",0));
		 Sprinters.add(new Sprinters("R02","Max",20,"Vic",0));
		 Sprinters.add(new Sprinters("R03","Michael",22,"Vic",0));
		 Sprinters.add(new Sprinters("R04","Harry",19,"Vic",0));
		 Sprinters.add(new Sprinters("R05","Porter",18,"Vic",0));
		 Sprinters.add(new Sprinters("R06","Adam",30,"Vic",0));
		 Sprinters.add(new Sprinters("R07","Tony",30,"Vic",0));
		 Sprinters.add(new Sprinters("R08","Steve",30,"Vic",0));
		 Sprinters.add(new Sprinters("R09","Victor",30,"Vic",0));
		 return Sprinters;
	     }	
	public List<SuperAthletes> getSAthlete() {
		List<SuperAthletes> SuperAthletes = new ArrayList<SuperAthletes>();
		 SuperAthletes.add(new SuperAthletes("SS01","Jefferson",25,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS02","Smith",20,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS03","Noah",22,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS04","Paul",19,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS05","Chris",18,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS06","Bosh",30,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS07","Kobe",30,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS08","Durant",30,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS09","Klay",30,"Vic",0));
		 return SuperAthletes;
	     }	
	public List<Official> getOfficial() {
		List<Official> Official = new ArrayList<Official>();
		Official.add(new Official("Re01","Jefferson",25,"Vic"));
		Official.add(new Official("Re02","Smith",20,"Vic"));
		Official.add(new Official("Re03","Noah",22,"Vic"));
		 return Official;
	     }	

	
}
