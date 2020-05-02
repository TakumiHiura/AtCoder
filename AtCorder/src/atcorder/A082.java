package atcorder;

import java.util.Scanner;

public class A082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		double c = (a+b)/2;
		System.out.println((int)Math.ceil(c));
	}

}
