package test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class APIProgram {

	public static void main(String[] args) throws IOException {
		//System.out;
		//�ڷ�����
		//������(���,��,����,��Ʈ)
		//�����(if,else,else if, switch, for, while, do-while)
		//+
		//��/��� ����(API) : �ܼ�,����
		
		//�迭
		
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
