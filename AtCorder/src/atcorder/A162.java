package atcorder;

import java.util.Scanner;

public class A162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		if(N.contains("7")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
