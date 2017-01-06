import java.util.ArrayList;

/**
 * 
 * @author karran
 *
 *         abbbb 1234 abab
 * 
 *         Did not load on the web arena =(
 */

public class AB {

	public static String createString(int N, int K) {
		String retorno = "";

		int m; // Quantidade de As

		// Define o máximo de As
		if (N % 2 == 0)
			m = (int) N / 2;
		else
			m = (int) (N - 1) / 2;

		// Se o máximo de pares possíveis for menor que K retorna ""
		int maximoPares = m * (N - m);
		if (maximoPares < K)
			return "";
		int pares = maximoPares;
		int s = N;
		while (pares > K) {
			m -= 1;
			s -= 1;
			pares = m * (s - m);
		}
		int total=0;
		while (m>0){
			String add = "A";
			int q=0;
			while (total<K){
				total+=m;
				q++;
			}
			if (total>K){
				q--;
				total-=m;
			}
			while(q>0){
				add+="B";
				q--;
			}			
			retorno=add+retorno;
			m--;
		}
		
//		int pares = 0;
//		int as = 0;
//		for (int i = 0; i < m; i++) {
//			if (pares >= K) {
//				break;
//			}
//			if (K % i == 0) {
//
//			}
//		}
		while (retorno.length() < N)
			retorno = "B" + retorno;
		return retorno;
	}
	
	public static void main(String[] args) {
		System.out.println("Resultado "+createString(6, 7));
		
	}


}
