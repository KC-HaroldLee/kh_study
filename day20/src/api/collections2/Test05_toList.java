package api.collections2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test05_toList {
	public static void main(String[] args) {
		
		//�������� ������ �޴��� ������
		//������ - "��", "�׸�", "���ο�", "����", "����", "ȭ��Ʈ"
		//������ - "��", "ȭ��Ʈ", "���� �׷���", "���� ��ũ"
		
		List<String> i = new ArrayList<>();
		i.add("��");
		i.add("�׸�");
		i.add("���ο�");
		i.add("����");
		i.add("����");
		i.add("ȭ��Ʈ");		
		
		List<String> g = new ArrayList<>();
		g.add("��");
		g.add("ȭ��Ʈ");
		g.add("���ұ׷���");
		g.add("������ũ");
		
		//1.�������� ������ �޴����� ���������� ������ �ִ� ����.
		Set<String> a = new HashSet<>();
		a.addAll(i);
		a.retainAll(g);
		System.out.println("������� : " + a);
		
		
		//2.�������� ������ �ִ� ����
		Set<String> b = new HashSet<>(i);
		//b.addAll(i);
		b.removeAll(g);
		System.out.println("�������� ������ �ִ� ���� : " + b);
		
		//3.�����ø� ������ �ִ� ����
		Set<String> c = new HashSet<>();
		c.addAll(g);
		c.removeAll(i);
		System.out.println("�����ø� ������ �ִ� ���� : " + c);
		
		//4.��� ����
		Set<String> d = new HashSet<>();
		d.addAll(g);
		d.addAll(i);
		System.out.println("��� ���� : " + d);
	}
	
}
