package atcorder;

import java.util.Scanner;

public class B136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int a = 0;
		for(int i=1; i<=N; i++) {
			int valLen = String.valueOf(i).length();
			if(valLen%2==1) {
				a++;
			}
		}
		System.out.println(a);
	}

}
