import java.util.Scanner;

public class Divisor10Elementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		final int TAM = 10; int a[];int i;int b;
		
		a =new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"° elemento");
			a[i] = ler.nextInt();
			
		}
		for(i=0;i<TAM;i++) {
		
			System.out.println(" ");
			System.out.print(a[i]+":");
			for(b=1;b<=a[i]; b++) {
				if(a[i] % b == 0) {
					
					System.out.print(" "+b);
				}
				
			}
		}
		ler.close();

	}

}


