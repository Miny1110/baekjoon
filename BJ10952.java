package baekjoon;

import java.util.Scanner;

class BJ10952_A {

	private int n1, n2;
	private boolean result;

	public void getNum() {
		Scanner sc = new Scanner(System.in);

		do {
			n1 = sc.nextInt();
			n2 = sc.nextInt();

		} while (n1<0 || n1>=10 || n2<0 | n2>=10 || (n1==0 && n2!=0) || (n1!=0 && n2==0));
			
			
	}


	public boolean result() {
		if(n1==0 && n2==0) 
			result = true;

		return result;
	}


	public int numAdd() {
		int sum = n1 + n2;

		return sum;
	}


	public void print(int sum) {
		System.out.println(sum);
	}

}


public class BJ10952 {

	public static void main(String[] args) {

		BJ10952_A bj = new BJ10952_A();

		while(true) {

			bj.getNum();
			int sum = bj.numAdd();

			if(bj.result()) {
				break;
			}

			bj.print(sum);
		}

	}

}
