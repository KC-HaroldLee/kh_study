package api.collections3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {

		// ������� ��� key, value�� ���.
		// map�� ��ü������ ��ü ����ϴ� ����� ����.
		Map<String, Integer> map = new HashMap<>();
		map.put("����ȯ", 100);
		map.put("�̼���", 90);
		map.put("�輺��", 70);
		map.put("�ּ���", 60);
		map.put("���ع�", 65);
		
		//1.key�� set���� �����Ͽ� ����ϴ� ���.
		//2.EntrySet�� �̿��ϴ� ���.
		
		//1.Map���� -> Set<String> -> Iterator<String> �Ǵ� Ȯ�� for
		Set<String> set = map.keySet();
		for(String name : set) {
			System.out.println("�̸� = " + name);
			System.out.println("���� = " + map.get(name));
		}
		
		//2.EntrySet�� �̿��ϴ� ���.
		Set<	Entry<String, Integer>	> entrys = map.entrySet(); //�̷��� Entry���� �����ȴ� �̵��� ��ġ�� ����ϰ� �ִ�.
		for (Entry<String, Integer> entry : entrys) {
			System.out.println("�̸� = " + entry.getKey());
			System.out.println("���� = " + entry.getValue());
		}
		
	}
}
