import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompraParcelada {

	
	@Test
	public void testUmaParcela() {
		CompraParcelada compra1 = new CompraParcelada(1000, 5, 1);
		assertEquals(1050, compra1.total(),0);
	}
	
	@Test
	public void testDuasParcelas() {
		CompraParcelada compra2 = new CompraParcelada(1000, 5, 2);
		assertEquals(1103, compra2.total(),0);
	}
	
	@Test
	public void testCincoParcelas() {
		CompraParcelada compra3 = new CompraParcelada(1000, 5, 5);
		assertEquals(1276, compra3.total(),0);
	}
	
	@Test
	public void testDezParcelas() {
		CompraParcelada compra3 = new CompraParcelada(1000, 5, 10);
		assertEquals(1629, compra3.total(),0);
	}



}
