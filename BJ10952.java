package baekjoon;

import java.util.Scanner;

public class BJ10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, i, sum;
		
		while(true) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			sum = n1 + n2;
			
			if(n1==0 && n2==0) {
				break;
			}
			
			System.out.println(sum);
		}
	}
}
