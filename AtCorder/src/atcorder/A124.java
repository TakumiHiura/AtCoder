package atcorder;

import java.util.Scanner;

public class A124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		if(A>B) {
			System.out.println(A+(A-1));
		}else if(A==B) {
			System.out.println(A+B);
		}else {
			System.out.println(B+(B-1));
		}
	}

}
