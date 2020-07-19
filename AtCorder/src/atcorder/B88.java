package atcorder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] a = new Integer[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a, Comparator.reverseOrder());
		int A = 0;
		int B = 0;
		for(int i=0; i<N; i++) {
			if(i%2==0) {
				A += a[i];
			}else {
				B += a[i];
			}
		}
		System.out.println(A-B);
	}

}
