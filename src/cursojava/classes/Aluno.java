package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

/*Esta é nossa classe/objeto que representa o aluno*/
public class Aluno extends Pessoa {

	/* Esses são os atributos do Aluno */
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() {
		// TODO Cria os dados na memoria - Sendo padrao java
	}

	public Aluno(String nomePadrao) {
		super.nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	/* Veremos os metodos SETTERS e GETTERS do Objeto */
	/* SET e para adicionar ou receber dados para os atributos */
	/* GET e para resgatar ou obter valor do atributo */

	/* Set - RECEBE DADOS */

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

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getNome() {
		return this.nome;
	}

	/* M�todo que retorna a media do aluno */
	public double getMediaNota() {

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {

			somaNotas += disciplina.getMediaNotas();

		}
		return somaNotas / disciplinas.size();

	}

	/* Metodo que retorna TRUE para aprovado e false para reprovado */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) { /* Aprovado */
			return true;
		} else {
			return false; /* Reprovado */
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO ;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", resgritoGeral="
				+ resgritoGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "" + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}
	
	@Override  /*Indentifica metodo subescrito*/
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Obaa o aluno é maior de idade " : "Ixxi vc é menor de idade";
 	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.90;
	}
}
