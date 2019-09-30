package test1.�Լ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {

	public static void main(String[] args) throws IOException {
		
		//========= �ε� ===========
		FileInputStream fin = new FileInputStream("res/image.bmp");
				
		byte[] buf = new byte[10];		
		fin.read(buf);
		fin.close();
		
		//========= ���� ũ�� ===========
		int size = 	((int)buf[2]&0xff) << 0   |               // 00000000
						((int)buf[3]&0xff) << 8   |              //               00101111
						((int)buf[4]&0xff) << 16  |             //                              11110010
						((int)buf[5]&0xff) << 24;				  //                                         11100010
		
		//======= ���� ũ�� ��� ======
		System.out.printf("size:%d\n", size);
		//buf[2]~buf[5]
		/*
		 * |, &, ^ >>, << ~
		 */
		
		
		
	}

}
