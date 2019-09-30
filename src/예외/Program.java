package 예외;

import java.io.FileInputStream;

// 응용 프로그램
public class Program {
	
	public static void main(String[] args) {
		// 승규야 컴맹은 면했네? 여기에 코드를 고쳐야 해...
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
			// 오케이 바리야~
			// ㅁ니아ㅓㄹ미나ㅓㅇ림나ㅓㅇ;미나ㅓㄹ;ㅁ니ㅓ아;ㅁ니ㅓ라
			//asdjfaslkjdaslkdjlasjfl;askjf;laskjdlkjflkdasjf;laskjdf
			//파일을 닫아야 하는 코드
			System.out.println("finally....");
		}
		
		System.out.println("종료되었나?");		
	}
}
