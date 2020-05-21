package atcorder;

import java.util.Scanner;

public class A143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int C = A-B-B;
		if(C>0) {
			System.out.println(C);
		}else {
			System.out.println(0);
		}

	}

}
