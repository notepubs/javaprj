package ����;

import java.io.FileInputStream;

// ���� ���α׷�
public class Program {
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
			int sum = Calculator.add(10004, 3);
			System.out.printf("sum : %d\n", sum);
		}
		catch (�ʹ�Ŀ����ȯ�Ҽ��������� e) {
			System.out.println("aaa:"
						+e.getMessage());
		}
		catch(Exception aaa) {
			System.out.println("�˼��մϴ�. \n"
					+ "����ġ �ʰ� ������ �߻��Ͽ����ϴ�.");			
		}
		finally {
			// ���ϾƤä��̳��ä������ä�;�̳��ä�;���Ϥþ�;���Ϥö�
			//������ �ݾƾ� �ϴ� �ڵ�
			System.out.println("finally....");
		}
		
		System.out.println("����Ǿ���?");		
	}
}
