package atcorder;

import java.util.Scanner;

public class A166 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		if(S.contains("ABC")) {
			System.out.println("ARC");
		}else {
			System.out.println("ABC");
		}

	}

}
