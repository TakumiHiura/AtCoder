package atcorder;

import java.util.Scanner;

public class A105 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		System.out.println(N%K);
	}

}
