package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	/*Usado para executar código*/
	public static void main(String[] args) {
		/*Array pode ser de todos tipos de dados e objoetos*/
		
		
		double[] notas = {8.8, 7.7, 5.4, 9.2};
		double[] notasLogica = {8.8, 7.7, 5.4, 9.2};
		
		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Itamar Simão");
		aluno.setNomeEscola("EEB SV");
		
		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de programacao");
		disciplina2.setNota(notasLogica);
	
		aluno.getDisciplinas().add(disciplina2);
		
		//-------------------------------------
		
		Aluno [] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos ++) {
			
			System.out.println("Nome do aluno é : " + arrayAlunos[pos].getNome());
			
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println("Nome da disciplina é : " + d.getDisciplina());
			
			for (int posnota = 0; posnota < d.getNota().length; posnota++) {
				System.out.println("A nota numero : " + posnota + " é igual = " + d.getNota()[posnota]);
			}
			}
		}
		
	}
}


		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String posicoes = JOptionPane.showInputDialog ("Quantas pos o array deve ter?");
		
		
		/*Array sempre deve ter a quantidade de psoições definidas
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
		String valor = JOptionPane.showInputDialog("Qual valor da posição = " + pos);
		notas[pos] = Double.valueOf(valor);
		
		}
		
		for (int pos = 0 ; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		} */
	
