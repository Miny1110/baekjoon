package baekjoon;

import java.util.Scanner;

public class BJ10871 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int x = sc.nextInt();
		int nArray[] = new int[arrayLength];
		
		for(int i=0;i<nArray.length;i++) {
			nArray[i] = sc.nextInt();
		}
		
		for(int i=0;i<nArray.length;i++) {
			if(x>nArray[i]) {
				System.out.printf("%d ", nArray[i]);
			}
		}
	}
}
