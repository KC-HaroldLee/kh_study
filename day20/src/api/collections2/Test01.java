package api.collections2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		//Set : 순서가 내부적으로 정해져 있는 저장소.
				//Treeset, Hashset
				//=빠른 전체 조회를 하기 위해서 
				//일괄처리에활용한다. 따라서 get도 없고 index도 안된다.
				
				//Set<Integer> set = new TreeSet<>();
				Set<Integer> set = new HashSet<>();
				
				//추가
				set.add(25);
				set.add(12);
				set.add(1);
				set.add(15);
				set.add(55);
				set.add(52);
				set.add(11);
				
				//검색
				System.out.println(set.contains(12));
				
				
				
				
				//출력
				System.out.println(set);
				
				System.out.println(set.size());
				
				
			}
		}