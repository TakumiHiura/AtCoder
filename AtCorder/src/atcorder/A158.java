package atcorder;

import java.util.Scanner;

public class A158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S.charAt(0) == S.charAt(1) && S.charAt(0) == S.charAt(2) ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
