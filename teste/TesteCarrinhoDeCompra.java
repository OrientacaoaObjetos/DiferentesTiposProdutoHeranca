import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompra {

	@Test
	public void produtoAdicionado() {
		Produto prod = new ProdutoComTamanho("Blusa", 1, 30.00, "M");
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionaProduto(prod, 2);
		assertEquals(carrinho.getProdutos().containsKey(prod), Boolean.TRUE);
	}
	
	@Test
	public void produtoRemovido() {
		Produto prod = new ProdutoComTamanho("Blusa", 1, 30.00, "M");
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionaProduto(prod, 2);
		carrinho.removeProduto(prod, 2);
		assertEquals(carrinho.getProdutos().containsKey(prod), Boolean.FALSE);
	}
	
	@Test
	public void removerQtdMaiorProdQueEstaCarrinho() {
		Produto prod = new ProdutoComTamanho("Blusa", 1, 30.00, "M");
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionaProduto(prod, 2);
		assertEquals(carrinho.removeProduto(prod, 3), Boolean.FALSE);
	}
	
	@Test
	public void removerProdNaoEstaCarrinho() {
		Produto prod = new ProdutoComTamanho("Blusa", 1, 30.00, "M");
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		assertEquals(carrinho.removeProduto(prod, 2), Boolean.FALSE);
	}
	
	@Test
	public void qtdMesmoProdutoAdicionado() {
		Produto prod = new Produto("Blusa", 1, 30.00);
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionaProduto(prod, 2);
		carrinho.adicionaProduto(prod, 3);
		carrinho.adicionaProduto(prod, 1);
		carrinho.adicionaProduto(prod, 4);
		
		assertEquals(10L, carrinho.getProdutos().get(prod).longValue());
	}
	
	@Test
	public void totalCompra() {
		Produto p1 = new ProdutoComTamanho("Blusa", 1, 30.00, "G");
		Produto p2 = new ProdutoComTamanho("Blusa", 1, 30.00, "M");
		Produto p3 = new ProdutoComTamanho("Jeans", 2, 50.00, "40");
		Produto p4 = new ProdutoComTamanho("Jeans", 2, 50.00, "42");
		Produto p5 = new ProdutoComTamanho("Short", 3, 20.00, "G");
		Produto p6 = new ProdutoComTamanho("Short", 3, 20.00, "M");
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionaProduto(p1, 2);
		carrinho.adicionaProduto(p2, 2);
		carrinho.adicionaProduto(p3, 2);
		carrinho.adicionaProduto(p4, 2);
		carrinho.adicionaProduto(p5, 2);
		carrinho.adicionaProduto(p6, 2);
		
		assertEquals(400, carrinho.valorTotalCompra(), 0.1);
	}
}
