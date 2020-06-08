package atcorder;

import java.util.Scanner;

public class B135 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int diff = 0;
        for(int i = 1; i <= n; i++){
            if(i != sc.nextInt()){
                diff++;
            }
        }
        sc.close();
        System.out.println(diff <= 2 ? "YES" : "NO");
    }
}