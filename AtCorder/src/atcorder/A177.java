package atcorder;

import java.util.Scanner;

public class A177 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();
		sc.close();
		double a = (double)D/S;
		System.out.println(a<=T?"Yes":"No");
	}

}
