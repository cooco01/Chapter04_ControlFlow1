package ControlFlow;

public class test4 {
	public static void main(String[] args) {
		
		int sum = (int) (Math.random() * 100) / 10;
		
		switch(sum) {
			case 0:
				System.out.println("0�̻� 10�̸��� ��");
				break;
			case 1:
				System.out.println("10�̻� 20�̸��� ��");
				break;
			case 2:
				System.out.println("20�̻� 30�̸��� ��");
				break;
			default:
				System.out.println("�����ų� 30�̻��� ��");
				break;
		}
	}	
}
