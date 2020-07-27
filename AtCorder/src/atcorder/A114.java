package atcorder;

import java.util.Scanner;

public class A114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		System.out.println(X == 3 || X == 5 || X == 7 ? "YES" : "NO");
	}

}
