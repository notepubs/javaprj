package test1.�Լ�;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


// 1. �迭 -> 2��(���� �迭) : ��� ü�º����ϰ� �ٽ�
// 2. �Լ� -> �������
// 3. ĸ��ȭ -> 

public class ExamProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("res/data.txt");
		Scanner fscan = new Scanner(fin);
		
		int[] nums = new int[100];
		
		// ������ �ε�(load)
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
		/* == �����ʹ� �ε� �Ǿ���. ======================== */
		
		/* == ������ ���� ======================== */
		int count = 0;
		
		for(int i=0; nums[i] != -1 ; i++)
			count++;
		
		/* == ������ �� ======================== */		
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
