package test1.함수;

import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) {		
		// 데이터 
		int[] lotto = new int[6];		
		// 기능(알고리즘)
		printMenu();
		switch(inputMenu()) {
		case 1:
			inputLottoManual(lotto);
			break;
		case 2:
			genLottoAuto(lotto);
			break;
		case 3:
			exitProgram();
		default:
			errorMessage();
		}
		
	}

	private static void errorMessage() {
		// TODO Auto-generated method stub
		
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		
	}

	private static void genLottoAuto(int[] lotto) {
		// TODO Auto-generated method stub
		
	}

	private static void inputLottoManual(int[] lotto) {
		// TODO Auto-generated method stub
		
	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		return menu;
	}

	private static void printMenu() {
		System.out.println("┌───────────┐");
		System.out.println("│       로또 메인 메뉴      │");
		System.out.println("└───────────┘");
		System.out.println();
		System.out.println("\t1. 수동");
		System.out.println("\t2. 자동");
		System.out.println("\t3. 종료");
		
	}

}
