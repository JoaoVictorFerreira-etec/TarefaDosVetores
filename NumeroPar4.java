import java.util.Scanner;

public class NumeroPar4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner ler = new Scanner(System.in)) {
			final int TAM = 10; int a[];int i;int b;
			
			a =new int [TAM];
			for(i=0;i<TAM;i++) {
				System.out.println("Insira o "+(i+1)+" elemento");
				a[i] = ler.nextInt();
				
			}
			for(i=0;i<TAM;i++) {
				System.out.println(" ");
				System.out.println(" ");
				System.out.print(a[i]+":");
				for(b=0;b<a[i];b= b+2) {
					
					System.out.print(" "+b);
				}
			}
			ler.close();
		}
		
		
		
	}


}
