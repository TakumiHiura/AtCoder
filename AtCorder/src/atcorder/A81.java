package atcorder;

import java.util.Scanner;

public class A81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		s = s.replaceAll("0","");
		System.out.println(s.length());
	}

}
