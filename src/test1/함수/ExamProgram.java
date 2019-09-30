package test1.함수;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


// 1. 배열 -> 2차(다차 배열) : 잠깐 체력보유하고 다시
// 2. 함수 -> 여기부터
// 3. 캡슐화 -> 

public class ExamProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("res/data.txt");
		Scanner fscan = new Scanner(fin);
		
		int[] nums = new int[100];
		
		// 데이터 로드(load)
		/*
		int i=0;
		while(fscan.hasNext()) {
			nums[i] = fscan.nextInt();
			i++;
		}*/
		
		for(int i=0; fscan.hasNext(); i++) {
			nums[i] = fscan.nextInt();
			nums[i+1] = -1;
		}		
		fin.close();
		/* == 데이터는 로드 되었다. ======================== */
		
		/* == 데이터 개수 ======================== */
		int count = 0;
		
		for(int i=0; nums[i] != -1 ; i++)
			count++;
		
		/* == 데이터 합 ======================== */		
		int sum = sum(nums);
		
		
		printSumAndAvg(sum,count);
				
	}
	
	private static int sum(int[] nums) {
		int sum = 0;
		
		for(int i=0; nums[i] != -1 ; i++)
			sum += nums[i];
		
		return sum;
	}





	public static void printSumAndAvg(int sum, int count) {
		double avg = 0;		
		avg = sum / count;
				
		System.out.printf("sum:%d\n", sum);
		System.out.printf("avg:%f\n", avg);
	}


}
