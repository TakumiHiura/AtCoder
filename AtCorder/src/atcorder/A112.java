package atcorder;

import java.util.Scanner;

public class A112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N==1) {
			System.out.println("Hello World");
		}else {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		sc.close();
	}

}
