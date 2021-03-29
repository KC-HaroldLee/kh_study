package api.collections2;

import java.util.HashSet;
import java.util.Set;

public class Test05 {
	public static void main(String[] args) {
		
		//�������� ������ �޴��� ������
		//������ - "��", "�׸�", "���ο�", "����", "����", "ȭ��Ʈ"
		//������ - "��", "ȭ��Ʈ", "���� �׷���", "���� ��ũ"
		
		Set<String> i = new HashSet<>();
		i.add("��");
		i.add("�׸�");
		i.add("���ο�");
		i.add("����");
		i.add("����");
		i.add("ȭ��Ʈ");		
		
		Set<String> g = new HashSet<>();
		g.add("��");
		g.add("ȭ��Ʈ");
		g.add("���ұ׷���");
		g.add("������ũ");
		
		//1.�������� ������ �޴����� ���������� ������ �ִ� ����.
		Set<String> a = new HashSet<>(i);
		a.retainAll(g);
		System.out.println("<���� ����>");
		for(String color : a) {
		System.out.println(color);
		}
		
		//2.�������� ������ �ִ� ����
		Set<String> b = new HashSet<>(i);
		b.removeAll(g);		
		System.out.println("<������ ���� ����>");
		for(String color : b) {
		System.out.println(color);
		}
		
		//3.�����ø� ������ �ִ� ����
		Set<String> c = new HashSet<>(g);
		c.removeAll(i);
		System.out.println("<�����ø� ���� ����>");
		for(String color : c) {
			System.out.println(color);
		}
		
		//4.��� ����
		Set<String> d = new HashSet<>(g);
		d.addAll(i);
		System.out.println("<��� ����>");
		for(String color : d) {
			System.out.println(color);
		}
	}
	
}

