package atcorder;

import java.util.Scanner;

public class A159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		int s = N*(N-1)/2 + M*(M-1)/2;
		System.out.println(s);
	}

}
