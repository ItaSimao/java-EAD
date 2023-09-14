package cursojava.classes;

/* Herança - Classe pai ou classe master ou superclasse - Atributos comuns a to0dos os objetos filhos*/

public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String resgritoGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;
	
	/*Metodo abstrato é q fica na classe pai é obrigatório para as classes filhas*/
	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getResgritoGeral() {
		return resgritoGeral;
	}
	public void setResgritoGeral(String resgritoGeral) {
		this.resgritoGeral = resgritoGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
 
	
	
	/*Retorna true caso seja 18 anos pra cima senao false*/
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
		
		
		
		
	}
	
	

}
