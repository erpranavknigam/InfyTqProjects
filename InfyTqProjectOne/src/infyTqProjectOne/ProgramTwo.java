package infyTqProjectOne;

import java.util.Scanner;

public class ProgramTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int rev = 0;
		int temp = num;
		while(temp != 0) {
			rev = (temp % 10) + (rev * 10) ;
			temp = temp/10;
		}
		System.out.println(rev + " " + num);
		if(num == rev) {
			System.out.println(num + " is a palindrome");
		} else {
			System.out.println(num + " is not a palindrome");
		}
	}

}
