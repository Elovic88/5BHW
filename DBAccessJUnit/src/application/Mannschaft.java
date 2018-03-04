package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Mannschaft {
	int id;
	String name;
	String stadt;
	String trainer;
	String stadionname;
	int stadionkapazität;

	ArrayList<Spieler> spielers = new ArrayList<Spieler>();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStadt() {
		return stadt;
	}
	
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	
	public String getTrainer() {
		return trainer;
	}
	
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	public String getStadionname() {
		return stadionname;
	}
	
	public void setStadionname(String stadionname) {
		this.stadionname = stadionname;
	}
	
	public int getStadionkapazität() {
		return stadionkapazität;
	}
	
	public void setStadionkapazität(int stadionkapazität) {
		this.stadionkapazität = stadionkapazität;
	}
	
	int anzahl = 0;
	
	public int getAnzahlSpieler() {
		
		for(Spieler spieler : spielers) {
			anzahl++;
		}
		System.out.println(anzahl);	
		return anzahl;
		
//		for(int i = 0; i < spielers.size(); i++) {
//			anzahl ++;
//		}

	}
	
	public void createMannschaft() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
	}
}
