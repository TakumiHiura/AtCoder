package atcorder;

import java.util.Scanner;

public class A153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		if(H%A==0) {
			System.out.println(H/A);
		}else {
			System.out.println(H/A+1);
		}
	}

}
