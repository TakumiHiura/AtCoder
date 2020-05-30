package atcorder;

import java.util.Scanner;

public class C146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long X = sc.nextLong();
		sc.close();
		long head = 0;
		long tail = (long)Math.pow(10, 9)+1;
		while(tail - head>1) {
			long mid = head + (tail - head)/2;
			if((A*mid + B*(Long.toString(mid).length())) > X) {
				tail = mid;
			}else {
				head = mid;
			}
		}
		System.out.println(head);
	}


}
