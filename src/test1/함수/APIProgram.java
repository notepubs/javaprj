package test1.함수;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class APIProgram {

	public static void main(String[] args) throws IOException {
		//System.out;
		//자료형식
		//연산자(산술,비교,관계,비트)
		//제어구조(if,else,else if, switch, for, while, do-while)
		//+
		//입/출력 도구(API) : 콘솔,파일
		
		//배열
		
		//System.in;
		
		FileInputStream fin = new FileInputStream("res/data.txt");
		FileOutputStream fos = new FileOutputStream("res/api-out.txt");		
		PrintStream fout = new PrintStream(fos);
		
		int b1 = System.in.read();	
		System.out.println(b1);
		
		int b2 = fin.read();		
		fout.println(b2);
		
		int kor = 90;
		int eng = 80;
		
		fout.printf("kor:%d, eng:%d\r\n", kor, eng);		
		//fout.print("\r\n");
		fout.print("end");
		
		fin.close();
		fout.close();
		fos.close();

	}

}
