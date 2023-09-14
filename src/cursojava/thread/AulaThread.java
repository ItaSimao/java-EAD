package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		/*Thread processando em paralelo do envio de email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		
		
		Thread ThreadNFCE = new Thread (thread2);
		ThreadNFCE.start();
		
		/*Código do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("Chegou ao fim do codigo teste de thread");
		
		/*Fluxo do sistema, cadastro de venda, uma emissão de NF, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
	}
	
	
	private static Runnable thread2 = new Runnable() {
		

			
			public void run() { 
			/*código da rotina*/
			
			/*Código da rotina que eu quero executar em paralelo*/
			for (int pos = 0 ; pos < 10; pos++) {
				
			
				
				/*Quero executar esse envio com tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando rotina,envio de nota fiscal");
				
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/*Da um tempo*/
			}
			}
			
			
			/*Fim do código em paralelo*/
	
			};
	
	
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
            /*código da rotina*/
			
			/*Código da rotina que eu quero executar em paralelo*/
			for (int pos = 0 ; pos < 10; pos++) {
				
			
				
				/*Quero executar esse envio com tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando algo rotina, por ex envio de email");
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/*Da um tempo*/
			}
			
			
			/*Fim do código em paralelo*/
			
		}
	};
	
	}
			
