import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void produtoEhDiferente() {
		Produto p1 = new ProdutoComTamanho("Blusa", 1, 30.00, "G");
		Produto p2 = new ProdutoComTamanho("Blusa", 1, 30.00, "M");
		
		Boolean igual = p1.equals(p2);
		
		assertEquals(igual, Boolean.FALSE);
	}
	
	@Test
	public void produtoEhIgual() {
		Produto p1 = new ProdutoComTamanho("Blusa", 1, 30.00, "M");
		Produto p2 = new ProdutoComTamanho("Blusa", 1, 35.00, "M");
		
		Boolean igual = p1.equals(p2);
		
		assertEquals(igual, Boolean.TRUE);
	}

}
