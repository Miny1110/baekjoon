package baekjoon;

import java.util.Scanner;

public class BJ10950 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1, n2;
		
		
		for(int i=0;i<num;i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			System.out.println(n1 + n2);
		}
	}

}
