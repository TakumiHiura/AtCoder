package atcorder;

import java.util.Scanner;

public class A128 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();
		sc.close();
		System.out.println((A*3+P)/2);
	}

}
