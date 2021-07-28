package ControlFlow;

public class test3 {
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(true) {
			if(num%2==1) {
				sum += num;
				if(sum>1000) {
					System.out.println("Number: " + num + " Total: " + sum);
					break;
					
				}
			}
			num +=2;
		}
	}
}
