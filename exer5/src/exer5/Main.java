package exer5;


public class Main {

	public static void main(String[] args) {
		
		
		String palavra = "Desenvolvedor";
		String aux = "";
		
		for(int i = palavra.length() - 1 ; i>= 0 ;i--) {
			aux += palavra.charAt(i);
			
		}
		System.out.println(aux);

	}

}

