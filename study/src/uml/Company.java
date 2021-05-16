package uml;

//회사는 다음 구성요소를 가져와야한다. (을 소유해야한다.)
//판매점 : 회사설립 시 생성
//판매직원  : 설립 전부터 존재
public class Company {
	private Seller seller;
	private Person person;
	
	public Company (Person person) {
		this.seller = new Seller();
		this.person = person; // 아 이거 변수지... ()은 메소드니까 빼야했다.
		//오답 : this.person = person();
				
	}
}
	