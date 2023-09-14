package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	
	public static void main(String[] args) {
		
		String texto = "ITA, curso java, 80, 70, 90, 89";
		
		String[] valoresArray = texto.split(",");
		
		System.out.println("nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("nota: " + valoresArray[2]);
		System.out.println("nota: " + valoresArray[3]);
		System.out.println("nota: " + valoresArray[4]);
		System.out.println("nota: " + valoresArray[5]);
		
		/*convertendo um array em uma lista*/
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		/*converter uma lista pra array*/
		String[] conversaoArray = list.toArray(new String[6]);
		
		System.out.println(conversaoArray);
		
		for (int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
	}
}
