package api.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test07 {
public static void main(String[] args) {
	
	//ArrayList = ��ȸ�� ����
	//LinkedList = ������ ����
	//CopyOnWriteArrayList = ArrayList�� thread-safe�����̴�.
	List <String> db  = new CopyOnWriteArrayList<>();
}
}
