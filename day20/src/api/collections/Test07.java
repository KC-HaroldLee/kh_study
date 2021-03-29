package api.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test07 {
public static void main(String[] args) {
	
	//ArrayList = 조회가 빠름
	//LinkedList = 수정이 편함
	//CopyOnWriteArrayList = ArrayList의 thread-safe버전이다.
	List <String> db  = new CopyOnWriteArrayList<>();
}
}
