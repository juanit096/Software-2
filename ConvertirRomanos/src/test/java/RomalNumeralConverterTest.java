import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomalNumeralConverterTest {
	RomanNumeralConverter con= null;
	@Before
	public void setUp() throws Exception {
		con=new RomanNumeralConverter();
	}
	@After
	public void tearDown() throws Exception {
	}
	public void elaborarPrueba(String entrada, int esperado){
		int salida=con.convert(entrada);
		assertEquals(esperado, salida);
	}
	@Test
	public void testDeberiaDevolver1SiPasoI() {
		elaborarPrueba("I",1);
	}
	@Test
	public void testDeberiaDevolver2SiPasoII() {
		elaborarPrueba("II",2);
	}
	@Test
	public void testDeberiaDevolver3SiPasoIII() {
		elaborarPrueba("III",3);
	}	
	@Test
	public void testDeberiaDevolver4SiPasoIV() {
		elaborarPrueba("IV",4);
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoIIII(){
		try {
			con.convert("IIII");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaDevolver5SiPasoV() {
		elaborarPrueba("V",5);
	}
	@Test
	public void testDeberiaDevolver6SiPasoVI() {
		elaborarPrueba("VI",6);
	}
	@Test
	public void testDeberiaDevolver7SiPasoVII() {
		elaborarPrueba("VII",7);
	}
	@Test
	public void testDeberiaDevolver8SiPasoVIII() {
		elaborarPrueba("VIII",8);
	}
	@Test
	public void testDeberiaDevolver9SiPasoIX() {
		elaborarPrueba("IX",9);
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoVIIII(){
		try {
			con.convert("VIIII");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaDevolver10SiPasoX() {
		elaborarPrueba("X",10);
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoVV(){
		try {
			con.convert("VV");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaDevolver11SiPasoXI() {
		elaborarPrueba("XI",11);
	}
	@Test
	public void testDeberiaDevolver12SiPasoXII() {
		elaborarPrueba("XII",12);
	}
	@Test
	public void testDeberiaDevolver13SiPasoXIII(){
		elaborarPrueba("XIII", 13);	
	}	
	@Test
	public void testDeberiaDevolver14SiPasoXIV() {
		elaborarPrueba("XIV",14);
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoXIIII(){
		try {
			con.convert("XIIII");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaDevolver15SiPasoXV() {
		elaborarPrueba("XV",15);
	}
	@Test
	public void testDeberiaDevolver16SiPasoXVI() {
		elaborarPrueba("XVI",16);
	}
	@Test
	public void testDeberiaDevolver17SiPasoXVII() {
		elaborarPrueba("XVII",17);
	}
	@Test
	public void testDeberiaDevolver18SiPasoXVIII() {
		elaborarPrueba("XVIII",18);
	}
	@Test
	public void testDeberiaDevolver19SiPasoXIX() {
		elaborarPrueba("XIX",19);
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoXVIIII(){
		try {
			con.convert("XVIIII");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaDevolver20SiPasoXX() {
		elaborarPrueba("XX",20);
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoXXXX(){
		try {
			con.convert("XXXX");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaDevolver50SiPasoL() {
		elaborarPrueba("L",50);
	}
	@Test
	public void testDeberiaDevolver1000SiPasoM() {
		elaborarPrueba("M",1000);
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoMI(){
		try {
			con.convert("MI");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoMDCLXVI(){
		try {
			con.convert("MDCLXVI");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}	
	@Test
	public void testDeberiaBotarExcepcionSiPasoMMMCCXI(){
		try {
			con.convert("MMMCCXI");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}	
	@Test
	public void testDeberiaBotarExcepcionSiPasoMMDCCCX(){
		try {
			con.convert("MMDCCCX");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoMMXVIII(){
		try {
			con.convert("MMXVIII");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoMCMXCVI(){
		try {
			con.convert("MCMXCVI");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoLL(){
		try {
			con.convert("LL");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoDD(){
		try {
			con.convert("DD");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoMMMM(){
		try {
			con.convert("MMMM");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
	@Test
	public void testDeberiaBotarExcepcionSiPasoCCCC(){
		try {
			con.convert("CCCC");
			fail();
		} catch (IllegalArgumentException e) {
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}		
	}
}
