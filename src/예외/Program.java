package 예외;

import java.io.FileInputStream;

// 응용 프로그램
public class Program {
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
			int sum = Calculator.add(10004, 3);
			System.out.printf("sum : %d\n", sum);
		}
		catch (너무커서반환할수없은예외 e) {
			System.out.println("aaa:"
						+e.getMessage());
		}
		catch(Exception aaa) {
			System.out.println("죄송합니다. \n"
					+ "예기치 않게 오류가 발생하였습니다.");			
		}
		finally {
			//파일을 닫아야 하는 코드
			System.out.println("finally....");
		}
		
		System.out.println("종료되었나?");		
	}
}
