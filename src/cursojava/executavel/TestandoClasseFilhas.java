package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClasseFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno =  new Aluno(); 
		aluno.setNome("Ita");
		aluno.setNomeEscola("Bela Vista");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setResgritoGeral("65465465");
		diretor.setNome("Simao");
		diretor.setIdade(40);
		
		Secretario secretario = new Secretario(null, null);
		secretario.setExperiencia("Adm");
		secretario.setNumeroCpf("654654");
		secretario.setIdade(20);
		secretario.setNome("Joao");
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
	
		
		System.out.println("Salário é = " + aluno.salario());
		System.out.println("Salário é = " + diretor.salario());
		System.out.println("Salário é = " + secretario.salario());
		
	
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
			}
	
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salário é de = " + pessoa.salario());
		

	}
}
