import java.util.Scanner;

public class TabuadaVetor2 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			final int TAM =5; int b= 0 , i = 0, r= 0;
			int a[];
			a = new int [TAM];
			
			
			for(i=0;i<TAM;i++) {
				System.out.println("Insira o "+(i+1)+"° valor");
				a[i] = ler.nextInt();
			}
			for(i=0;i<TAM;i++) {
				System.out.println(" ");
				
				for(b= 1;b<11;b++) {
					r = a[i] *b;
					System.out.println(a[i]+" * "+b+" = "+r);
				}
			}
			ler.close();
		}
		
		
		
	}

}