package atcorder;

import java.util.Scanner;

public class A173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		if(N%1000!=0) {
			System.out.println(1000-N%1000);
		}else {
			System.out.println(0);
		}
	}

}
