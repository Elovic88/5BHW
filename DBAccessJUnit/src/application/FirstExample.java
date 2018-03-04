package application;
//STEP 1. Import required packages
import java.sql.*;
import java.util.Scanner;

public class FirstExample {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.postgresql.Driver";  
	static final String DB_URL = "jdbc:postgresql://localhost/Mannschaftsverwaltung";

	//  Database credentials
	static final String USER = "postgres";
	static final String PASS = "Reithmann1";
	static Spieler s1 = new Spieler();
	static Mannschaft m1 = new Mannschaft();

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try{
			//STEP 2: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			System.out.println("Um einen Spieler zu erstellen, schreiben Sie die Zahl '1'");
			System.out.println("Um einen Mannschaft zu erstellen, schreiben Sie die Zahl '2'");
			System.out.println("Um alle Spieler der DB auszugeben, schreiben Sie die Zahl '3'");
			System.out.println("Um alle Mannschaften der DB auszugeben, schreiben Sie die Zahl '4'");
			System.out.println("Um Spieler zu updaten Schreiben Sie die Zahl '5'");
			System.out.println("Um Mannschaft zu updaten Schreiben Sie die Zahl '6'");
			System.out.println("Um Spieler zu löschen Schreiben Sie die Zahl '7'");
			System.out.println("Um Mannschaften zu löschen Schreiben Sie die Zahl '8'");
			Scanner sc = new Scanner(System.in);
			String entsch = sc.next();


			//STEP 4: Execute a query
			System.out.println("Creating statement...");
			System.out.println();
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, name, city, coach, stadium, stadiumcapacity FROM Mannschaft ";
			//			      sql = "CREATE TABLE IF NOT EXISTS Employee ("
			//			    		+ "id SERIAL primary key,"
			//			      		+ "first character varying not null," 
			//			      		+ "last character varying not null,"
			//			      		+ "age int)";

//						      sql = "CREATE TABLE IF NOT EXISTS Mannschaft ("
//						    		+ "id SERIAL primary key,"
//						      		+ "name character varying not null," 
//						      		+ "city character varying not null,"
//						      		+ "coach character varying not null,"
//						      		+ "stadium character varying not null,"
//						      		+ "stadiumcapacity character varying not null)"; 
			ResultSet rs = stmt.executeQuery(sql);

			/**
			 * Wird nicht mehr gebraucht, da die Werte mittels Scanner eingelesen werden.
			 */
			//			stmt = conn.createStatement();
			//			String sql2;
			//			sql = "INSERT INTO Employee values("
			//					+ "420,"
			//					+ "'Micheal'," 
			//					+ "'Witting',"
			//					+ "18)";
			//			ResultSet rs2 = stmt.executeQuery(sql);


			stmt = conn.createStatement();
			String sql2;

			
			switch(entsch){
			case "1": CreateS();
			sql = "INSERT INTO spieler values("
					+ s1.getId()+","
					+ "'"+s1.getVorname()+"'," 
					+ "'"+s1.getNachname()+"',"
					+ s1.getAlter()+")";
			ResultSet rs2 = stmt.executeQuery(sql);

			System.out.println("Es wurde der Benutzer " + s1.getVorname() + " " + s1.getNachname() + "erstellt");break;

			case "3": //READ
				sql= "SELECT id, first, last, age from Spieler";
				ResultSet rs3 = stmt.executeQuery(sql);
				//STEP 5: Extract data from result set
				while(rs.next()){
					//Retrieve by column name
					int id  = rs.getInt("id");
					String first = rs.getString("first");
					String last = rs.getString("last");
					int age = rs.getInt("age");

					//Display values
					System.out.print("ID:	" + id+"\t |");
					System.out.print("	Alter:	" + age +"\t |");
					System.out.print("	Vorname:	" + first +"\t \t \t |");
					System.out.println("	Nachname:		" + last+"\t ");
				}break;
				
			case "4": //READ
				sql= "SELECT id, name, city, coach, stadium, stadiumcapacity from mannschaft";
				ResultSet rs9 = stmt.executeQuery(sql);
				//STEP 5: Extract data from result set
				while(rs.next()){
					//Retrieve by column name
					int id  = rs.getInt("id");
					String name = rs.getString("name");
					String city = rs.getString("city");
					String trainer = rs.getString("coach");
					String stadionname = rs.getString("stadium");
					int stadionkapazität = rs.getInt("stadiumcapacity");

					//Display values
					System.out.print("ID: " + id+"\t |");
					System.out.print(" name: " + name +"\t |");
					System.out.print(" stadt: " + city +"\t |");
					System.out.print(" trainer: " + trainer +"\t |");
					System.out.print(" Stadion: " +stadionname+"\t |");
					System.out.println(" Stadionkap.: " +stadionkapazität+"\t ");
				}break;


				/**	
				 * Leider gibt es mir hier bei der UPDATE Syntax einen Fehler aus
				 * 
				 * Ich hoffe, Sie können mir hier während der Stunde helfen den Fehler zu finden.
				 */
			case "5": Update();
//						sql = "UPDATE Employee SET first = ("
//									+ s1.getId()+","" last = ("+s1.getNachname()+",")
//								+ "'"+s1.getVorname()+"'," 
//								+ "'"+s1.getNachname()+"',"
//								+ s1.getAlter()+")";
//
//
//
//						sql = "UPDATE Employee SET first = ("+em1.getVorname()+", SET last = ("+em1.getVorname()+",) Set last ="
//										+ " ("+em1.getNachname()+",) SET age = ("+em1.getAlter()+",)
//							WHERE id = ("
//								+ s1.getId()+")";
//						
//									+ "'"+ em1.getVorname()+"',"
//									+ "'"+ em1.getNachname()+"',"
//									+ em1.getAlter()+") WHERE id = ("
//									+ em1.getId()+")";
//							ResultSet rs4 = stmt.executeQuery(sql);
//								
//								System.out.println("Der Benutzer wurde upgedatet und heißt nun: " + em1.getVorname() + " " + em1.getNachname());
			break;




			case "7": DeleteS();
			sql = "DELETE FROM spieler WHERE id = ("
					+ s1.getId()+")";
			ResultSet rs5 = stmt.executeQuery(sql);
			System.out.println("test");
			break;

			case "2": CreateM();
			sql = "INSERT INTO mannschaft values("
					+ m1.getId()+","
					+ "'"+m1.getName()+"'," 
					+ "'"+m1.getStadt()+"',"
					+ "'"+m1.getTrainer()+"',"
					+ "'"+m1.getStadionname()+"',"
					+ m1.getStadionkapazität()+")";
			ResultSet rs6 = stmt.executeQuery(sql);

			System.out.println("Es wurde die Mannschaft " + m1.getName() + "erstellt");break;
			
			
			case "8": DeleteM();
			sql = "DELETE FROM mannschaft WHERE id = ("
					+ m1.getId()+")";
			ResultSet rs7 = stmt.executeQuery(sql);
			System.out.println("test");
			break;
			}

			//STEP 6: Clean-up environment
			
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}// nothing we can do
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
		//System.out.println("Goodbye!");
	}//end main

	public static void CreateS() {
		Scanner sc = new Scanner(System.in);

		System.out.println("ID:");
		int id = sc.nextInt();

		System.out.println("Vorname:");
		String vorname = sc.next();

		System.out.println("Nachname:");
		String nachname = sc.next();

		System.out.println("Alter:");
		int alter = sc.nextInt();

		s1.setId(id);
		s1.setVorname(vorname);
		s1.setNachname(nachname);
		s1.setAlter(alter);
	}

	public static void CreateM() {
		Scanner sc = new Scanner(System.in);

		System.out.println("ID:");
		int id = sc.nextInt();

		System.out.println("Name:");
		String name = sc.next();

		System.out.println("Stadt:");
		String stadt = sc.next();

		System.out.println("Trainer:");
		String trainer = sc.next();

		System.out.println("Stadionname:");
		String stadionname = sc.next();
		
		System.out.println("stadionkapazität:");
		int stadionkapazität = sc.nextInt();

		m1.setId(id);
		m1.setName(name);
		m1.setStadt(stadt);
		m1.setTrainer(trainer);
		m1.setStadionname(stadionname);
		m1.setStadionkapazität(stadionkapazität);
	}

	public static void Update() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welchen Benutzer wollen Sie updaten? (Bitte ID eingeben!):");
		int id = sc.nextInt();


		System.out.println("Neuer Vorname:");
		String vorname = sc.next();

		System.out.println("Neuer Nachname:");
		String nachname = sc.next();

		System.out.println("Neues Alter:");
		int alter = sc.nextInt();

		s1.setId(id);
		s1.setVorname(vorname);
		s1.setNachname(nachname);
		s1.setAlter(alter);
	}

	public static void DeleteS() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welchen Benutzer wollen Sie löschen? (Bitte ID eingeben!):");
		int id = sc.nextInt();

		s1.setId(id);
	}
	
	public static void DeleteM() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welchen Benutzer wollen Sie löschen? (Bitte ID eingeben!):");
		int id = sc.nextInt();

		m1.setId(id);
	}
}//end FirstExample


