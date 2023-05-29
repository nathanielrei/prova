import javax.swing.JOptionPane;

public class Produto {
	 String tipo;
	 int quantidade;
	 
	public String getTipo() {
		return tipo;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
		JOptionPane.showMessageDialog(null, quantidade +" "+ tipo);
	}
	public int getQuantidade() {
		JOptionPane.showMessageDialog(null, "A Quantidade � " + quantidade);
		return quantidade;
	}
	
	
	
	public void BuscarProduto() {
 tipo =	JOptionPane.showInputDialog("Escreva o tipo de produto que voc� quer");
	
	}

}
