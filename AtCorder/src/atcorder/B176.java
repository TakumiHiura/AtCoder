package atcorder;

import java.util.Scanner;

public class B176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int a = 0;
		for(int i=0; i<N.length(); i++) {
			a += Integer.parseInt(N.substring(i,i+1));
		}
		sc.close();
		if(a%9==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
