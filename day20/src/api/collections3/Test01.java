package api.collections3;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//Map <K, V>
		//Set(K)�� ��(v) ���� ����
		//��Ʈ ������ ���
		
		//ex : �л���� ������ �����ϱ� ���� Map ����
		//K = key. �ĺ���, �����ؾ��ϴ� �׸�(�ߺ� �Ұ�)
		//V = value. ������. �ߺ��� ���Ǵ� �׸�.
		
		Map<String, Integer> map = new HashMap<>();
		
		//�߰� : .add()�� �ƴ϶� .put() - set�����͸� �߰��ϴ� ���� put
		map.put("����ȯ",100);
		map.put("�̼���",90);
		map.put("�輺��",70);
		map.put("�ּ���",60);
		map.put("���ع�",65);
		
		//�˻� , �׸��� 2���̴�...
		//-containsKey();
		//-containsKValue();
		System.out.println(map.containsKey("�輺��")); //key�� �輺�ϰ� �ֽ��ϱ�?
		System.out.println(map.containsValue(65)); //
		
		//���� : key�� �̿��ؼ� value�� �����ϴ� �͸� �����ϸ� �ݴ�� �Ұ���.
		//�׷��� key�ΰ�?

		System.out.println(map.get("�輺��"));
		System.out.println(map.get("�Ӵ���")); //null, ������ �ȳ����� �̰� int���� �������� ����
		//�׷��ϱ�
		//int a = map.get("�Ӵ���"); // ����
		Integer score = map.get("�Ӵ���");
		
		//����
		map.remove("�ּ���");
		map.remove("�ּ���, 60");
		
		System.out.println(map);
	}
}
