package oop.method4;

public class Info {
	String model;
	String telecom;
	int month;
	int won;

	//추가 메소드
	void set(String model, String telecom, int month, int won) {
		this.setModel(model);
		this.setMonth(month);
		this.setTelecom(telecom);
		this.setWon(won);
	}
	// 멤버 메소드
	void setModel(String model) {
		this.model = model;
	}

	/*
	 * void setTelecom(String telecom) { 
	 * if (telecom == "SK" || telecom == "KT" || telecom == "LG") { 
	 * this.telecom = telecom; } 
	 * }
	 */

	void setTelecom(String telecom) {
		switch (telecom) {
		case "SK":
		case "KT":
		case "LG":
			this.telecom = telecom;
		}
	}
	
	/*
	void setMonth(int month) {
		if (month == 24 || month == 30 || month == 36)
			this.month = month;
	}*/

	void setMonth(int month) {
		switch (month) {
		case 24:
		case 30:
		case 36:
			this.month = month;
		}
	}

	void setWon(int won) {
		if (won >= 0) {
			this.won = won;
		}

		/*
		 if (won10k < 0) {
			return; //메소드 중지 키워드. break와 다르다.
		}
		this.won10k = won10k;
		*/
	}

	// 출력
	void result() {
		System.out.println("<판매정보>");
		System.out.println("이름 : " + model);
		System.out.println("통신사 : " + telecom);
		System.out.println("약정개월 : " + month + "개월");
		System.out.println("판매가 : " + won + "원");
	}
}