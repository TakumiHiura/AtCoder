package atcorder;

import java.util.Scanner;

public class B127 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int[] x = new int[11];
		x[0] = sc.nextInt();
		for(int i=1; i<=10; i++) {
			x[i] = x[i-1]*r - D;
		}
		sc.close();
		for(int i=1; i<=10; i++) {
			System.out.println(x[i]);
		}

	}

}
