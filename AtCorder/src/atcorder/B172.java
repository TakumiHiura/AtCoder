package atcorder;

import java.util.Scanner;

public class B172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int a = 0;
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == T.charAt(i)) {
				continue;
			}
			a++;
		}
		sc.close();
		System.out.println(a);
	}

}
