import javax.swing.JOptionPane;

public class Pedido {
	 int quantidade;
	private double preco;
	private String data;
	
	public void buscarProduto(String tipo) {
		Produto produto = new Produto();
		produto.setQuantidade(quantidade);
		produto.setTipo(tipo);
		produto.getTipo();
		

	}
	public int getQuantidade() {
		JOptionPane.showMessageDialog(null, "A Quantidade � " + quantidade);
		return quantidade;
	}

	public double getPreco() {
		
		return preco;
	}

	public void setPreco(double preco) {
		JOptionPane.showMessageDialog(null, preco + " R$");
		this.preco = preco;
		
		
	}

	public String getData() {
		
		return data;
	}

	public void setData(String data) {
		JOptionPane.showMessageDialog(null,  "No dia" + data);
		this.data = data;
		
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		
	}
	
	
}
