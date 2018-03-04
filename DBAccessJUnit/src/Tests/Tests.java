package Tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import application.Mannschaft;
import application.Spieler;

public class Tests {
	Mannschaft m1 = new Mannschaft();
	Spieler s1= new Spieler();
	
	@Test 
	void TestM() {
		assertEquals(m1.setId(1),1);
		assertEquals(m1.setName("test"),"test");
		assertEquals(m1.setStadionkapazität(50),50);
		assertEquals(m1.setStadionname("test"),"test");
		assertEquals(m1.setStadt("test"),"test");
		assertEquals(m1.setTrainer("test"),"test");
	}
	
	@Test 
	void TestS() {
		assertEquals(s1.setId(1),1);
		assertEquals(s1.setAlter(1),1);
		assertEquals(s1.setNachname("dominik"),"dominik");
		assertEquals(s1.setVorname("dominik"),"dominik");
	}
	
}
