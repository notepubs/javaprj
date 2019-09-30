package 예외;

// API
public class Calculator {
	public static int add(int x, int y) throws 너무커서반환할수없은예외{
		int result = x + y;
		
		if(result > 10000)
			throw new 너무커서반환할수없은예외();
		//최승규 짱 컴맹(=성격급합)
		return result;
	}
	
	public static int sub(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public static int div(int x, int y) {
		int result = x / y;
		return result;
	}
}
