import java.util.Scanner;

public class VetorImparParC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int i=0;
		
		int a[] = new int[10];
		int b[] = new int[10];
		
		for ( i = 0; i < 10; i++) {
			
			System.out.println("Insira o "+(i + 1)+" numero do vetor A: ");
			a[i] = ler.nextInt();
			
		}
		
		for ( i = 0; i < 10; i++) {
			
			if ( a[i] % 2 == 0 ) {
				
				b[i] = 1;
				
			} else {
				
				b[i] = 0;
				
			}
			
		}
		
		for ( i = 0; i < 10; i++) {
			
			System.out.println("Vetor A: " + a[i]);
			
		}
		
		System.out.println();
		
		for ( i = 0; i < 10; i++) {
			
			System.out.println("Vetor B: " + b[i]);
			
		}
		
		ler.close();
		
		
	}

}

