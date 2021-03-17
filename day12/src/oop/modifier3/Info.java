package oop.modifier3;

public class Info {
	// 멤버변수 +private
	private String name;
	private int timeStart;
	private int timeEnd;
	private int fairAdult;
	private int fairKid;

	// 멤버 메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setTimeStart(int timeStart) {
		if (timeStart > 0 && timeStart <= 2359 && timeStart % 100 < 60) {
			this.timeStart = timeStart;
		}
	}

	public void setTimeEnd(int timeEnd) {
		if (timeEnd > 0 && timeEnd <= 2359 && timeStart % 100 < 60) {
			this.timeEnd = timeEnd;
		}
	}

	public void setFairAdult(int fairAdult) {
		if (fairAdult > 0) {
			this.fairAdult = fairAdult;
		}
	}

	public void setFairKid(int fairKid) {
		if (fairKid > 0) {
			this.fairKid = fairKid;
		}
	}

	public void set(String name, int timeStart, int timeEnd, int fairAdult, int fairKid) {
		this.setName(name);
		this.setTimeStart(timeStart);
		this.setTimeEnd(timeEnd);
		this.setFairAdult(fairAdult);
		this.setFairKid(fairKid);

	}
	// 출력 메소드

	public void result() {
		System.out.println("<스키장 이용요금>");

		System.out.println("이용권 이름 : " + name); // this 빼도 됨

		if (timeStart < 1000) {
			System.out.println("시작시간 : 0" + this.timeStart);
		} else {
			System.out.println("시작시간 : " + this.timeStart);
		}

		if (timeEnd < 1000) {
			System.out.println("종료시간 : 0" + this.timeEnd);
		} else {
			System.out.println("종료시간 : " + this.timeEnd);
		}

		System.out.println("대인요금 : " + this.fairAdult);

		System.out.println("소인요금 : " + this.fairKid);

	}

	// getter 메소드
	public String getName() {
		return this.name;
	}

	public int getTimeStart() {
		return this.timeStart;
	}

	public int GetTimeEnd() {
		return this.timeEnd;
	}

	public int GetFairAdult() {
		return this.fairAdult;
	}

	public int GetFairKid() {
		return this.fairKid;
	}

	public void cha() {
		System.out.println(timeEnd - timeStart);
	}
}
