package atcorder;

import java.util.Scanner;

public class A120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		System.out.println(B/A>=C?C:B/A);
	}

}
