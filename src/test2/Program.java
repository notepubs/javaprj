package test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
		//System.out
		
		FileOutputStream fout = new FileOutputStream("res/test-bi.txt");
		
		fout.write(12);
		//fout.write('2');
		fout.flush();
		
		fout.close();
		System.out.println("작업 종료");
		
		/*
		// 1. 파일 입력 스트림 fin 객체를 생성할 것.
		FileInputStream fin = new FileInputStream("res/image.bmp");
		// 2. 파일에서 첫 번째 1바이트를 읽어서 출력 할 것.
		int value = fin.read();
		System.out.println(value);
		
		// 3. 파일 입력 스트림을 닫을 것.
		fin.close();
		*/

	}

}
