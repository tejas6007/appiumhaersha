package programs;

import java.util.Scanner;

public class primeNumber {
	
	public static void main(String[] args) {
		for(; ;) {
		Scanner hd = new Scanner(System.in);
		int a=hd.nextInt();
		int count=0;
		for (int i =1; i<=a; i++) {
			if(a%i==0)
			{
				count++;
				
			}
		}
			if(count==2)
			{
				System.out.println("its is prime number"+a);
			}
			else
			{
				System.out.println("its not prime nuber"+a);
			}
		}
			
			
		}
}
	