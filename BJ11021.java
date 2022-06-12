package baekjoon;

import java.util.Scanner;

public class BJ11021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testnum, n1, n2, i, sum;
		sum = 0;
		
		testnum = sc.nextInt();
		
		for(i=1;i<=testnum;i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			sum = n1 + n2;
			System.out.printf("Case #%d: %d\n", i, sum);
			
		}
	}
}
