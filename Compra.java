
public class Compra {
	public static void main(String[] args) {
		Cliente rafael = new Cliente();
	rafael.setNome("Rafael");
	rafael.realizarPagamento();
	rafael.selecionarProduto(2,100.00,"t�nis","14/10/22");
	
	
	Cliente nan = new Cliente();
	nan.realizarCadastro(null, null);
	nan.realizarLogin(null, null);
	nan.selecionarProduto(1,45.00,"t�nis","14/10/22");
	nan.realizarPagamento();
	}
}
