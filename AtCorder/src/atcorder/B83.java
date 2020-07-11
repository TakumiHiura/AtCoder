package atcorder;

import java.util.Scanner;

public class B83 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int s = 0;
		sc.close();
		for(int i=1; i<=N; i++) {
			int n = i;
			int sum = 0;
			while(n>0) {
				sum += n%10;
				n /= 10;
			}
			if(sum>=A && sum<=B) {
				s+=i;
			}
		}
		System.out.println(s);
	}

}
