package repeitcao_1;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		int pares = 0;
		int impares = 0;
		int positivos= 0;
		int negativos = 0;
		
		String encerrar = "";
		
		while (!encerrar.equalsIgnoreCase("S")) {
			String inputNumero = JOptionPane.showInputDialog ("Digite um número inteiro: ");
			int numero = Integer.parseInt(inputNumero);
			
			if (numero % 2 == 0) {
				pares++;
				}
			
			if(numero % 2 != 0) {
				impares++;
			}
			
			if (numero > 0 ) {
				positivos++;
			}
			
			if (numero < 0 ) {
				negativos++;
			}
			
			encerrar = JOptionPane.showInputDialog("Deseja encerrar o programa? (S/N)");
			}
		
		JOptionPane.showMessageDialog(null,
				"Pares: " + pares + " Impares: " + impares + " Positivos: " + positivos + " Negativos: " + negativos);
		

	}

}