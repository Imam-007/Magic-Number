package imam.practice;

import java.util.Scanner;

public class MagicNumber {
	public static void checkMagicNumber(int number) {
		while(number>9) {
			int sum=0;
			while(number>0) {
				int rem=number%10;
				sum+=rem;
				number/=10;
			}
			number=sum;
			sum=0;
		}
		if(number==1) {
			System.out.println("This is Magic Number");
		}else {
			System.out.println("Not a Magic Number");
		}
	}
	public static void optimizeMagicNumber(int number) {
		if((number-1)%9==0) {
			System.out.println("Magic Number");
		}else {
			System.out.println("Not a Magic Number");
		}
		
	}
	public static int takeInput() {
		System.out.println("Enter Any number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		return number;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=takeInput();
		//checkMagicNumber(number);
		optimizeMagicNumber(number);

	}

}
