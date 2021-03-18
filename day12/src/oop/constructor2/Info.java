package oop.constructor2;

public class Info {
	// 멤버변수
	private String id;
	private String type;
	private int lv;
	private int money;

	// 필수로 있어야 하는 것(?)
	// 1. 아이디, 직업만 설정하는 생성자
	/*public Info(String id, String type) {
		this.setId(id);
		this.setType(type);
		this.setLv(1);
		this.setMoney(0);
	}*/
	
	public Info (String id, String type){
		this(id, type, 1 , 0); // 생성자 연계 코드
		}

	// 다 있는 것()?
	// 2. 전부 다 설정하는 생성자
	public Info(String id, String type, int lv, int money) {
		this.setId(id);
		this.setType(type);
		this.setLv(lv);
		this.setMoney(money);
	}

	// 자동 생성 했지만 set 끼리 뭉칠게
	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {

		if (type == "전사" || type == "마법사" || type == "궁수") {
			this.type = type;
		}
	}

	public void setLv(int lv) {
		if (lv > 0) {
			this.lv = lv;
		} else {
			return;
		}
	}

	public void setMoney(int money) {
			this.money = money;
	}

	
	
	// getter method
	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public int getLv() {
		return lv;
	}

	public int getMoney() {
		return money;
	}

	// 가상 getter 메소드

	double score() { // 레벨 대비 돈
		return money / lv;
	}

	// 추가메소드
	void levelUp() {
		this.lv++;
	}
	
	void levelUp(int lv) {
		this.lv+= lv;
	}
	
	// 출력
	public void result() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 : " + id);
		System.out.println("직업  : " + type);
		System.out.println("레벨 : " + lv);
		System.out.println("소지금 : " + money + "원");

	}
}
