package atcorder;

import java.util.Scanner;

public class A118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		System.out.println(B%A==0 ? A+B : B-A);
	}

}
