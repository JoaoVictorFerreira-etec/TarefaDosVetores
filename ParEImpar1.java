import java.util.Scanner;

public class ParEImpar1 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int i = 0;
			final int TAM = 20;
			int a[]; int b[];
			a = new int [TAM];
			b = new int [TAM];
			for( i=0;i<TAM;i++) {
				System.out.println("Insira o "+(i+1)+"° numero :");
				a[i] = ler.nextInt();
				if(a[i]% 2 != 0) {
					b[i] = a[i];
					a[i] = 0;
					
				}
				
			}
			System.out.print("A = [ ");
			for(i=0;i<TAM;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println("]");
			System.out.print("B = [ ");
			for(i=0;i<TAM;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println("]");
			ler.close();
		}

	}

}