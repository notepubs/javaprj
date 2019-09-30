package test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		int[] nums = new int[10];
		
		//FileInputStream fin = new FileInputStream("D:\\acorn\\workspace\\JavaPrj\\src\\res\\data.txt");
		FileInputStream fin = new FileInputStream("src/res/data.txt");
		Scanner fscan = new Scanner(fin);
		int num = 0;
		
		while(fscan.hasNext()) {
			num = fscan.nextInt();
			System.out.println(num);
		}		
				
		fscan.close();
		fin.close();

	}

}
