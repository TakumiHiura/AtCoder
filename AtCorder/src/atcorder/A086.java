package atcorder;

import java.util.Scanner;

public class A086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println((a*b)%2==1 ? "Odd":"Even");
	}

}