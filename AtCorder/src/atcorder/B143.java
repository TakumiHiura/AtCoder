package atcorder;

import java.util.Scanner;

public class B143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		int a = 0;
		for(int i=0; i<N; i++) {
			d[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				a+= d[i]*d[j];
			}
		}
		System.out.println(a);
	}

}
