package baekjoon;

import java.util.Scanner;

public class BJ11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testcase, n1, n2, sum, i;
		sum = 0;
		
		testcase = sc.nextInt();
		
		for(i=1;i<=testcase;i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			sum = n1 + n2;
			
			System.out.printf("Case #%d: %d + %d = %d\n", i, n1, n2, sum);
		}
	}
}
