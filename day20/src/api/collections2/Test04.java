package api.collections2;

import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		//���տ���
		//=���� �ٸ� �� ���հ��� ���� ex : ������, ������, ������
		
		Set<Integer> a = new TreeSet<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Set<Integer> b = new TreeSet<>();
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		
		//������ : ���ο� set�� ���� a�� b�� �߰�.
		Set<Integer> c = new TreeSet<>();
		c.addAll(a); //c�� a�� ��� �߰�
		c.addAll(b); //c�� b�� ��� �߰�
		//System.out.println(c);
		
		//������ : ���ο� set�� ���� 
		Set<Integer> d = new TreeSet<>();
		d.addAll(a);
		d.retainAll(b); //d�� b�� ������ ����
		//System.out.println(d);
		
		//������ : ���ο� set��...
		Set<Integer> e = new TreeSet<>(a); // �̷��� �ص� �ȴ�. e.addAll(a)�� �����ȴ�.
		e.removeAll(b);
		System.out.println(e);
		
		
	}
	
}
