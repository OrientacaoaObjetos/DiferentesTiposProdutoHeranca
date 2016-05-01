import java.util.HashMap;

public class CarrinhoDeCompra {
	
	private HashMap<Produto, Integer> produtos;
	
	public CarrinhoDeCompra() {
		produtos = new HashMap<>();
	}
	
	public void adicionaProduto(Produto produto, Integer quantidade) {
		Integer totalProduto = produtos.containsKey(produto) ? produtos.get(produto) + quantidade : quantidade;
		produtos.put(produto, totalProduto);
	}
	
	public boolean removeProduto(Produto produto, Integer qtdARemover) {
		Integer totalProduto = produtos.containsKey(produto) ? produtos.get(produto) : 0;
		
		if(totalProduto == 0) {
			System.out.println("O produto nao esta adicionado no carrinho");
			return false;
		} else if (totalProduto < qtdARemover) {
			System.out.println("A quantidade de produto a remover e maior que o total do carrinho.");
			return false;
		}
		
		produtos.remove(produto, qtdARemover);
		return true;
	}
	
	public double valorTotalCompra() {
		double valorTotal = 0;
		
		for (Produto prod : produtos.keySet()) {
			valorTotal += prod.getPreco() * produtos.get(prod);
		}
		
		return valorTotal;
	}

	public HashMap<Produto, Integer> getProdutos() {
		return produtos;
	}

	public void setProdutos(HashMap<Produto, Integer> produtos) {
		this.produtos = produtos;
	}

}
