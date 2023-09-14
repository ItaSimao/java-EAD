package cursojava.interfaces;

/*Essa interface será o nosso contrato de autentificacaoo*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);

	public boolean autenticar();
}
