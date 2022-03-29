package JavaProgrames;

import java.util.Scanner;

public class swapnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println(" Enter first number :");
		int a = sc.nextInt();

		System.out.println(" Enter second number :");
		int b = sc.nextInt();
        a = a+b; //5
        b= a-b; //5-3=2
        a=a-b; //5-2=3
        
        System.out.println(a +" "+ b);
        
	    
		
		
	}
}
