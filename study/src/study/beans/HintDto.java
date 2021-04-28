package study.beans;

public class HintDto {
	private int hintNo;
	private String hintContent;
	private int quizNo;
	@Override
	public String toString() {
		return "HintDto [hintNo=" + hintNo + ", hintContent=" + hintContent + ", quizNo=" + quizNo + "]";
	}
	public int getHintNo() {
		return hintNo;
	}
	public void setHintNo(int hintNo) {
		this.hintNo = hintNo;
	}
	public String getHintContent() {
		return hintContent;
	}
	public void setHintContent(String hintContent) {
		this.hintContent = hintContent;
	}
	public int getQuizNo() {
		return quizNo;
	}
	public void setQuizNo(int quizNo) {
		this.quizNo = quizNo;
	}
	public HintDto() {
		super();
	}
}