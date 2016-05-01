import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProduto {

	@Test
	public void produtoEhDiferente() {
		Produto p1 = new Produto("Blusa", 1, 30.00);
		Produto p2 = new Produto("Jeans", 2, 40.00);
		
		Boolean igual = p1.equals(p2);
		
		assertEquals(igual, Boolean.FALSE);
	}
	
	@Test
	public void produtoEhIgual() {
		Produto p1 = new Produto("Blusa", 1, 30.00);
		Produto p2 = new Produto("Blusa", 1, 30.00);
		
		Boolean igual = p1.equals(p2);
		
		assertEquals(igual, Boolean.TRUE);
	}

}
