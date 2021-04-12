package forTeacher;

import java.util.regex.Pattern;

public class Teacher {
	// 멤버 변수
	protected String name;
	protected int subjNo;
	protected String subjName;
	
	protected int total;
	protected double avg;

	// 과연 배열을 멤버변수로 놓을 수 있을까...! 이거 세터 만들어지긴하나?
	protected String[] subjList; // 일단 개수는 만들지 않아야하나?
	int[] subjScore;

	public Teacher() {
		super();
	}
	
	
	
	//메소드
	public void inputSubjList() {
		System.out.println("과목이름을 하나씩 입력하세요");
		for (int i = 0; i < subjNo; i++) {
			System.out.println((i+1) + "번째 과목이름을 입력해주세요.");
			this.subjName = subjName;
			subjList[i] = subjName;
			System.out.println(subjList[i] + "과목이 " + (i + 1) + "번째 과목으로 등록되었습니다");
		}
	}

	// setter
	public void setName(String name) {
		String regexName = "^[가-힣]{2,7}$";
		if (Pattern.matches(regexName, name)) {
		}
		this.name = name;
		System.out.println("학생이름 " + name + "이 등록되었습니다.");
	}

	public void setSubjNo(int subjNo) {
		this.subjNo = subjNo;
		String[] subjList = new String[subjNo]; 
		System.out.println("과목 개수 " + subjNo + "개로 설정되었습니다.");
		//return subList();
	}

	public void setSubjName(String subjName) {
		
	}

	public String getName() {
		return name;
	}

	public int getSubjNo() {
		return subjNo;
	}

	public String getSubjName() {
		return subjName;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public String[] getSubjList() {
		return subjList;
	}

	public int[] getSubjScore() {
		return subjScore;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void setSubjList(String[] subjList) {
		this.subjList = subjList;
	}

	public void setSubjScore(int[] subjScore) {
		this.subjScore = subjScore;
	}

	
}
