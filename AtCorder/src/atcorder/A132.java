package atcorder;

import java.util.Scanner;

public class A132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		if(S.charAt(1) == S.charAt(2) && S.charAt(1) != S.charAt(3) && S.charAt(3) == S.charAt(0) ) {
			System.out.println("Yes");
		}else if(S.charAt(1) == S.charAt(3) && S.charAt(1) != S.charAt(2) &&  S.charAt(2) == S.charAt(0) ) {
			System.out.println("Yes");
		}else if(S.charAt(1) == S.charAt(0) && S.charAt(1) != S.charAt(2) &&  S.charAt(2) == S.charAt(3) ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
