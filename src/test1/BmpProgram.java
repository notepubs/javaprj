package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {

	public static void main(String[] args) throws IOException {
		
		//========= 로드 ===========
		FileInputStream fin = new FileInputStream("res/image.bmp");
				
		byte[] buf = new byte[10];		
		fin.read(buf);
		fin.close();
		
		//========= 파일 크기 ===========
		int size = 	((int)buf[2]&0xff) << 0   |               // 00000000
						((int)buf[3]&0xff) << 8   |              //               00101111
						((int)buf[4]&0xff) << 16  |             //                              11110010
						((int)buf[5]&0xff) << 24;				  //                                         11100010
		
		//======= 파일 크기 출력 ======
		System.out.printf("size:%d\n", size);
		//buf[2]~buf[5]
		/*
		 * |, &, ^ >>, << ~
		 */
		
		
		
	}

}
