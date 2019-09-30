package game.����;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxingProgram {

	public static void main(String[] args) {
		
		// �迭 ... �� ��ü��...
		// �����͸� �ĺ��ϴ� ����� ���̸� �ΰ� �ִ� �迭��
		// 1. �����Ͱ� �� �ĺ��ڴ� => Set �迭
		Set set = new HashSet();     
		set.add("hello");
		set.add(37);
		set.add("ȣȣȣ");
		set.add(37);
		set.add("ȣȣȣ");
		
		for(Object obj : set)
			System.out.println(obj);
		
		// 2. �������� ������ �� �ĺ��ڴ� => List �迭
		List list = new ArrayList();
		list.add("hello");
		list.add(37);
		list.add("ȣȣȣ");
		list.add(37);
		list.add("ȣȣȣ");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		for(Object obj : list)
			System.out.println(obj);
		
		// 3. �������� �ĺ��ڰ� ���� �ִ�. => Map �迭
		Map map = new HashMap();
		map.put("kor", 20);
		map.put("eng", 90);
		map.put("math", 39);
		
		System.out.println(map.get("kor"));
		
		for(Object k : map.keySet())
			System.out.printf("key : %s, value : %s\n", k, map.get(k));
		
		
		// Generic
		
	}

}
