package 가변배열;

import java.util.Scanner;

import test3.Exam;

public class Program {

	public static void main(String[] args) {
		
		//ObjectList list = new ObjectList();
		GList<Exam> list = new GList();
		// 모든 것을 담는 것은? 단점일 수 있다.
		list.add("hello");
		list.add(30);
		list.add(new Exam());
		
		// 서비스 함수를 사용하려면? 형식을 변환해야 한다.
		list.get(2).input();
		//((Exam)list.get(2)).input();
		//((Exam)list.get(2)).print();
		
		
		//ObjectList list = new ObjectList();
		//Object[] data = new Object[3];
		//int index = 0;
		
		//int exit = 0;
		
		//Scanner scan = new Scanner(System.in);
		
		//do {
			//input(data/*참조전달*/, index/*값전달*/);
		//	input(list);	
			//print(data, index);
		//	print(list);
		//	System.out.print("go?(1 or 0):");
		//	exit = scan.nextInt();
		//}while(exit != 1);
	}

	private static void input(ObjectList list/* Object[] data, int index */) {
		Scanner scan = new Scanner(System.in);
		System.out.print("kor:");
		
		list.add(scan.nextInt());
		//data[index] = scan.nextInt();
		//index++;// 다음 값을 저장할 위치 == 입력된 값의 개수
	}

	private static void print(ObjectList list) {
		for(int i=0; i<list.size(); i++)
			System.out.printf("kor:%d, ", list.get(i) /* data[i] */);
	}


}
