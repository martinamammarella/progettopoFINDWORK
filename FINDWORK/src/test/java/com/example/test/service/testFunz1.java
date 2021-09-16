package com.example.test.service;
import org.json.simple.*;
import com.example.FINDWORK.model.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * classe che testa i get della classe lavori
 * @author marty
 *
 */
class testFunz1 {
	Lavori x1;
	Lavori x2;
	JSONArray a = new JSONArray();
	/**
	 * metodo che inizializza i componenti per il test
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		x1= new Lavori(1,"operaio","B&E",true,a,"Berlin","2021-08-14","fulltime","link");
		x2= new Lavori(2,"direttore","ArtLife",false,a,"Berlin","2021-08-25","parttime","stack");
	}
/**
 * metodo che distrugge ciò che è stato creato dal setup
 * @throws Exception
 */
	@AfterEach
	void tearDown() throws Exception {
		}
/**
 * metodo che testa i metodi get sul primo oggetto lavori
 */
	@Test
	void test() {
		assertEquals(1,x1.getId());
		assertEquals("operaio",x1.getRuolo());
		assertEquals("B&E",x1.getAzienda());
		assertEquals(true,x1.getRemoto());
		assertEquals(a,x1.getLinguaggi());
		assertEquals("Berlin",x1.getCity());
		assertEquals("2021-08-14",x1.getData());
		assertEquals("fulltime",x1.getOrarioLavoro());
		assertEquals("link",x1.getSitoWeb());
		
	}
	/**
	 * metodi che testa i metodi get sul secondo lavoro
	 */
	@Test
	void test2() {
		assertEquals(2,x2.getId());
		assertEquals("direttore",x2.getRuolo());
		assertEquals("ArtLife",x2.getAzienda());
		assertEquals(false,x2.getRemoto());
		assertEquals(a,x2.getLinguaggi());
		assertEquals("Berlin",x2.getCity());
		assertEquals("2021-08-25",x2.getData());
		assertEquals("parttime",x2.getOrarioLavoro());
		assertEquals("stack",x2.getSitoWeb());
		
	}
}
