import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {
	private String	nome;
	private String	nome1;
	private String	senha;
	private String senha1;
	private String email;
	private String telefone;
	private String endereco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndere�o(String endereco) {
		this.endereco = endereco;
	}
	
	public void realizarCadastro(String nome,String senha) {
		this.nome = JOptionPane.showInputDialog("Digite seu nome");
        this.senha = JOptionPane.showInputDialog("Digite seu senha");
        this.email = JOptionPane.showInputDialog("Digite seu email");
        this.telefone = JOptionPane.showInputDialog("Digite seu telefone");
        this.endereco = JOptionPane.showInputDialog("Digite seu endere�o");
        
		
	}
	public boolean realizarLogin(String nome,String senha) {
		this.nome1 = JOptionPane.showInputDialog("Nome do login");
	       this.senha1 = JOptionPane.showInputDialog("Senha do  login");
	       if(this.nome.equals(nome1) && this.senha.equals(senha1)) {
	    	   
	    	   JOptionPane.showMessageDialog(null, "vc entrou" );
	    	   return true;
	       }else {
	    	   int a;
	    	   a=0/1;
	    	   return false;
	       }
		
	}
		
	public void realizarPagamento() {
		Object[] formas = {"D�bito","Cr�dito"};
		int forma = JOptionPane.showOptionDialog(null, "Qual forma de pagamento voc� vai usar?", "Pagamento",
		JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION,
		null, formas, formas[0]);
		if(forma==0) {	
		JOptionPane.showMessageDialog(null, nome + " pagou no D�bito");
		}
		if(forma == 1) {
			JOptionPane.showMessageDialog(null, nome + " pagou no Cr�dito");
		}
	} 
	    public void selecionarProduto(int quantidade, double preco,String tipo,String data){
	    	Pedido pedido = new Pedido();
		    pedido.setQuantidade(quantidade);
		    pedido.setPreco(preco);
		    pedido.buscarProduto(tipo);
		    pedido.setData(data);
	}
	 
	
	    
	}
