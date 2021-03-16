package oop.method3;

public class Info {
	// 멤버변수
	String name;
	int people;
	int nonPeak;
	int prePeak;
	int peak;
	int total;
	double avg;
	

	// 추가 메소드
	void set(String name, int people, int nonPeak, int prePeak, int peak) {
		this.setName(name);
		this.setPeople(people);
		this.setNonPeak(nonPeak);
		this.setPrePeak(prePeak);
		this.setPeak(peak);

	}

	// 멤버메소드
	void setName(String name) {
		this.name = name;
	}

	void setPeople(int people) {
		if (people >= 2) {
			this.people = people;
		}
	}

	void setNonPeak(int nonPeak) {
		if (nonPeak >= 0) {
			this.nonPeak = nonPeak;
		}
	}

	void setPrePeak(int prePeak) {
		if (prePeak >= 0) {
			this.prePeak = prePeak;
		}
	}

	void setPeak(int peak) {
		if (peak >= 0) {
			this.peak = peak;
		}
	}

	// 출력


	void result() {
			
		this.total = this.nonPeak + this.prePeak + this.peak;
		this.avg = total/3;
		
		System.out.println("<KH호텔 객실요금>");
		System.out.println("이용인원 : " + this.people + "명");
		System.out.println("비성수기 요금 : " + this.nonPeak + "원");
		System.out.println("준성수기 요금 : " + this.prePeak + "원");
		System.out.println("성수기 요금 : " + this.peak + "원");
	}
}
