import java.util.Scanner;

public class BSomatoriaDeA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int i=0, j=0, soma;

		int a[] = new int[10];
		int b[] = new int[10];
		
		for ( i = 0; i < 10; i++ ) {
			
			System.out.println("Insira o "+(i + 1)+" numero do vetor A: ");
			a[i] = ler.nextInt();
			
		}
		
		for ( i = 0; i < 10; i++ )  {
			
			soma = 0; 
			
			for ( j = i; j < 10; j++) {
				
				 soma = soma + a[j];
			}
			
			b[i] = soma;
		}
		
		for ( i = 0; i < 10; i++ ) {
			
			System.out.println("b[" + i + "] = " + b[i] + " (soma de a[" + i + "] até a[9])");
			
		}
		
		ler.close();
	}
}
