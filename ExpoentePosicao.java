import java.util.Scanner;

public class ExpoentePosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		final int TAM = 11; int i;int a[];
		
		a = new int [TAM];
		System.out.println("Insira um numero :");
		a[0] = ler.nextInt();
		for(i=1;i<TAM;i++) {
			a[i] = a[i-1] * a[0];
			System.out.println(a[i]);
		}
		ler.close();

	}


}