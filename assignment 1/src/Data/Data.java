package Data;
/**
 * @date 03.04.2017
 * @author Chih Yuan Chen S3585502
 * @version 1.0
 * @Description  store all athletes data and history games data
 */
import java.util.*;
public class Data {
	
	//create ArrayList to add default data into Swimmers
	public List<Swimmers> getSwimmers() {
		List<Swimmers> Swimmers = new ArrayList<Swimmers>();
		 Swimmers.add(new Swimmers("S01","Mark",25,"Vic",0));
		 Swimmers.add(new Swimmers("S02","Joe",28,"Tas",0));
		 Swimmers.add(new Swimmers("S03","Jimmy",26,"NSW",0));
		 Swimmers.add(new Swimmers("S04","Chara",30,"WA",0));
		 Swimmers.add(new Swimmers("S05","Kathy",35,"SA",0));
		 Swimmers.add(new Swimmers("S06","Sam",22,"Vic",0));
		 Swimmers.add(new Swimmers("S07","Dean",26,"Qld",0));
		 Swimmers.add(new Swimmers("S08","Richard",27,"Tas",0));
		 Swimmers.add(new Swimmers("S09","Iverson",28,"Vic",0));
		 return Swimmers;
	     }	
	//create ArrayList to save default data into Cyclists
	public List<Cyclists> getCyclists() {
		List<Cyclists> Cyclists = new ArrayList<Cyclists>();
		 Cyclists.add(new Cyclists("C01","Harden",25,"Vic",0));
		 Cyclists.add(new Cyclists("C02","Kevin",20,"Tas",0));
		 Cyclists.add(new Cyclists("C03","Polo",22,"Qld",0));
		 Cyclists.add(new Cyclists("C04","Wayne",19,"SA",0));
		 Cyclists.add(new Cyclists("C05","Allen",18,"WA",0));
		 Cyclists.add(new Cyclists("C06","Parker",30,"NSW",0));
		 Cyclists.add(new Cyclists("C07","Tim",30,"Vic",0));
		 Cyclists.add(new Cyclists("C08","Bob",30,"Tas",0));
		 Cyclists.add(new Cyclists("C09","Alex",30,"Vic",0));
		 return Cyclists;
	     }	
	
	//create ArrayList to save default data into Sprinters
	public List<Sprinters> getSprinters() {
		List<Sprinters> Sprinters = new ArrayList<Sprinters>();
		Sprinters.add(new Sprinters("R01","Green",25,"Tas",0));
		 Sprinters.add(new Sprinters("R02","Max",20,"Qld",0));
		 Sprinters.add(new Sprinters("R03","Michael",22,"NSW",0));
		 Sprinters.add(new Sprinters("R04","Harry",19,"WA",0));
		 Sprinters.add(new Sprinters("R05","Porter",18,"SA",0));
		 Sprinters.add(new Sprinters("R06","Adam",30,"Tas",0));
		 Sprinters.add(new Sprinters("R07","Tony",30,"Vic",0));
		 Sprinters.add(new Sprinters("R08","Steve",30,"NSW",0));
		 Sprinters.add(new Sprinters("R09","Victor",30,"Vic",0));
		 return Sprinters;
	     }	
	//create ArrayList to save default data into SuperAthletes
	public List<SuperAthletes> getSAthlete() {
		List<SuperAthletes> SuperAthletes = new ArrayList<SuperAthletes>();
		 SuperAthletes.add(new SuperAthletes("SS01","Jefferson",25,"Qld",0));
		 SuperAthletes.add(new SuperAthletes("SS02","Smith",20,"Qld",0));
		 SuperAthletes.add(new SuperAthletes("SS03","Noah",22,"NSW",0));
		 SuperAthletes.add(new SuperAthletes("SS04","Paul",19,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS05","Chris",18,"SA",0));
		 SuperAthletes.add(new SuperAthletes("SS06","Bosh",30,"WA",0));
		 SuperAthletes.add(new SuperAthletes("SS07","Kobe",30,"Vic",0));
		 SuperAthletes.add(new SuperAthletes("SS08","Durant",30,"Tas",0));
		 SuperAthletes.add(new SuperAthletes("SS09","Klay",30,"Vic",0));
		 return SuperAthletes;
	
	}	
	//create ArrayList to save default data into Official
	public List<Official> getOfficial() {
		List<Official> Official = new ArrayList<Official>();
		Official.add(new Official("Re01","Jeffery",25,"Qld"));
		Official.add(new Official("Re02","Marco",20,"Vic"));
		Official.add(new Official("Re03","Don",22,"NSW"));
		 return Official;
	     }
	//create ArrayList to store game history data
	public List<History> getHistory() {
		List<History> History = new ArrayList<History>();
		
		return History;
	    }
	}

