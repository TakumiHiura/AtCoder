package atcorder;

import java.util.Scanner;

public class B151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int a = 0;
		for(int i=0; i<N-1; i++) {
			A[i] = sc.nextInt();
			a+=A[i];
		}
		sc.close();
		A[N-1] = M*N-a;
		if(A[N-1]<=0) {
			System.out.println(0);
		}else if(A[N-1]<=K) {
			System.out.println(A[N-1]);
		}else {
			System.out.println(-1);
		}

	}

}
