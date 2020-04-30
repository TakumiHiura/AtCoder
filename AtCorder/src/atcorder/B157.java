package atcorder;

import java.util.Scanner;

public class B157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		int[] b = new int[N];
		for(int i=0; i<N; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		String f="No";
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<N; k++) {
					if(b[k]==A[i][j]) {
						A[i][j] = 0;
					}
				}
			}
		}

		for(int i=0; i<3; i++) {
			if(A[i][0] ==0 && A[i][1]==0 && A[i][2]==0) {
				f="Yes";
			}
		}
		for(int i=0; i<3; i++) {
			if(A[0][i]==0 && A[1][i]==0 && A[2][i]==0) {
				f="Yes";
			}
		}

		if(A[0][0]==0 && A[1][1]==0 && A[2][2]==0) {
			f="Yes";
		}
		if(A[0][2]==0 && A[1][1]==0 && A[0][2]==0) {
			f="Yes";
		}

		System.out.println(f);
	}

}
