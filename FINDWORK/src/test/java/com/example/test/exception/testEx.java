package com.example.test.exception;
import com.example.FINDWORK.exception.*;
import com.example.FINDWORK.service.*;
import com.example.FINDWORK.model.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import org.json.simple.*;
/**
 * classe per testare metodi che possono generare eccezioni
 * @author marty
 *
 */
class testEx {
   serviceAppImplements s= new serviceAppImplements();
   ArrayList<Lavori> res= new ArrayList<>();
   JSONArray a= new JSONArray();
   Lavori x1;
   Lavori x2;
   /*
    * metodo che inizializza i componenti necessari per il test
    */
	@BeforeEach
	void setUp() throws Exception {
		x1= new Lavori(1,"operaio","B&E",true,a,"Berlin","2021-08-14","fulltime","link");
		x2= new Lavori(2,"direttore","ArtLife",false,a,"Berlin","2021-08-25","parttime","stack");
		res.add(x1);
		res.add(x2);
	}
/**
 * distrugge ciò che è stato inizializzato dal setup
 * @throws Exception
 */
	@AfterEach
	void tearDown() throws Exception {
	}
/**
 * test che verifica se l'eccezione parException viene generata correttamente e se il messaggio d'errore è quello atteso
 */
	@Test
	void test() {
		parException e= assertThrows(parException.class,() -> {
			s.analisiStatsParametro(res, "nullo");
		});
		assertEquals("PARAMETRO ERRATO:inserire un parametro corretto per la richiesta",e.getMessage());
	}
	/**
	 * test che verifica se l'eccezione bodyException viene generata correttamente e se il messaggio d'errore è quello atteso
	 */
	@Test
	void test1() {
		bodyException e=assertThrows(bodyException.class,()->{
			s.analisiFiltro(res, a, a, "lavoridaremoto");
		});
		assertEquals("BODY ERRATO:inserire un body corretto per la richiesta",e.getMessage());
	}
}
