package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excessao.ExcessaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAuntenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {


	public static void main(String[] args) {
		
		

		try {
			LerArquivo();
			    		 
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		
		
		
		Secretario secretario = new Secretario(login, senha);
		Boolean permitirAcesso = secretario.autenticar(login, senha);
		
		Diretor diretor = new Diretor(login, senha);
		Boolean permitirAcessoDiretor = diretor.autenticar(login, senha);
		
		
		if (permitirAcessoDiretor) { 
			List<Aluno> alunos = new ArrayList <>();
			
	
			
			/*e uma lista que dentro dela temos uma chave que identifica uma sequencia de valores tambem*/
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			
			
			
			for (int qtd = 1 ; qtd <=1; qtd++) {
			/* O new aluno() � uma instancia (Criacao de objeto) */
			/* o aluno1 e uma referencia para o objeto aluno */
	
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
			String idade = JOptionPane.showInputDialog("Qual a idade?");
			/*String dataNascimento = JOptionPane.showInputDialog("data de nascimento");
			String rg = JOptionPane.showInputDialog("Registro Geral");
			String cpf = JOptionPane.showInputDialog("Qual e o cpf");
			String mae = JOptionPane.showInputDialog("Nome da mae");
			String pai = JOptionPane.showInputDialog("Nome do Pai");
			String matricula = JOptionPane.showInputDialog("Data da matricula");
			String serie = JOptionPane.showInputDialog("Serie matriculado");
			String escola = JOptionPane.showInputDialog("nome da escola");*/
	
			
	
			Aluno aluno1 = new Aluno();
	
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			/*aluno1.setDataNascimento(dataNascimento);
			aluno1.setResgritoGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(mae);
			aluno1.setNomePai(pai);
			aluno1.setDataMatricula(matricula);
			aluno1.setSerieMatriculado(serie);
			aluno1.setNomeEscola(escola);*/
	
			
			
			for (int pos = 1; pos <= 1; pos++) {
				
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina"+pos+" ?");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				/*disciplina.setNota(Double.valueOf(notaDisciplina));*/
				
				aluno1.getDisciplinas().add(disciplina);
				
				
			}
			
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			
	
			if (escolha == 0) { /*Opcao SIM e Zero = 0 */
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover ==0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++; /*+ soma +1*/
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar Remover?");
			}
			
			}
			
			
			alunos.add(aluno1);
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			
			
			for (Aluno aluno : alunos) { /*Separei em listas*/
				
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				}else
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);	
				}else { 
			    if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO))
			    	maps.get(StatusAluno.REPROVADO).add(aluno);
				}
				}
			
			System.out.println("--------------------=Lista dos aprovados-----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota() + " Nome dele é " + aluno.getNome() );
			}
			
			System.out.println("---------------------Lista dos Reprovados----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota()+ " Nome dele é " + aluno.getNome() );
			}
			
			System.out.println("---------------------Lista dos Recuperacao----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota() + " Nome dele é " + aluno.getNome());
			}
		 
		}   else {
		
			JOptionPane.showMessageDialog(null, "Acesso não permitido!!");
			
		}
		 /*Aqui*/
		 
		 }catch (Exception e) {
			 
			 StringBuilder saida = new StringBuilder();
			 
			 e.printStackTrace(); /*Imprime erro no console Java*/

			 
			 
			 /*Mensagem do erro ou causa*/
			 
			 System.out.println("mensagem" + e.getMessage());
			 
			 for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				 
				 saida.append("\n Classe de erro : " +e.getStackTrace()[pos].getClassName());
				 saida.append("\n Metodo de erro : " +e.getStackTrace()[pos].getMethodName());
				 saida.append("\n Linha de erro : " +e.getStackTrace()[pos].getLineNumber());
				 saida.append("\n Linha de erro : " +e.getClass().getName());
			 }
		 
			 
        
		JOptionPane.showMessageDialog(null, "Erro conversão de numero" + saida.toString());
			// TODO: handle exception
	
		
			
		}finally {/*Semore executado ocorrendo erros ou não. */
			
			JOptionPane.showMessageDialog(null, "Obgd por aprender java cmg");
	 
	    }
	
	
}
	
	
	
	public static void LerArquivo() throws FileNotFoundException {
		
		File fil = new File("C:\\line..");
	     Scanner scanner = new Scanner(fil);
	
		
		}
	}






		
	

	




