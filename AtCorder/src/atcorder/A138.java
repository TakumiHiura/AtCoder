package atcorder;

import java.util.Scanner;

public class A138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		sc.close();
		System.out.println(a>=3200 ? s : "red");
	}

}
