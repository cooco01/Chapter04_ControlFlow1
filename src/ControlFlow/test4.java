package ControlFlow;

public class test4 {
	public static void main(String[] args) {
		
		int sum = (int) (Math.random() * 100) / 10;
		
		switch(sum) {
			case 0:
				System.out.println("0이상 10미만의 수");
				break;
			case 1:
				System.out.println("10이상 20미만의 수");
				break;
			case 2:
				System.out.println("20이상 30미만의 수");
				break;
			default:
				System.out.println("음수거나 30이상의 수");
				break;
		}
	}	
}
