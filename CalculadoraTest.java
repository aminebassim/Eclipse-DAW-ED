package debug1;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class CalculadoraTest {

	private Calculadora calcu;
	private int resultado;
	
	@Before 
	public void creaCalculadora() {
		
		calcu = new Calculadora(20,10);
		
	}
	
	@After
	public void borraCalculadora() {
		calcu = null;
	}
	
	@Test
	public void testSuma() {
		
		resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		
		resultado = calcu.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplica() {
		//fail indica que aun no se ha implementado el metodo
		resultado = calcu.multiplica();
		assertEquals("Fallo en la multiplicación", 200, resultado);
	
	}

	@Test //indica al compilador que es un metodo de prueba
	public void testDivide() {
		
		resultado = calcu.divide();
		assertEquals(2, resultado);
	}
	
	@Test
	public void testResta2() {
		
		assertTrue("No es mayor o igual a 0", calcu.resta2());
	}

	@Test
	public void testDivide2() {
		
		assertNotNull("El numero 2 no es 0", calcu.divide2());
		
	}
}
