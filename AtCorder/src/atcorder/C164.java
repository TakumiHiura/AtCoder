package atcorder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<String> S = new HashSet<>();
		for(int i=0; i<N; i++) {
			String s = sc.next();
			S.add(s);
		}
		sc.close();

		System.out.println(S.size());
	}

}
