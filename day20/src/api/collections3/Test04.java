package api.collections3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
		// ��ǥ ���α׷�
		// ���� �濬 ���α׷���
		// ������ ���� �͵��� �⿬�ߴٰ� �����սô�.
		// �ӿ���, ������, �����, BTS, ��Ŵ (�� ����ϰ�)
		// ����ڿ��� ��ǥ�ϰ� ���� ���� �̸��� �Է¹޵��� ����

		Map<String, Integer> singer = new HashMap<>();
		singer.put("�ӿ���", 0);
		singer.put("������", 0);
		singer.put("�����", 0);
		singer.put("BTS", 0);
		singer.put("��Ŵ", 0);

		Scanner sc = new Scanner(System.in);
		
		boolean end = false;
		while(!end){
		System.out.println("�ӿ���, ������, �����, BTS, ��Ŵ �߿� ��ǥ�ϰ� ���� ���� �̸��� �����ּ���... \"�׸�\"�� �Է��ϸ� �����ϴ�.");
		String vote = sc.nextLine();
			if(singer.containsKey(vote)) {
				singer.put(vote, singer.get(vote)+1);
				System.out.println(vote + "���� ��ǥ�߽��ϴ�. ���� " + singer.get(vote) + "ǥ�Դϴ�." );
			}
			else if(vote.equals("�׸�")) {
				System.out.println("��ǥ�� �����մϴ�");
				end = true;
			}
			else {
			System.out.println(vote + "��� ������ �����ϴ�.");
			}
			
		}
		
		Set<String> result = singer.keySet();
		for(String name : result) {
			System.out.println(name + " : " + singer.get(name) + "ǥ");
		}
		
		
	}

}