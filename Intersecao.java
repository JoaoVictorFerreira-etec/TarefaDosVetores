import java.util.Scanner;

public class Intersecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
        int i, j, k, existe, posicaoC = 0;

        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];

        for (i = 0; i < 10; i++) {
        	
            System.out.println("Insira o " + (i + 1) + " numero do vetor A: ");
            a[i] = ler.nextInt();
            
        }

        for (i = 0; i < 10; i++) {
        	
            System.out.println("Insira o " + (i + 1) + " numero do vetor B: ");
            b[i] = ler.nextInt();
            
        }

        for (i = 0; i < 10; i++) {
        	
            for (j = 0; j < 10; j++) {

                if (a[i] == b[j]) {

                    existe = 0;

                    for (k = 0; k < posicaoC; k++) {
                    	
                        if (c[k] == a[i]) {
                            existe = 1;
                            
                        }
                    }

                    if (existe == 0) {
                    	
                        c[posicaoC] = a[i];
                        posicaoC++;
                        
                    }
                }
            }
        }

        System.out.println("Interseção entre A e B: ");
        
        for (i = 0; i < posicaoC; i++) {
        	
        	System.out.print(c[i] + " ");
        	
        }

        ler.close();
    }
}
