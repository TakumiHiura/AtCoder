package atcorder;

import java.util.Scanner;

public class A152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		System.out.println(M>=N?"Yes":"No");
	}

}
