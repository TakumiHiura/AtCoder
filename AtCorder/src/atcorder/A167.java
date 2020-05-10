package atcorder;

import java.util.Scanner;

public class A167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();
		T = T.substring(0,T.length()-1);
		if(S.equals(T)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
