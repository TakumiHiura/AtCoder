package atcorder;

import java.util.Scanner;

public class A176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		int a = N/X;
		sc.close();
		if(N%X==0) {
			System.out.println(T*a);
		}else {
			System.out.println(T*(a+1));
		}

	}

}
