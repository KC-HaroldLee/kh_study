package api.collections2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		//Set : ������ ���������� ������ �ִ� �����.
		//Treeset, Hashset
		//=���� ��ü ��ȸ�� �ϱ� ���ؼ� 
		//�ϰ�ó����Ȱ���Ѵ�. ���� get�� ���� index�� �ȵȴ�.
		
		//Set<Integer> set = new TreeSet<>();
		Set<Integer> set = new HashSet<>();
		
		//�߰�
		set.add(25);
		set.add(12);
		set.add(1);
		set.add(15);
		set.add(55);
		set.add(52);
		set.add(11);
		
		//�˻�
		System.out.println(set.contains(12));
		
		
		
		
		//���
		System.out.println(set);
		
		System.out.println(set.size());
		
		
	}
}
