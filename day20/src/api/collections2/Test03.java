package api.collections2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
	//Q. set�� ����� ��� �ϴ°�?
	//Iterator�� ����ϴ� ���
	//Ȯ�� for�� ����ϴ� ���
	Set<String> set = new HashSet<>();
	
	set.add("�ڹ�");
	set.add("���̽�");
	set.add("C++");
	set.add("�ȵ���̵�");
	set.add("iOs");
	
	//Iterator
	Iterator<String> iter = set.iterator();
	while(iter.hasNext()){
		String item = iter.next();
	System.out.println(item);
	
	}
	
	//Ȯ�� for��
	for(String item : set) {
		System.out.println();
	}
	
	
	//System.out.println(set);
	
	//set�� �ϳ��� ���� �� ����.
	
	
		
}
}
