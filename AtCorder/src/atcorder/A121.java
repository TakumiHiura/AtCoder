package atcorder;

import java.util.Scanner;

public class A121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.close();
		System.out.println((H-h)*(W-w));
	}

}
