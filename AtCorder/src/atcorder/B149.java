package atcorder;

import java.util.Scanner;

public class B149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		sc.close();

		if(A>=K) {
			A-=K;
		}else if((A+B)>=K) {
			B -= (K-A);
			A = 0;
		}else {
			A = 0;
			B = 0;
		}

		System.out.println(A + " " + B);
	}

}
