package curso.java.excessao;

public class ExcessaoProcessarNota extends Exception{
	
       public ExcessaoProcessarNota(String erro) {
    	   super ("Vix um erro no processamento do arquivo ao processar as notas do aluno" + erro);
    	   
	}
	
}
