package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem receber que tem o contrato da interface de PermitirAcesso e chamar o autenticado*/

public class FuncaoAuntenticacao {

	

	public  FuncaoAuntenticacao(PermitirAcesso permitirAcesso) {
	}

		
		private PermitirAcesso permitirAcesso;
		
		public boolean autenticar() {
			return permitirAcesso.autenticar();
		}
	
		public void FuncaoAutenticacao (PermitirAcesso acesso) {
			this.permitirAcesso = acesso;
		}
		

	}

	
